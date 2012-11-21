package owls.diagram.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;

import owls.impl.OwlsAnyOrderImpl;
import owls.impl.OwlsCompositeProcessImpl;
import owls.impl.OwlsSequenceImpl;
import owls.impl.OwlsSplitImpl;

public class OwlsCompositeCreationEditPolicy extends CreationEditPolicy{

	/**
	 * Determines if a semantic reparent is being performed.
	 * @param element element being reparented
	 * @param newContext the new container element
	 * @return <tt>true</tt> if the supplied elemnet's container is
	 * not equals to the supplied <code>newContext</code>.\; otherwise <tt>false</tt>.
	 */
	@Override
	protected boolean shouldReparent( EObject element, EObject newContext ) {
		return !(element == null ||
				element == newContext ||
				element.eContainer() == newContext ||
				((element instanceof OwlsSplitImpl) && (newContext instanceof OwlsCompositeProcessImpl)) ||
				((element instanceof OwlsAnyOrderImpl) && (newContext instanceof OwlsCompositeProcessImpl)) ||
				((element instanceof OwlsSequenceImpl) && (newContext instanceof OwlsCompositeProcessImpl)) ||
				isContainedIn( element, newContext )
				);
	}
	
	/*
	 * This method checks to see element's containment tree already includes
	 * itself.  This is necessary to prevent cyclic graphs in the model that
	 * cause StackOverflowExceptions.
	 */
	private boolean isContainedIn( EObject element, EObject newContext )
	{
		EObject container = newContext.eContainer();
		while( container != null ) {
			if( container.equals(element) )
				return true;
			container = container.eContainer();
		}
		return false;
	}
	
}
