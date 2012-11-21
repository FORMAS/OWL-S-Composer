package owls.diagram.part;

import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.NoteViewFactory;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import owls.OwlsAtomicProcess;
import owls.OwlsCompositeProcess;
import owls.OwlsInput;
import owls.OwlsOutput;
import owls.OwlsProcess;
import owls.facade.OwlsInitializerFacade;
import owls.facade.OwlsParameterFacade;
import owls.plugin.Activator;
import owls.plugin.EMFModelLoad;
import pf.main.MainFunctionalMatcher;
import pf.vo.Service;
import pf.matcher.implementations.functional.*;

class SimilarService implements Comparable<SimilarService> {
	public Degree degree;
	public String path;
	public ArrayList<SimilarityDegree> inputList;
	public ArrayList<SimilarityDegree> outputList;

	// public ArrayList<UR>

	public SimilarService(String path, Degree degree) {
		this.degree = degree;
		this.path = path;
	}

	@Override
	public int compareTo(SimilarService o) {
		if (o.degree.ordinal() > degree.ordinal())
			return 1;
		else if (o.degree.ordinal() == degree.ordinal())
			return 0;
		else
			return -1;
	}
}

enum Degree {
	FAIL, SIBLING, SUBSUMES, PLUGIN, EXACT
};

public class DiscoverSimilarServicesWizard extends Wizard implements INewWizard {

	private DiscoverySimilarServicesWizardPage discoverSimilarServiceWizardPage;

	private ArrayList<SimilarService> similar[] = new ArrayList[3];

	public DiscoverSimilarServicesWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		discoverSimilarServiceWizardPage = new DiscoverySimilarServicesWizardPage(
				"Discover");
		addPage(discoverSimilarServiceWizardPage);
	}

	@Override
	public boolean performFinish() {

		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				
				Activator.getDefault().init();
				IPath diagramPath = Activator.getCurrentFilePath();
				EMFModelLoad loader = new EMFModelLoad();
				final OwlsCompositeProcess owlsComposite = loader
						.load(diagramPath.toOSString());

				for (int i = 0; i < 3; i++) {
					similar[i] = new ArrayList<SimilarService>();
				}

				List<OwlsProcess> processes = owlsComposite.getComposedOf()
						.getProcesses();
				List<EObject> listEObject = owlsComposite.getComposedOf()
						.getElements();

				for (EObject owlsControlConstruct : listEObject) {
					if (owlsControlConstruct instanceof OwlsAtomicProcess) {
						OwlsAtomicProcess new_name = (OwlsAtomicProcess) owlsControlConstruct;
					}
				}

				// For each service in the composition
				for (int j = 0; j < processes.size(); j++) {
					OwlsProcess owlsProcess = processes.get(j);

					String processName = owlsProcess.getID();
					if (owlsProcess.getID().indexOf("Atomic") != -1) {
						processName = owlsProcess.getID().substring(0,
								owlsProcess.getID().indexOf("Atomic"));
					} else if (owlsProcess.getID().indexOf("Process") != -1) {
						processName = owlsProcess.getID().substring(0,
								owlsProcess.getID().indexOf("Process"));
					}

					String processPath = findPath(processName);

					System.out.println("Discovering...");
					List<SimilarService> serviceList = discoverService(processPath);

					// Sort serviceList by degree
					Collections.sort(serviceList);
					System.out.println("SERVICES DISCOVERED FOR " + processName
							+ ":");

					for (SimilarService similarService : serviceList) {

						System.out.println(similarService.path + " - "
								+ similarService.degree);
					}

					// Get the 3 first services
					for (int i = 0; i < 3; i++) {
						if (similar[i] != null) {
							if (serviceList.size() > 0) {
								similar[i].add(serviceList.remove(0));
							} else {
								similar[i] = null;
							}
						}
					}
				}

				String servicesDiscovered = "";
				int numServicesDiscoverd = 0;
				// Create a new diagram path
				for (int i = 0; i < 3; i++) {
					if (similar[i] != null) {
						numServicesDiscoverd++;
						Degree lowDegree = Degree.EXACT;
						for (SimilarService similarService : similar[i]) {
							if (similarService.degree.ordinal() < lowDegree
									.ordinal()) {
								lowDegree = similarService.degree;
							}
						}
						IPath newDiagram = diagramPath.removeLastSegments(1);
						String newDiagramName = (i + 1) + "_" + lowDegree + "_"
								+ diagramPath.lastSegment();
						newDiagram = newDiagram.append("/" + newDiagramName);
						servicesDiscovered = servicesDiscovered.concat("\t*"
								+ newDiagramName + "\n");
						String diagramFile = newDiagram.toOSString();

						OwlsInitializerFacade facade = initializeFacade(
								owlsComposite, similar[i], lowDegree.toString());

						List<File> files = new ArrayList<File>();
						for (SimilarService similarService : similar[i]) {
							File file = new File(similarService.path);
							files.add(file);
							System.out.println("File added: "
									+ similarService.path);
						}
						facade.getComposedFiles().addAll(files);
						final OwlsCompositeProcess newOwlsComposite = loader
								.load(diagramPath.toOSString());
						Resource diagram = OwlsDiagramEditorUtil
								.createSimilarDiagram(URI
										.createFileURI(diagramFile), facade,
										newOwlsComposite, monitor);
						// addNote(diagram, "EXACT", monitor);
					}
				}

				String message = "Number of similar compositions discovered: "
						+ numServicesDiscoverd + "\n\n" + servicesDiscovered;
				MessageDialog.openInformation(new Shell(SWT.CLOSE),
						"OWL-S Composer", message);
			}
		};

		try {
			System.err.println("ANTES");
			op.run(new NullProgressMonitor());
			System.err.println("DEPOIS");

		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			return false;
		}
		return true;
	}

	// FIXME - This is not working
	private void addNote(final Resource diagramResource, String degree,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.getEditingDomain(diagramResource.getResourceSet());
		progressMonitor.beginTask(
				Messages.OwlsDiagramEditorUtil_CreateDiagramProgressTask, 3);
		// final Resource diagramResource =
		// editingDomain.getResourceSet().createResource(diagramURI);
		// final String diagramName = diagramURI.lastSegment();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.OwlsDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EList<EObject> contentsList = diagramResource.getContents();
				for (EObject object : contentsList) {
					if (object instanceof Diagram) {
						Diagram diagram = (Diagram) object;
						NoteViewFactory note = new NoteViewFactory();
						View newView = note.createView(null, diagram, "Note",
								-1, true, PreferencesHint.USE_DEFAULTS);
						diagram.getChildren().add(newView);
					}

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

		OwlsDiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(diagramResource));

	}

	/**
	 * Discover similar services from processURI
	 * 
	 * @param processURI
	 * @return
	 */
	private List<SimilarService> discoverService(String processURI) {
		MainFunctionalMatcher matcher = new MainFunctionalMatcher();

		List<Service> servicesDiscovered = null;
		Map<String, ArrayList<SimilarityDegree>> resultInput = new HashMap<String, ArrayList<SimilarityDegree>>();
		Map<String, ArrayList<SimilarityDegree>> resultOutput = new HashMap<String, ArrayList<SimilarityDegree>>();
		try {
			String directoryPath = discoverSimilarServiceWizardPage
					.getDirectoryText();
			System.out.println(directoryPath);
			System.err.println(processURI);
			servicesDiscovered = matcher.discoverServices(processURI,
					directoryPath);
			resultInput = matcher.getResultInputs();
			resultOutput = matcher.getResultOutputs();
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openInformation(new Shell(SWT.CLOSE),
					"OWL-S Composer", e.getMessage());
		}

		List<Degree> filterDegree = discoverSimilarServiceWizardPage
				.getFilterDegree();
		List<SimilarService> result = new ArrayList<SimilarService>();
		for (Service service : servicesDiscovered) {
			if (service.getDegreeMatch().equals("EXACT")
					& filterDegree.contains(Degree.EXACT)) {
				SimilarService newService = new SimilarService(service.getUri()
						.getRawPath(), Degree.EXACT);
				newService.inputList = resultInput.get(service.getUri()
						.toString());
				newService.outputList = resultOutput.get(service.getUri()
						.toString());
				result.add(newService);
			} else if (service.getDegreeMatch().equals("PLUGIN")
					& filterDegree.contains(Degree.PLUGIN)) {
				SimilarService newService = new SimilarService(service.getUri()
						.getRawPath(), Degree.PLUGIN);
				newService.inputList = resultInput.get(service.getUri()
						.toString());
				newService.outputList = resultOutput.get(service.getUri()
						.toString());
				result.add(newService);
			} else if (service.getDegreeMatch().equals("SUBSUMES")
					& filterDegree.contains(Degree.SUBSUMES)) {
				SimilarService newService = new SimilarService(service.getUri()
						.getRawPath(), Degree.SUBSUMES);
				newService.inputList = resultInput.get(service.getUri()
						.toString());
				newService.outputList = resultOutput.get(service.getUri()
						.toString());
				result.add(newService);
			} else if (service.getDegreeMatch().equals("SIBLING")
					& filterDegree.contains(Degree.SIBLING)) {
				SimilarService newService = new SimilarService(service.getUri()
						.getRawPath(), Degree.SIBLING);
				newService.inputList = resultInput.get(service.getUri()
						.toString());
				newService.outputList = resultOutput.get(service.getUri()
						.toString());
				result.add(newService);
			}
		}
		return result;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	/**
	 * Find a service in the workspace, directory owls
	 * 
	 * @param processName
	 * @return
	 */
	private String findPath(String processName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				Activator.getCurrentProject().getName());
		//TODO: Trocar WebContent pela variavel que controla o projeto
		IContainer container = (IContainer) project.findMember("WebContent/owls");
		IResource resource = container.findMember(processName + ".owl");
		return resource.getLocation().toOSString();
	}

	private OwlsInitializerFacade initializeFacade(
			OwlsCompositeProcess owlsComposite,
			ArrayList<SimilarService> servicesList, String degree) {
		OwlsInitializerFacade facade = new OwlsInitializerFacade();
		facade.setMainProcessName(degree
				+ owlsComposite.getID().substring(0,
						owlsComposite.getID().lastIndexOf("Process")));

		// FIXME fix the process namespace
		facade.setProcessNamespace("http://localhost:8080/axis/" + degree
				+ facade.getMainProcessName() + ".owl");

		List<OwlsInput> inputList = owlsComposite.getHasInputs();
		for (OwlsInput owlsInput : inputList) {
			String parameterType = owlsInput.getParameterType();
			for (SimilarService similarService : servicesList) {
				List<SimilarityDegree> similarityList = similarService.inputList;
				for (SimilarityDegree similarityDegree : similarityList) {
					if (similarityDegree.getRequestParameter().toString()
							.equals(owlsInput.getParameterType())) {
						parameterType = similarityDegree.getServiceParameter()
								.toString();
					}
				}
			}
			OwlsParameterFacade parameter = new OwlsParameterFacade(owlsInput
					.getID(), parameterType);
			facade.getMainProcessInputs().add(parameter);
		}

		List<OwlsOutput> outputList = owlsComposite.getHasOutputs();
		for (OwlsOutput owlsOutput : outputList) {
			String parameterType = owlsOutput.getParameterType();
			for (SimilarService similarService : servicesList) {
				List<SimilarityDegree> similarityList = similarService.outputList;
				for (SimilarityDegree similarityDegree : similarityList) {
					if (similarityDegree.getRequestParameter().toString()
							.equals(owlsOutput.getParameterType())) {
						parameterType = similarityDegree.getServiceParameter()
								.toString();
					}
				}
			}

			OwlsParameterFacade parameter = new OwlsParameterFacade(owlsOutput
					.getID(), parameterType);
			facade.getMainProcessOutputs().add(parameter);
		}
		return facade;
	}

}
