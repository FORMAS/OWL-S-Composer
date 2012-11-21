package owls.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import owls.cloud.DescriptorKB;
import owls.facade.OwlsInitializerFacade;

/**
 * @generated
 */
public class OwlsCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected OwlsCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected OwlsCreationWizardPage domainModelFilePage;

	/**
	 * @generated NOT
	 */
	protected OwlsSelectionWizardPage importsFilePage;

	/**
	 * @generated NOT
	 */
	protected OwlsInitializationWizardPage attributesFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.OwlsCreationWizardTitle);
		setDefaultPageImageDescriptor(OwlsDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewOwlsWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {

		// Set the attributes of the main Composite Process. 
		attributesFilePage = new OwlsInitializationWizardPage();
		addPage(attributesFilePage);

		// Select files to include in the composition.
		importsFilePage = new OwlsSelectionWizardPage(getWorkbench(),
				getSelection());
		addPage(importsFilePage);

		diagramModelFilePage = new OwlsCreationWizardPage(
				"DiagramModelFile", getSelection(), "owls_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.OwlsCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.OwlsCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {

		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				
				//Create the initialization object and set the indicated page's values. 
				OwlsInitializerFacade facade = new OwlsInitializerFacade();
				attributesFilePage.setInitializationValues(facade);
				importsFilePage.setSelectedFiles(facade);
				
				diagram = OwlsDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), facade, monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						OwlsDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.OwlsCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
			String workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			String filename = attributesFilePage.getServiceText();
			String filePath = diagramModelFilePage.getFilePath().removeLastSegments(1).toString();
			System.out.println("CRIANDO DOCUMENTO: "+filePath+"/"+filename+".cpd");
			DescriptorKB descriptorKB = new DescriptorKB(filePath+"/"+filename+".cpd", importsFilePage.descriptorsList);
			descriptorKB.createDescriptorKB();
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.OwlsCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				OwlsDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
