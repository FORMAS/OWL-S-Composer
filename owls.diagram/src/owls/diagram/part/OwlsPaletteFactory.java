package owls.diagram.part;

import impl.owls.process.AtomicProcessImpl;
import impl.owls.process.CompositeProcessImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import owls.OwlsCompositeProcess;
import owls.diagram.providers.OwlsElementTypes;
import owls.facade.OwlsKBFacade;

/**
 * @generated
 */
public class OwlsPaletteFactory {

	/**
	 * @generated NOT
	 */
	private EObject rootElement;

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOwls1Group());
	}

	/**
	 * @param rootElement 
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot, EObject rootElement) {
		this.rootElement = rootElement;
		paletteRoot.add(createOwls1Group());
	}

	/**
	 * Creates "owls" palette tool group
	 * @param rootElement 
	 * @generated
	 */
	private PaletteContainer createOwls1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Owls1Group_title);
		paletteContainer.add(createProcesses1Group());
		paletteContainer.add(createImportedProcess2Group());
		paletteContainer.add(createConnections3Group());
		return paletteContainer;
	}

	/**
	 * Creates "Processes" palette tool group
	 * @generated
	 */
	private PaletteContainer createProcesses1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Processes1Group_title);
		paletteContainer.add(createSequence1CreationTool());
		paletteContainer.add(createSplit2CreationTool());
		paletteContainer.add(createAnyOrder3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Imported Process" palette tool group
	 * @param rootElement 
	 * @generated NOT
	 */
	private PaletteContainer createImportedProcess2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ImportedProcess2Group_title);
		importedProcessCreationTool(paletteContainer);
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections3Group_title);
		paletteContainer.add(createAssign1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(OwlsElementTypes.OwlsSequence_1001);
		types.add(OwlsElementTypes.OwlsSequence_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence1CreationTool_title,
				Messages.Sequence1CreationTool_desc, types);
		entry.setSmallIcon(OwlsElementTypes
				.getImageDescriptor(OwlsElementTypes.OwlsSequence_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplit2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(OwlsElementTypes.OwlsSplit_2003);
		types.add(OwlsElementTypes.OwlsSplit_1002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Split2CreationTool_title,
				Messages.Split2CreationTool_desc, types);
		entry.setSmallIcon(OwlsElementTypes
				.getImageDescriptor(OwlsElementTypes.OwlsSplit_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnyOrder3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(OwlsElementTypes.OwlsAnyOrder_2005);
		types.add(OwlsElementTypes.OwlsAnyOrder_1003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AnyOrder3CreationTool_title,
				Messages.AnyOrder3CreationTool_desc, types);
		entry.setSmallIcon(OwlsElementTypes
				.getImageDescriptor(OwlsElementTypes.OwlsAnyOrder_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcess1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Process1CreationTool_title,
				null, null, null) {
		};
		return entry;
	}

	/**
	 * @param rootElement 
	 * @generated NOT
	 */
	private void importedProcessCreationTool(PaletteDrawer paletteContainer) {
		List/*<IElementType>*/typesAtomic = new ArrayList/*<IElementType>*/(1);
		List/*<IElementType>*/typesComposite = new ArrayList/*<IElementType>*/(
				1);
		List imports = getImportList(rootElement);

		for (Object object : imports) {
			Service aService = getServiceForImport(object);
			Process aProcess = aService.getProcess();
			if (aProcess instanceof AtomicProcessImpl) {
				typesAtomic.add(OwlsElementTypes.OwlsAtomicProcess_2001);
				NodeToolEntry entry = new NodeToolEntry(
						aProcess.getLocalName(), aProcess.getLabel(),
						typesAtomic);
				entry
						.setSmallIcon(OwlsElementTypes
								.getImageDescriptor(OwlsElementTypes.OwlsAtomicProcess_2001));
				entry.setLargeIcon(entry.getSmallIcon());
				paletteContainer.add(entry);
			} else {
				if (aProcess instanceof CompositeProcessImpl) {
					typesComposite
							.add(OwlsElementTypes.OwlsCompositeProcess_2002);
					NodeToolEntry entry = new NodeToolEntry(aProcess
							.getLocalName(), aProcess.getLabel(),
							typesComposite);
					entry
							.setSmallIcon(OwlsElementTypes
									.getImageDescriptor(OwlsElementTypes.OwlsCompositeProcess_2002));
					entry.setLargeIcon(entry.getSmallIcon());
					paletteContainer.add(entry);
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssign1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(OwlsElementTypes.OwlsAssign_3001);
		types.add(OwlsElementTypes.OwlsAssignInputClient_3002);
		types.add(OwlsElementTypes.OwlsAssignOutputClient_3003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Assign1CreationTool_title,
				Messages.Assign1CreationTool_desc, types);
		entry.setSmallIcon(OwlsElementTypes
				.getImageDescriptor(OwlsElementTypes.OwlsAssign_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private List<String> getImportList(EObject rootElement) {
		OwlsCompositeProcess root = (OwlsCompositeProcess) rootElement;
		Object[] strArray = root.getDescribes().getOwnedBy().getOntology()
				.getImports().toArray();
		List list = Arrays.asList(strArray);
		Collections.sort(list);
		return list;
	}

	/**
	 * @generated NOT
	 */
	private Service getServiceForImport(Object object) {
		
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
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
