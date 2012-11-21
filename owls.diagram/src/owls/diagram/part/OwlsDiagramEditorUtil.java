package owls.diagram.part;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.InputList;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.process.OutputList;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import owls.Owls;
import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsFactory;
import owls.OwlsInput;
import owls.OwlsOntology;
import owls.OwlsOutput;
import owls.OwlsProcess;
import owls.OwlsProfile;
import owls.OwlsService;
import owls.OwlsWsdlGrounding;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.facade.OwlsInitializerFacade;
import owls.facade.OwlsKBFacade;
import owls.facade.OwlsParameterFacade;
import owls.impl.OwlsFactoryImpl;

/**
 * @generated
 */
public class OwlsDiagramEditorUtil {

	/**
	 * @generated
	 */
	public static Map getSaveOptions() {
		Map saveOptions = new HashMap();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	/**
	 * @generated
	 */
	public static boolean openDiagram(Resource diagram)
			throws PartInitException {
		String path = diagram.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			return null != page.openEditor(new FileEditorInput(
					(IFile) workspaceResource), OwlsDiagramEditor.ID);
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static void setCharset(IFile file) {
		if (file == null) {
			return;
		}
		try {
			file.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Unable to set charset for file " + file.getFullPath(), e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}

	/**
	 * Runs the wizard in a dialog.
	 * 
	 * @generated
	 */
	public static void runWizard(Shell shell, Wizard wizard, String settingsKey) {
		IDialogSettings pluginDialogSettings = OwlsDiagramEditorPlugin
				.getInstance().getDialogSettings();
		IDialogSettings wizardDialogSettings = pluginDialogSettings
				.getSection(settingsKey);
		if (wizardDialogSettings == null) {
			wizardDialogSettings = pluginDialogSettings
					.addNewSection(settingsKey);
		}
		wizard.setDialogSettings(wizardDialogSettings);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
				500);
		dialog.open();
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @generated
	 */
	public static Resource createDiagram(URI diagramURI, URI modelURI,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.OwlsDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.OwlsDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				OwlsCompositeProcess model = createInitialModel();
				attachModelToResource(model, modelResource);

				Diagram diagram = ViewService.createDiagram(model,
						OwlsCompositeProcessEditPart.MODEL_ID,
						OwlsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource.save(owls.diagram.part.OwlsDiagramEditorUtil
							.getSaveOptions());
					diagramResource
							.save(owls.diagram.part.OwlsDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					OwlsDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static OwlsCompositeProcess createInitialModel() {
		return OwlsFactory.eINSTANCE.createOwlsCompositeProcess();
	}

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @generated NOT
	 */
	public static Resource createDiagram(URI diagramURI,
			final OwlsInitializerFacade facade, IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.OwlsDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.OwlsDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				OwlsCompositeProcess model = createInitialModel(facade);
				attachModelToResource(model, diagramResource);

				Diagram diagram = ViewService.createDiagram(model,
						OwlsCompositeProcessEditPart.MODEL_ID,
						OwlsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {

					diagramResource
							.save(owls.diagram.part.OwlsDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					OwlsDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}

		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	/**
	 * 
	 * @param createFileURI
	 * @param facade
	 * @param owlsComposite
	 * @generated NOT
	 */
	public static Resource createSimilarDiagram(final URI diagramURI,
			final OwlsInitializerFacade facade, final OwlsCompositeProcess owlsComposite,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(Messages.OwlsDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet().createResource(diagramURI);
		final String diagramName = diagramURI.lastSegment();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.OwlsDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				Diagram diagram = (Diagram)owlsComposite.eResource().getContents().get(1);
				diagram.setName(diagramName);
				
				OwlsCompositeProcess model = createSimilarModel(facade, owlsComposite);
				attachModelToResource(model, diagramResource);
				
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {

					diagramResource
							.save(owls.diagram.part.OwlsDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					OwlsDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}

			
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}

		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;

	}

	/**
	 * 
	 * @param facade
	 * @param owlsComposite
	 * @return
	 * @generated NOT
	 */
	private static OwlsCompositeProcess createSimilarModel(OwlsInitializerFacade facade,
			OwlsCompositeProcess similarOwlsComposite) {
		OwlsCompositeProcess rootProcess = OwlsFactory.eINSTANCE.createOwlsCompositeProcess();
		rootProcess = similarOwlsComposite;
		initializeSimilarModel(rootProcess, facade);
		return rootProcess;
	}
	
	/**
	 * 
	 * @param rootProcess
	 * @param facade
	 * @param similarOwlsComposite
	 * @generated NOT
	 */
	private static void initializeSimilarModel(
			OwlsCompositeProcess rootProcess, OwlsInitializerFacade facade) {
		OwlsFactoryImpl factory = new OwlsFactoryImpl();
		rootProcess.setID(facade.getMainProcessName() + "Process");
				
		
		for (int i = 0; i < facade.getMainProcessInputs().size(); i++) {
			OwlsParameterFacade parameter = facade.getMainProcessInputs()
					.get(i);
			OwlsInput input = rootProcess.getHasInputs().get(i);
			input.setID(parameter.getParameterName());
			input.setParameterType(parameter.getParameterType());
//			rootProcess.getHasInputs().add(input);
		}
		
		
		for (int i = 0; i < facade.getMainProcessOutputs().size(); i++) {
			OwlsParameterFacade parameter = facade.getMainProcessOutputs().get(
					i);
			OwlsOutput output = rootProcess.getHasOutputs().get(i);
			output.setID(parameter.getParameterName());
			output.setParameterType(parameter.getParameterType());
//			rootProcess.getHasOutputs().add(output);
		}
		
		
		OwlsService service = factory.createOwlsService();
		service.setID(facade.getMainProcessName() + "Service");
		service.setDescribedBy(rootProcess);
		rootProcess.setDescribes(service);

		OwlsWsdlGrounding grounding = factory.createOwlsWsdlGrounding();
		grounding.setID(facade.getMainProcessName() + "Grounding");
		grounding.setSupportedBy(service);
		service.setSupports(grounding);

		OwlsProfile profile = factory.createOwlsProfile();
		profile.setIsPresentedBy(service);
		profile.setID(facade.getMainProcessName() + "Profile");
		profile.setServiceName(facade.getMainProcessName());
		profile.setHasProcess(rootProcess);
		service.setPresents(profile);

		OwlsOntology ontology = factory.createOwlsOntology();		
		for (int i = 0; i < facade.getComposedFiles().size(); i++) {
			File file = facade.getComposedFiles().get(i);
			IPath path = new Path(file.getAbsolutePath());
			String servicePath = path.toOSString();
			ontology.getImports().add(servicePath);
		}
		List<OwlsProcess> processes = rootProcess.getComposedOf().getProcesses();
		for (int j = 0; j < processes.size(); j++) {
			OwlsProcess owlsProcess = processes.get(j);
			String processName = facade.getComposedFiles().get(j).getName();
			
			File file = facade.getComposedFiles().get(j);
			IPath path = new Path(file.getAbsolutePath());
			String servicePath = path.toOSString();			
			Service aService = getServiceForImport(servicePath);
			Process aProcess = aService.getProcess();
			owlsProcess.setProcessURI(aProcess.getURI().toString());
			owlsProcess.setLabel(aProcess.getLabel());
			setInputs(owlsProcess, aProcess, factory);
			setOutputs(owlsProcess, aProcess, factory);
			
			OwlsControlConstruct cc = (OwlsControlConstruct) owlsProcess
				.eContainer();
			cc.getElements().add(owlsProcess);
			
			processName = processName.substring(0, processName.indexOf(".owl"))+"AtomicProcess";			
			owlsProcess.setID(processName);
//			owlsProcess.setDescribes(value)
		}

//		rootProcess.getDescribes().getOwnedBy().setNamespace(facade.getProcessNamespace());
		Owls owls = factory.createOwls();
		owls.setNamespace(facade.getProcessNamespace());
		owls.setProcess(rootProcess);
		owls.setOntology(ontology);
		owls.setProfile(profile);
		owls.setService(service);
		service.setOwnedBy(owls);

		return;
	}

	/**
	 * @generated NOT
	 */
	private static void setInputs(OwlsProcess self, Process aProcess, OwlsFactoryImpl factory) {
		InputList inputList = aProcess.getInputs();
		for (Object inObject : inputList) {
			Input input = (Input) inObject;
			OwlsInput newInput = factory.createOwlsInput();
			newInput.setID(input.getLocalName());
			newInput.setLabel(input.getLabel());
			newInput.setParameterType(input.getParamType().toString());
			self.getHasInputs().add(newInput);
		}
	} 
	
	/**
	 * @generated NOT
	 */
	private static void setOutputs(OwlsProcess self, Process aProcess, OwlsFactoryImpl factory) {
		OutputList outputList = aProcess.getOutputs();
		for (Object OutObject : outputList) {
			Output output = (Output) OutObject;
			OwlsOutput newOutput = factory.createOwlsOutput();
			newOutput.setID(output.getLocalName());
			newOutput.setLabel(output.getLabel());
			newOutput
					.setParameterType(output.getParamType().toString());
			self.getHasOutputs().add(newOutput);
		}
	}
	
	/**
	 * 
	 * @param object
	 * @return
	 * @generated NOT
	 */
	private static Service getServiceForImport(Object object) {

		Service aService = null;

		// create the URI of a known service for us to read in
		File file = new File(object.toString());
		try {
			URL aURL = file.toURI().toURL();
			String url = aURL.toString();
			aService = OwlsKBFacade.getKb().readService(url);
		} catch (MalformedURLException e1) {
			
		} catch (FileNotFoundException e2) {

		} catch (URISyntaxException e3) {

		}

		return aService;
	}

	/**
	 * Create a new instance of domain element associated with canvas. <!--
	 * begin-user-doc --> This method was modified to initialize the features of
	 * the main process of the diagram. Until now, the GMF do not have any
	 * support to create it through the gmfmap. <!-- end-user-doc -->
	 * 
	 * @param facade
	 * @generated NOT
	 */
	private static OwlsCompositeProcess createInitialModel(
			OwlsInitializerFacade facade) {
		OwlsCompositeProcess rootProcess = OwlsFactory.eINSTANCE
				.createOwlsCompositeProcess();
		initializeModel(rootProcess, facade);
		return rootProcess;
	}

	/**
	 * Set values entered in the first page of the Create Owls Diagram Wizard.
	 * 
	 * @param facade
	 * @generated NOT
	 */
	private static void initializeModel(OwlsCompositeProcess rootProcess,
			OwlsInitializerFacade facade) {

		OwlsFactoryImpl factory = new OwlsFactoryImpl();

		rootProcess.setID(facade.getMainProcessName() + "Process");
		for (int i = 0; i < facade.getMainProcessInputs().size(); i++) {
			OwlsParameterFacade parameter = facade.getMainProcessInputs()
					.get(i);
			OwlsInput input = factory.createOwlsInput();
			input.setID(parameter.getParameterName());
			input.setParameterType(parameter.getParameterType());
			rootProcess.getHasInputs().add(input);
		}
		for (int i = 0; i < facade.getMainProcessOutputs().size(); i++) {
			OwlsParameterFacade parameter = facade.getMainProcessOutputs().get(
					i);
			OwlsOutput output = factory.createOwlsOutput();
			output.setID(parameter.getParameterName());
			output.setParameterType(parameter.getParameterType());
			rootProcess.getHasOutputs().add(output);
		}

		OwlsService service = factory.createOwlsService();
		service.setID(facade.getMainProcessName() + "Service");
		service.setDescribedBy(rootProcess);
		rootProcess.setDescribes(service);

		OwlsWsdlGrounding grounding = factory.createOwlsWsdlGrounding();
		grounding.setID(facade.getMainProcessName() + "Grounding");
		grounding.setSupportedBy(service);
		service.setSupports(grounding);

		OwlsProfile profile = factory.createOwlsProfile();
		profile.setIsPresentedBy(service);
		profile.setID(facade.getMainProcessName() + "Profile");
		profile.setServiceName(facade.getMainProcessName());
		profile.setHasProcess(rootProcess);
		service.setPresents(profile);

		OwlsOntology ontology = factory.createOwlsOntology();
		for (int i = 0; i < facade.getComposedFiles().size(); i++) {
			File file = facade.getComposedFiles().get(i);
			IPath path = new Path(file.getAbsolutePath());
			String servicePath = path.toOSString();
			ontology.getImports().add(servicePath);
		}

		Owls owls = factory.createOwls();
		owls.setNamespace(facade.getProcessNamespace());
		owls.setProcess(rootProcess);
		owls.setOntology(ontology);
		owls.setProfile(profile);
		owls.setService(service);
		service.setOwnedBy(owls);

		return;
	}

	/**
	 * Store model element in the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static void attachModelToResource(OwlsCompositeProcess model,
			Resource resource) {
		resource.getContents().add(model);
	}

	/**
	 * @generated
	 */
	public static void selectElementsInDiagram(
			IDiagramWorkbenchPart diagramPart, List/* EditPart */editParts) {
		diagramPart.getDiagramGraphicalViewer().deselectAll();

		EditPart firstPrimary = null;
		for (Iterator it = editParts.iterator(); it.hasNext();) {
			EditPart nextPart = (EditPart) it.next();
			diagramPart.getDiagramGraphicalViewer().appendSelection(nextPart);
			if (firstPrimary == null && nextPart instanceof IPrimaryEditPart) {
				firstPrimary = nextPart;
			}
		}

		if (!editParts.isEmpty()) {
			diagramPart.getDiagramGraphicalViewer().reveal(
					firstPrimary != null ? firstPrimary : (EditPart) editParts
							.get(0));
		}
	}

	/**
	 * @generated
	 */
	private static int findElementsInDiagramByID(DiagramEditPart diagramPart,
			EObject element, List editPartCollector) {
		IDiagramGraphicalViewer viewer = (IDiagramGraphicalViewer) diagramPart
				.getViewer();
		final int intialNumOfEditParts = editPartCollector.size();

		if (element instanceof View) { // support notation element lookup
			EditPart editPart = (EditPart) viewer.getEditPartRegistry().get(
					element);
			if (editPart != null) {
				editPartCollector.add(editPart);
				return 1;
			}
		}

		String elementID = EMFCoreUtil.getProxyID(element);
		List associatedParts = viewer.findEditPartsForElement(elementID,
				IGraphicalEditPart.class);
		// perform the possible hierarchy disjoint -> take the top-most parts
		// only
		for (Iterator editPartIt = associatedParts.iterator(); editPartIt
				.hasNext();) {
			EditPart nextPart = (EditPart) editPartIt.next();
			EditPart parentPart = nextPart.getParent();
			while (parentPart != null && !associatedParts.contains(parentPart)) {
				parentPart = parentPart.getParent();
			}
			if (parentPart == null) {
				editPartCollector.add(nextPart);
			}
		}

		if (intialNumOfEditParts == editPartCollector.size()) {
			if (!associatedParts.isEmpty()) {
				editPartCollector.add(associatedParts.iterator().next());
			} else {
				if (element.eContainer() != null) {
					return findElementsInDiagramByID(diagramPart, element
							.eContainer(), editPartCollector);
				}
			}
		}
		return editPartCollector.size() - intialNumOfEditParts;
	}

	/**
	 * @generated
	 */
	public static View findView(DiagramEditPart diagramEditPart,
			EObject targetElement, LazyElement2ViewMap lazyElement2ViewMap) {
		boolean hasStructuralURI = false;
		if (targetElement.eResource() instanceof XMLResource) {
			hasStructuralURI = ((XMLResource) targetElement.eResource())
					.getID(targetElement) == null;
		}

		View view = null;
		if (hasStructuralURI
				&& !lazyElement2ViewMap.getElement2ViewMap().isEmpty()) {
			view = (View) lazyElement2ViewMap.getElement2ViewMap().get(
					targetElement);
		} else if (findElementsInDiagramByID(diagramEditPart, targetElement,
				lazyElement2ViewMap.editPartTmpHolder) > 0) {
			EditPart editPart = (EditPart) lazyElement2ViewMap.editPartTmpHolder
					.get(0);
			lazyElement2ViewMap.editPartTmpHolder.clear();
			view = editPart.getModel() instanceof View ? (View) editPart
					.getModel() : null;
		}

		return (view == null) ? diagramEditPart.getDiagramView() : view;
	}

	/**
	 * @generated
	 */
	public static class LazyElement2ViewMap {
		/**
		 * @generated
		 */
		private Map element2ViewMap;

		/**
		 * @generated
		 */
		private View scope;

		/**
		 * @generated
		 */
		private Set elementSet;

		/**
		 * @generated
		 */
		public final List editPartTmpHolder = new ArrayList();

		/**
		 * @generated
		 */
		public LazyElement2ViewMap(View scope, Set elements) {
			this.scope = scope;
			this.elementSet = elements;
		}

		/**
		 * @generated
		 */
		public final Map getElement2ViewMap() {
			if (element2ViewMap == null) {
				element2ViewMap = new HashMap();
				// map possible notation elements to itself as these can't be
				// found by view.getElement()
				for (Iterator it = elementSet.iterator(); it.hasNext();) {
					EObject element = (EObject) it.next();
					if (element instanceof View) {
						View view = (View) element;
						if (view.getDiagram() == scope.getDiagram()) {
							element2ViewMap.put(element, element); // take only
							// those
							// that part
							// of our
							// diagram
						}
					}
				}

				buildElement2ViewMap(scope, element2ViewMap, elementSet);
			}
			return element2ViewMap;
		}

		/**
		 * @generated
		 */
		static Map buildElement2ViewMap(View parentView, Map element2ViewMap,
				Set elements) {
			if (elements.size() == element2ViewMap.size())
				return element2ViewMap;

			if (parentView.isSetElement()
					&& !element2ViewMap.containsKey(parentView.getElement())
					&& elements.contains(parentView.getElement())) {
				element2ViewMap.put(parentView.getElement(), parentView);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}

			for (Iterator it = parentView.getChildren().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			for (Iterator it = parentView.getSourceEdges().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			for (Iterator it = parentView.getSourceEdges().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			return element2ViewMap;
		}
	} // LazyElement2ViewMap

}
