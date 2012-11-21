package owls.diagram.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

import owls.diagram.edit.parts.OwlsInputClientMessageEditPart.OwlsInputClientMessagesFigure;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart.OwlsOutputClientMessagesFigure;

public class BorderItemLocatorEx extends BorderItemLocator{

	public BorderItemLocatorEx(IFigure parentFigure, int preferredSide) {
		super(parentFigure, preferredSide);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Locator#relocate(org.eclipse.draw2d.IFigure)
	 */
	public void relocate(IFigure borderItem) {
		if (borderItem.getChildren().get(0) instanceof OwlsInputClientMessagesFigure) {
			setPreferredSideOfParent(PositionConstants.TOP);
			
			Rectangle parentRect = getParentBorder().getCopy();
			Point ptNewLocation = new Point (parentRect.getTop().x - 40,
					parentRect.getTop().y - 70);
			borderItem.setLocation(ptNewLocation);

			setCurrentSideOfParent(PositionConstants.TOP);
		}
		else{
			if (borderItem.getChildren().get(0) instanceof OwlsOutputClientMessagesFigure) {
				setPreferredSideOfParent(PositionConstants.BOTTOM);

				Rectangle parentRect = getParentBorder().getCopy();
				Point ptNewLocation = new Point (parentRect.getBottom().x - 40,
						parentRect.getBottom().y + 30);
				borderItem.setLocation(ptNewLocation);

				setCurrentSideOfParent(PositionConstants.BOTTOM);
			}
			else {
				super.relocate(borderItem);
			}
		}
	}

}
