package owls.diagram.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gmf.runtime.diagram.core.commands.AddCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;

import owls.diagram.edit.commands.CompartmentRepositionEObjectCommand;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;

public class CompartmentEditPolicy extends FlowLayoutEditPolicy
{

	private EStructuralFeature feature = null;

	protected Command createAddCommand(EditPart child, EditPart after) {
		List realChildren = getHost().getChildren();
		List children = new ArrayList();
		children.addAll(realChildren);
		
		List removedChildrens = new ArrayList();
		for (Object object : children) {
			EditPart editPart = (EditPart) object;
			if ((editPart instanceof OwlsInputClientMessageEditPart) || 
					(editPart instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(editPart);
			}
		}
		children.removeAll(removedChildrens);
		
		int index = children.indexOf(after);
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		AddCommand command = new AddCommand(editingDomain, new EObjectAdapter((View)getHost().getModel()),
				new EObjectAdapter((View)child.getModel()), index);
		return new ICommandProxy(command);
	}

	protected EditPolicy createChildEditPolicy(EditPart child) {
		ResizableEditPolicyEx policy = new ResizableEditPolicyEx();
		policy.setResizeDirections(0);
		return policy;
	}

	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		
		List realChildren = getHost().getChildren();
		List children = new ArrayList();
		children.addAll(realChildren);
		
		List removedChildrens = new ArrayList();
		for (Object object : children) {
			EditPart editPart = (EditPart) object;
			if ((editPart instanceof OwlsInputClientMessageEditPart) || 
					(editPart instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(editPart);
			}
		}
		children.removeAll(removedChildrens);

		int newIndex;
		int displacement;

		int childIndex = children.indexOf(child);
		int afterIndex = children.indexOf(after);	

		if(afterIndex == -1) {
			newIndex = children.size()-1;			
			displacement = newIndex - childIndex;
		} else {		
			newIndex = afterIndex;
			displacement = afterIndex - childIndex;
			if (childIndex <= afterIndex) {
				newIndex--;
				displacement--;			
			}
		}

		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();

		RepositionEObjectCommand command = new CompartmentRepositionEObjectCommand(child, editingDomain, "", 
				(EList)((View)child.getParent().getModel()).getElement().eGet(feature), 
				((View)child.getModel()).getElement(), 
				displacement, newIndex);	

		//TODO ev. reintroduce target feedback (actual problem: line is not deleted after dropping)
		eraseLayoutTargetFeedback(null);

		return new ICommandProxy(command);
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getOrphanChildrenCommand(Request request) {
		return null;
	}
	
	@Override
	protected Command getMoveChildrenCommand(Request request) {
		CompoundCommand command = new CompoundCommand();
		List realEditParts = ((ChangeBoundsRequest)request).getEditParts();
		List editParts = new ArrayList();
		editParts.addAll(realEditParts);
		
		List removedChildrens = new ArrayList();
		for (Object object : editParts) {
			EditPart editPart = (EditPart) object;
			if ((editPart instanceof OwlsInputClientMessageEditPart) || 
					(editPart instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(editPart);
			}
		}
		editParts.removeAll(removedChildrens);	
		
		EditPart insertionReference = getInsertionReference(request);
		for (int i = 0; i < editParts.size(); i++) {
			EditPart child = (EditPart)editParts.get(i);
			command.add(createMoveChildCommand(child, insertionReference));
		}
		return command.unwrap();
	}
	
	@Override
	protected EditPart getInsertionReference(Request request) {
		List realChildren = getHost().getChildren();
		List children = new ArrayList();
		children.addAll(realChildren);
		
		List removedChildrens = new ArrayList();
		for (Object object : children) {
			EditPart child = (EditPart) object;
			if ((child instanceof OwlsInputClientMessageEditPart) || 
					(child instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(child);
			}
		}
		children.removeAll(removedChildrens);

		if (request.getType().equals(RequestConstants.REQ_CREATE)) {
			int i = getFeedbackIndexFor(request);
			if (i == -1)
				return null;
			return (EditPart)children.get(i);
		}

		int index = getFeedbackIndexFor(request);
		if (index != -1) {
			List selection = getHost().getViewer().getSelectedEditParts();
			do {
				EditPart editpart = (EditPart) children.get(index);
				if (!selection.contains(editpart))
					return editpart;
			} while (++index  < children.size());
		}
		return null; //Not found, add at the end.
	}
	
	@Override
	protected int getFeedbackIndexFor(Request request) {
		List realChildren = getHost().getChildren();
		List children = new ArrayList();
		children.addAll(realChildren);
		
		List removedChildrens = new ArrayList();
		for (Object object : children) {
			EditPart child = (EditPart) object;
			if ((child instanceof OwlsInputClientMessageEditPart) || 
					(child instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(child);
			}
		}
		children.removeAll(removedChildrens);
		
		if (children.isEmpty())
			return -1;
			
		Transposer transposer = new Transposer();
		transposer.setEnabled (!isHorizontal());
		
		Point p = transposer.t(getLocationFromRequest(request));

		// Current row bottom, initialize to above the top.
		int rowBottom = Integer.MIN_VALUE;
		int candidate = -1;
		for (int i = 0; i < children.size(); i++) {
			EditPart child = (EditPart) children.get(i);
			Rectangle rect = transposer.t(getAbsoluteBounds(((GraphicalEditPart)child)));
			if (rect.y > rowBottom) {
				/*
				 * We are in a new row, so if we don't have a candidate but yet are within the
				 * previous row, then the current entry becomes the candidate. This is because
				 * we know we must be to the right of center of the last Figure in the
				 * previous row, so this Figure (which is at the start of a new row) is the
				 * candidate.
				 */
				if (p.y <= rowBottom) {
					if (candidate == -1)
						candidate = i;
					break;
				} else
					candidate = -1; // Mouse's Y is outside the row, so reset the candidate
			}
			rowBottom = Math.max(rowBottom, rect.bottom());
			if (candidate == -1) {
				/*
				 * See if we have a possible candidate. It is a candidate if the cursor is
				 * left of the center of this candidate.
				 */
				if (p.x <= rect.x + (rect.width / 2))
					candidate = i;
			}
			if (candidate != -1) {
				// We have a candidate, see if the rowBottom has grown to include the mouse Y.
				if (p.y <= rowBottom) {
					/*
					 * Now we have determined that the cursor.Y is above the bottom of the
					 * current row of figures. Stop now, to prevent the next row from being
					 * searched
					 */
					break;
				}
			}
		}
		return candidate;
	}
	
	protected void showLayoutTargetFeedback(Request request) {
		List realChildren = getHost().getChildren();
		List children = new ArrayList();
		children.addAll(realChildren);
		
		List removedChildrens = new ArrayList();
		for (Object object : children) {
			EditPart child = (EditPart) object;
			if ((child instanceof OwlsInputClientMessageEditPart) || 
					(child instanceof OwlsOutputClientMessageEditPart)) {
				removedChildrens.add(child);
			}
		}
		children.removeAll(removedChildrens);
		
		if (children.size() == 0)
			return;
		Polyline fb = getLineFeedback();
		Transposer transposer = new Transposer();
		transposer.setEnabled(!isHorizontal());
		
		boolean before = true;
		int epIndex = getFeedbackIndexFor(request);
		Rectangle r = null;
		if (epIndex == -1) {
			before = false;
			epIndex = children.size() - 1;
			EditPart editPart = (EditPart) children.get(epIndex);
			r = transposer.t(getAbsoluteBounds((GraphicalEditPart)editPart));
		} else {
			EditPart editPart = (EditPart) children.get(epIndex);
			r = transposer.t(getAbsoluteBounds((GraphicalEditPart)editPart));
			Point p = transposer.t(getLocationFromRequest(request));
			if (p.x <= r.x + (r.width / 2))
				before = true;
			else {
				/*
				 * We are not to the left of this Figure, so the emphasis line needs to be to
				 * the right of the previous Figure, which must be on the previous row.
				 */
				before = false;
				epIndex--;
				editPart = (EditPart) children.get(epIndex);
				r = transposer.t(getAbsoluteBounds((GraphicalEditPart)editPart));
			}
		}
		int x = Integer.MIN_VALUE;
		if (before) {
			/* 
			 * Want the line to be halfway between the end of the previous and the beginning
			 * of this one. If at the begining of a line, then start halfway between the left
			 * edge of the parent and the beginning of the box, but no more than 5 pixels (it
			 * would be too far and be confusing otherwise).
			 */
			if (epIndex > 0) {
				// Need to determine if a line break.
				Rectangle boxPrev = transposer.t(
					getAbsoluteBounds(
						(GraphicalEditPart) children.get(epIndex - 1)));
				int prevRight = boxPrev.right();
				if (prevRight < r.x) {
					// Not a line break
					x = prevRight + (r.x - prevRight) / 2;
				} else if (prevRight == r.x) {
					x = prevRight + 1;
				}
			}
			if (x == Integer.MIN_VALUE) {
				// It is a line break.
				Rectangle parentBox = transposer.t(
					getAbsoluteBounds((GraphicalEditPart)getHost()));
				x = r.x - 5;
				if (x < parentBox.x)
					x = parentBox.x + (r.x - parentBox.x) / 2;
			}
		} else {
			/* 
			 * We only have before==false if we are at the end of a line, so go halfway
			 * between the right edge and the right edge of the parent, but no more than 5
			 * pixels.
			 */
			Rectangle parentBox = transposer.t(
				getAbsoluteBounds((GraphicalEditPart)getHost()));
			int rRight = r.x + r.width;
			int pRight = parentBox.x + parentBox.width;
			x = rRight + 5;
			if (x > pRight)
				x = rRight + (pRight - rRight) / 2;
		}
		Point p1 = new Point(x, r.y - 4);
		p1 = transposer.t(p1);
		fb.translateToRelative(p1);
		Point p2 = new Point(x, r.y + r.height + 4);
		p2 = transposer.t(p2);
		fb.translateToRelative(p2);
		fb.setPoint(p1, 0);
		fb.setPoint(p2, 1);
	}
	
	private Point getLocationFromRequest(Request request) {
		return ((DropRequest)request).getLocation();
	}
	
	private Rectangle getAbsoluteBounds(GraphicalEditPart ep) {
		Rectangle bounds = ep.getFigure().getBounds().getCopy();
		ep.getFigure().translateToAbsolute(bounds);
		return bounds;
	}

	/**
	 * @param feature has to be an EList
	 */
	public CompartmentEditPolicy(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

}


