package owls.cloud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.Process;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import sun.security.action.GetLongAction;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

public class DescriptorKB {
	private String cpdFileName;
	private Document dom;
	private ArrayList<PublishDescriptor> publishDescriptorList;
	private static String cpdFolderName = "compositionDescriptors";

	public DescriptorKB(String cpdFileName,
			ArrayList<PublishDescriptor> publishDescriptorList) {
		this.cpdFileName = cpdFileName;
		this.publishDescriptorList = publishDescriptorList;
		System.err.println("Nome do documento: " + cpdFileName);
	}

	public void createDescriptorKB() {
		System.err.println("Vai escrever o documento");
		this.createDocument();
		System.err.println("Vai criar a arvore");
		this.createDOMTree();
		System.err.println("Vai imprimir o arquivo");
		this.printToFile();
	}

	/**
	 * Using JAXP in implementation independent manner create a document object
	 * using which we create a xml tree in memory
	 */
	private void createDocument() {

		// get an instance of factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			// get an instance of builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// create an instance of DOM
			dom = db.newDocument();

		} catch (ParserConfigurationException pce) {
			// dump it
			System.out
					.println("Error while trying to instantiate DocumentBuilder "
							+ pce);
			System.exit(1);
		}

	}

	/**
	 * The real workhorse which creates the XML structure
	 */
	private void createDOMTree() {

		// create the root element
		Element rootEle = dom.createElement("publishDescriptors");
		dom.appendChild(rootEle);

		Iterator<PublishDescriptor> it = publishDescriptorList.iterator();
		while (it.hasNext()) {
			PublishDescriptor publishDescriptor = (PublishDescriptor) it.next();
			// For each Book object create element and attach it to root
			Element publishEle = createDescriptorElement(publishDescriptor);
			rootEle.appendChild(publishEle);
		}
	}

	/**
	 * This method uses Xerces specific classes prints the XML document to file.
	 */
	public void printToFile() {
		try {
			// print
			OutputFormat format = new OutputFormat(dom);
			format.setIndenting(true);

			String workspaceFilename = ResourcesPlugin.getWorkspace().getRoot()
					.getLocation().toString();
			File cpdFolder = new File(workspaceFilename);
			if (!(cpdFolder.exists())) {
				cpdFolder.mkdirs();
			}
			// to generate output to console use this serializer
			// XMLSerializer serializer = new XMLSerializer(System.out, format);

			// to generate a file output use fileoutputstream instead of
			// system.out
			XMLSerializer serializer = new XMLSerializer(new FileOutputStream(
					new File(cpdFolder.getAbsolutePath() + cpdFileName)),
					format);

			serializer.serialize(dom);

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	/**
	 * Helper method which creates a XML element
	 * 
	 * @param publishDescriptor
	 *            The book for which we need to create an xml representation
	 * @return XML element snippet representing a book
	 */
	private Element createDescriptorElement(PublishDescriptor publishDescriptor) {

		Element publishEle = dom.createElement("publishDescriptor");
		publishEle.setAttribute("URI", publishDescriptor.getDescriptorURL()
				.toString());

		return publishEle;
	}

	private static ArrayList<URL> getDescriptors(String filePath) {
		System.out.println("GET DESCRIPTORS");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			// Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// parse using builder to get DOM representation of the XML file
			Document dom = db.parse(filePath);
			System.out.println("GET DOCUMENT");
			Element publishDescriptors = dom.getDocumentElement();
			NodeList descriptors = publishDescriptors.getChildNodes();
			ArrayList<URL> uris = new ArrayList<URL>();
			System.err.println("Descriptors: " + descriptors.toString());
			if (descriptors != null & descriptors.getLength() > 0) {
				for (int i = 0; i < descriptors.getLength(); i++) {
					Node node = descriptors.item(i);
					if (!(node instanceof Element)) {
						System.err.println("Node nao eh elemento");
						System.out.println("Node: " + node.getNodeName());
						continue;
					} else {
						System.out.println("Node eh Elemento");
						Element service = (Element) node;
						URL owlsURI = new URL(service.getAttribute("URI"));
						System.out.println("Endereco do Servico: "
								+ owlsURI.toString());
						uris.add(owlsURI);
					}
				}
			}
			return uris;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("ERRO: " + e.getMessage());
		}
		return null;
	}

	public static String createCompositionPath(Process process) {
		// Extrai a pasta do projeto
		String folder = "";
//		String ontologyPath = process.getOntology().getURI().toString();
//		int lastIndex = ontologyPath.lastIndexOf("/owls");
//		String path = ontologyPath.substring(0, lastIndex);
//		String serviceName = process.getURI().toString().substring(
//				lastIndex + 7, ontologyPath.length() - 3);
		
		String filename= process.getLocalName();
		String serviceName = filename.substring(0, filename.length()-7);
		IResource pathResource = extractSelection(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection());
		String path = pathResource.getProject().getName();
		System.out.println("Service Name: " + serviceName);
		System.out.println("URI: " + process.getOntology().getURI().toString());
		System.out.println("Project: " + path);
		String cpdFolderPath = ResourcesPlugin.getWorkspace().getRoot()
				.getLocation().toString()
				+ "/" + path + "/";
		System.err.println("PATH: " + cpdFolderPath);
		File cpdFolder = new File(cpdFolderPath);
		if (cpdFolder.exists()) {
			System.out.println("Diagram Files: " + cpdFolderPath + serviceName
					+ ".cpd");
			ArrayList<URL> descriptors = getDescriptors(cpdFolderPath
					+ serviceName + ".cpd");
			ArrayList<String> nameList = getProcessURIList(process);
			if ((descriptors != null) && (nameList.size() > 0)) {
				// TODO: Alterar Path
				folder = "C:\\Temp\\cloud_files\\" + path + "\\" + serviceName
						+ "\\";
				File cloudFile = new File(folder);
				if (!cloudFile.exists()) {
					cloudFile.mkdirs();
				}

				// Itera para pegar os valores
				Iterator<String> serviceIterator = nameList.iterator();
				while (serviceIterator.hasNext()) {
					boolean achou = false;
					int j = 0;
					String participantName = serviceIterator.next();
					try {
						// Tenta achar a URL em todos os descritores
						while (!achou && j < descriptors.size()) {
							URL descriptorURI = descriptors.get(j);
							PublishDescriptor pb = new PublishDescriptor(
									descriptorURI);

							// Verifica se a URL esta no descritor
							if (pb.isInDescriptor(participantName)) {
								achou = true;
								System.out.println("DIRETORIO: "+pb.getDirectory());
								File source = new File(pb.getDirectory());
								source.setReadable(true);
								File files[] = source.listFiles();
								for (int f = 0; f < files.length; f++) {
									FileReader fr = new FileReader(files[f]);
									BufferedReader buff = new BufferedReader(fr);
									FileWriter fw = new FileWriter(new File(
											cloudFile, (files[f]).getName()));
									String ln;
									while ((ln = buff.readLine()) != null) {
										fw.write(ln);
									}
									fw.flush();
									fw.close();
								}
							}
							j++;
						}
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
		return folder;
	}

	private static ArrayList<String> getProcessURIList(Process process) {
		ArrayList<String> nameList = new ArrayList<String>();
		
		String filename= process.getLocalName();
		filename = filename.substring(0, filename.length()-7);
		nameList.add(filename);
		System.out.println("PROCESS NAME: " + filename);
		// Get CLOUD URIS
		if (process instanceof CompositeProcess) {
			CompositeProcess cprocess = (CompositeProcess) process;
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder db;
			try {
				db = dbf.newDocumentBuilder();
				Document dom = db.parse(cprocess.getOntology().getURI().toURL()
						.openStream());
				Element rdf = dom.getDocumentElement();
				NodeList ontologyList = rdf
						.getElementsByTagName("owl:Ontology");
				for (int i = 0; i < ontologyList.getLength(); i++) {
					Node node = ontologyList.item(i);
					if (node instanceof Element) {
						Element ontology = (Element) node;
						NodeList imports = ontology
								.getElementsByTagName("owl:imports");
						for (int j = 0; j < imports.getLength(); j++) {
							Node impNode = imports.item(j);
							if (impNode instanceof Element) {
								Element imp = (Element) impNode;
								URI descURI = new URI(imp
										.getAttribute("rdf:resource"));
								String serviceURI = descURI.toString();
								int lastIndex = serviceURI.indexOf(".owl");
								// Retirar namespace do serviso. Deixar apenas a
								// URI
								String serviceName = "";
								if ((lastIndex + 5) < serviceURI.length()) {
									serviceName = serviceURI.substring(
											lastIndex + 4, serviceURI.length());
									System.err.println("SERVICE URI: "
											+ serviceName);
								}
								nameList.add(serviceName);
							}
						}
					}
				}
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return nameList;
	}

	public static IResource extractSelection(ISelection sel) {
		if (!(sel instanceof IStructuredSelection))
			return null;
		IStructuredSelection ss = (IStructuredSelection) sel;
		Object element = ss.getFirstElement();
		if (element instanceof IResource)
			return (IResource) element;
		if (!(element instanceof IAdaptable))
			return null;
		IAdaptable adaptable = (IAdaptable) element;
		Object adapter = adaptable.getAdapter(IResource.class);
		return (IResource) adapter;
	}
}
