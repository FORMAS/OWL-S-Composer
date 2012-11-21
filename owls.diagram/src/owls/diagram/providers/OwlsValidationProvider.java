package owls.diagram.providers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ITraversalStrategy;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;

import owls.OwlsAssign;
import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.diagram.expressions.OwlsAbstractExpression;
import owls.diagram.part.OwlsDiagramEditorPlugin;
import owls.diagram.part.OwlsVisualIDRegistry;
import owls.diagram.part.ValidateAction;

/**
 * @generated
 */
public class OwlsValidationProvider extends AbstractContributionItemProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	protected IAction createAction(String actionId,
			IWorkbenchPartDescriptor partDescriptor) {
		if (ValidateAction.VALIDATE_ACTION_KEY.equals(actionId)) {
			return new ValidateAction(partDescriptor);
		}
		return super.createAction(actionId, partDescriptor);
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(View view, Runnable op) {
		final Runnable fop = op;
		Runnable task = new Runnable() {

			public void run() {
				try {
					constraintsActive = true;
					fop.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		TransactionalEditingDomain txDomain = TransactionUtil
				.getEditingDomain(view);
		if (txDomain != null) {
			try {
				txDomain.runExclusive(task);
			} catch (Exception e) {
				OwlsDiagramEditorPlugin.getInstance().logError(
						"Validation action failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& OwlsCompositeProcessEditPart.MODEL_ID
							.equals(OwlsVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	static final Map semanticCtxIdMap = new HashMap();

	/**
	 * @generated
	 */
	public static class DefaultCtx1 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @generated
	 */
	public static ITraversalStrategy getNotationTraversalStrategy(
			IBatchValidator validator) {
		return new CtxSwitchStrategy(validator);
	}

	/**
	 * @generated
	 */
	private static class CtxSwitchStrategy implements ITraversalStrategy {

		/**
		 * @generated
		 */
		private ITraversalStrategy defaultStrategy;

		/**
		 * @generated
		 */
		private String currentSemanticCtxId;

		/**
		 * @generated
		 */
		private boolean ctxChanged = true;

		/**
		 * @generated
		 */
		private EObject currentTarget;

		/**
		 * @generated
		 */
		private EObject preFetchedNextTarget;

		/**
		 * @generated
		 */
		CtxSwitchStrategy(IBatchValidator validator) {
			this.defaultStrategy = validator.getDefaultTraversalStrategy();
		}

		/**
		 * @generated
		 */
		public void elementValidated(EObject element, IStatus status) {
			defaultStrategy.elementValidated(element, status);
		}

		/**
		 * @generated
		 */
		public boolean hasNext() {
			return defaultStrategy.hasNext();
		}

		/**
		 * @generated
		 */
		public boolean isClientContextChanged() {
			if (preFetchedNextTarget == null) {
				preFetchedNextTarget = next();
				prepareNextClientContext(preFetchedNextTarget);
			}
			return ctxChanged;
		}

		/**
		 * @generated
		 */
		public EObject next() {
			EObject nextTarget = preFetchedNextTarget;
			if (nextTarget == null) {
				nextTarget = defaultStrategy.next();
			}
			this.preFetchedNextTarget = null;
			return this.currentTarget = nextTarget;
		}

		/**
		 * @generated
		 */
		public void startTraversal(Collection traversalRoots,
				IProgressMonitor monitor) {
			defaultStrategy.startTraversal(traversalRoots, monitor);
		}

		/**
		 * @generated
		 */
		private void prepareNextClientContext(EObject nextTarget) {
			if (nextTarget != null && currentTarget != null) {
				if (nextTarget instanceof View) {
					String id = ((View) nextTarget).getType();
					String nextSemanticId = id != null
							&& semanticCtxIdMap.containsKey(id) ? id : null;
					if ((currentSemanticCtxId != null && !currentSemanticCtxId
							.equals(nextSemanticId))
							|| (nextSemanticId != null && !nextSemanticId
									.equals(currentSemanticCtxId))) {
						this.ctxChanged = true;
					}
					currentSemanticCtxId = nextSemanticId;
				} else {
					// context of domain model
					this.ctxChanged = currentSemanticCtxId != null;
					currentSemanticCtxId = null;
				}
			} else {
				this.ctxChanged = false;
			}
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter1 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		private OwlsAbstractExpression expression;

		/**
		 * @generated
		 */
		public Adapter1() {
			expression = new OwlsAbstractExpression(OwlsPackage.eINSTANCE
					.getOwlsAssign()) {

				protected Object doEvaluate(Object context, Map env) {
					OwlsAssign self = (OwlsAssign) context;
					return JavaAudits.InputCheck(self);
				}
			};
		}

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Object evalCtx = ctx.getTarget();
			Object result = expression.evaluate(evalCtx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { EMFCoreUtil
					.getQualifiedName(ctx.getTarget(), true) });
		}
	}

	/**
	 * @generated
	 */
	static class JavaAudits {

		/**
		 * @generated NOT
		 */
		private static java.lang.Boolean InputCheck(OwlsAssign self) {
			EObject rootElement = getRootElement((OwlsProcess) self
					.eContainer());
			TreeIterator it = rootElement.eAllContents();
			while (it.hasNext()) {
				Object object = it.next();
				if (object instanceof OwlsAssign) {
					OwlsAssign element = (OwlsAssign) object;
					if (((element.getInputTarget() != null) && (self
							.getInputTarget() != null))
							&& (!(self.equals(element)))) {
						if ((element.getInputTarget().equals(self
								.getInputTarget()))
								&& (element.getTarget()
										.equals(self.getTarget()))) {
							return false;
						}
					}
				}
			}
			return true;
		}

		/**
		 * @generated NOT
		 */
		private static EObject getRootElement(OwlsProcess self) {
			EObject rootElement = self;
			while (rootElement.eContainer() != null) {
				rootElement = rootElement.eContainer();
			}
			return rootElement;
		}
	}
}
