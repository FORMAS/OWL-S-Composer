package owls.cloud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class AWSCloudService implements UnifiedCloudService {
	private IProject project;
	private ArrayList<String> packages;
	
	private String accessKey;
	private String secretKey;
	
	public AWSCloudService(IProject project, ArrayList<String> packages, String accessKey, String secretKey) {
		this.project = project;
		this.packages = packages;
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

	public boolean prepareToPublish() {
		updateCredentials();
		importJAXWS();
		updateWebXML();
		updateJAXWSXML();
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean importJAXWS() {
		try {
			Bundle bundle = Platform.getBundle("owls");
			Enumeration<URL> enumeration = bundle.findEntries("\\templates\\cloud\\jaxws", "*.jar", true);
			IFolder folder = project.getFolder("WebContent\\WEB-INF\\lib\\plugins");
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
			
			while (enumeration.hasMoreElements()) {
				URL param = enumeration.nextElement();
				InputStream stream = null;
				stream = FileLocator.openStream(bundle, new Path(param.getPath()), false);
				IFile file = project.getFile("WebContent\\WEB-INF\\lib\\" + new File(param.getFile()).getName());
				if (!file.exists()) {
					file.create(stream, true, null);
				}
			}
			
			folder.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean updateWebXML() {
		try {
			// XML Opening
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			domFactory.setIgnoringComments(true);
			File file = new File(project.getFile("WebContent\\WEB-INF\\web.xml").getLocation().toOSString());
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse(file);
			Node webApp = doc.getElementsByTagName("web-app").item(0);

			// Adds listener class to XML
			NodeList listenerClasses = doc.getElementsByTagName("listener-class");
			for (int i = 0; i < listenerClasses.getLength(); i++) {
				if (!listenerClasses.item(i).getTextContent().equals("com.sun.xml.ws.transport.http.servlet.WSServletContextListener")) {
					if (listenerClasses.item(i).equals(listenerClasses.item(listenerClasses.getLength() - 1))) {
						Element listener = doc.createElement("listener");
						Element listenerClass = doc.createElement("listener-class");
						Text listenerClassValue = doc.createTextNode("com.sun.xml.ws.transport.http.servlet.WSServletContextListener");
						listener.appendChild(listenerClass);
						listenerClass.appendChild(listenerClassValue);
						webApp.appendChild(listener);
					}
				}
			}
			if (listenerClasses.getLength() == 0) {
				Element listener = doc.createElement("listener");
				Element listenerClass = doc.createElement("listener-class");
				Text listenerClassValue = doc.createTextNode("com.sun.xml.ws.transport.http.servlet.WSServletContextListener");
				listener.appendChild(listenerClass);
				listenerClass.appendChild(listenerClassValue);
				webApp.appendChild(listener);
			}
			
			// Adds servlet to XML
			ArrayList<String> packagesURL = new ArrayList<String>();
			for(String packageName : packages) {
				packagesURL.add(packageName.replace(".", "\\"));
			}
			
			for(String packageURL : packagesURL) {
				IFolder folder = project.getFolder("src\\" + packageURL);

				try {
					IResource[] resources = folder.members();
					IResource[] resourcesToAdd = new IResource[resources.length];
					NodeList servletNames = doc.getElementsByTagName("servlet-name");
					for (int i = 0; i < resources.length; i++) {
						String resourceName = resources[i].getName().replace(".java", "");
						for (int j = 0; j < servletNames.getLength(); j++) {
							if (!resources[i].getName().matches("\\w*.java$")) {
								break;
							}
							if (servletNames.item(j).getTextContent().equals(resourceName)) {
								break;
							} else {
								if (j == servletNames.getLength() - 1) {
									resourcesToAdd[i] = resources[i];
								}
							}
						}
						if (servletNames.getLength() == 0) {
							resourcesToAdd[i] = resources[i];
						}
					}
					for (int i = 0; i < resourcesToAdd.length; i++) {
						if (resourcesToAdd[i] != null && resourcesToAdd[i].getName()!= null) {
							String resourceName = resourcesToAdd[i].getName().replace(".java", "");
							Element servlet = doc.createElement("servlet");
							Element description = doc.createElement("description");
							Element displayName = doc.createElement("display-name");
							Element servletName = doc.createElement("servlet-name");
							Element servletClass = doc.createElement("servlet-class");
							Element loadOnStartup = doc.createElement("load-on-startup");
							description.setTextContent("WebService Description");
							displayName.setTextContent(resourceName);
							servletName.setTextContent(resourceName);
							servletClass.setTextContent("com.sun.xml.ws.transport.http.servlet.WSServlet");
							loadOnStartup.setTextContent("1");
							servlet.appendChild(description);
							servlet.appendChild(displayName);
							servlet.appendChild(servletName);
							servlet.appendChild(servletClass);
							servlet.appendChild(loadOnStartup);
							
							Element servletMapping = doc.createElement("servlet-mapping");
							Element servletName2 = doc.createElement("servlet-name");
							Element urlPattern = doc.createElement("url-pattern");
							servletName2.setTextContent(resourceName);
							urlPattern.setTextContent("/" + resourceName + "Service");
							servletMapping.appendChild(servletName2);
							servletMapping.appendChild(urlPattern);
							
							webApp.appendChild(servlet);
							webApp.appendChild(servletMapping);	
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}	
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", "2");
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);

			project.getFolder("WebContent\\WEB-INF\\").refreshLocal(IResource.DEPTH_INFINITE, null);
			
			return true;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
			return false;
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateJAXWSXML() {
		try {
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			domFactory.setIgnoringComments(true);
			File file = new File(project.getFile("WebContent\\WEB-INF\\sun-jaxws.xml").getLocation().toOSString());
			DocumentBuilder builder;
			builder = domFactory.newDocumentBuilder(); 
			Document doc = null;
			if (file.exists()) {
				doc = builder.parse(file);
			} else {
				doc = builder.newDocument();
			}
			
			ArrayList<String> packagesURL = new ArrayList<String>();
			for (String packageName : packages) {
				packagesURL.add(packageName.replace(".", "\\"));
			}
			
			for (String packageURL : packagesURL) {
				IFolder folder = project.getFolder("src\\" + packageURL);
				
				IResource[] resources = folder.members();
				IResource[] resourcesToAdd = new IResource[resources.length];
				
				Element endpoints = null;
				if (doc.getElementsByTagName("endpoints").getLength() == 0) {
					endpoints = doc.createElement("endpoints");
					endpoints.setAttribute("xmlns", "http://java.sun.com/xml/ns/jax-ws/ri/runtime");
					endpoints.setAttribute("version", "2.0");
					doc.appendChild(endpoints);
				} else {
					endpoints = (Element) doc.getElementsByTagName("endpoints").item(0);
				}
				
				NodeList endpointList = doc.getElementsByTagName("endpoint");
				for (int i = 0; i < resources.length; i++) {
					for (int j = 0; j < endpointList.getLength(); j++) {
						if (!resources[i].getName().matches("\\w*.java$")) {
							break;
						}
						if (endpointList.item(j).getAttributes().getNamedItem("name").getTextContent().equals(resources[i].getName().replace(".java", ""))) {
							break;
						} else {
							if (j == endpointList.getLength() - 1) {
								resourcesToAdd[i] = resources[i];
							}
						}
					}
					if (endpointList.getLength() == 0) {
						resourcesToAdd[i] = resources[i];
					}
				}
				
				for (int i = 0; i < resourcesToAdd.length; i++) {
					if (resourcesToAdd[i] != null && resourcesToAdd[i].getName() != null) {
						String resourceName = resourcesToAdd[i].getName().replace(".java", "");
						Element endpoint = doc.createElement("endpoint");
						endpoint.setAttribute("name", resourceName);
						endpoint.setAttribute("implementation", packageURL.replace("\\", ".") + "." + resourceName);
						endpoint.setAttribute("url-pattern", "/" + resourceName + "Service");
						
						endpoints.appendChild(endpoint);
					}
				}
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", "2");
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = null;
			if (file.exists()) {
				result = new StreamResult(file);
			} else {
				result = new StreamResult(new File(file.getAbsolutePath()));
			}
			transformer.transform(source, result);
			
			project.getFolder("WebContent\\WEB-INF\\").refreshLocal(IResource.DEPTH_INFINITE, null);
			
			return true;
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return false;
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
			return false;
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateCredentials() {
		try {
			File file = new File(project.getFile("src\\AwsCredentials.properties").getLocation().toOSString());
			Date date = new Date();
			String content = "";
			if (!file.exists()) {
				file.createNewFile();
				content = "#Insert your AWS credentials from http://aws.amazon.com/security-credentials\r\n" +
				"#Last updated " + date.toString() + "\r\n" + 
				"secretKey=" + secretKey + "\r\n" +
				"accessKey=" + accessKey + "\r\n\r\n";
			} else {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = "";
				boolean credentialExists;
				credentialExists = false;
				while ((line = br.readLine()) != null) {
					boolean credentialToUpdate;
					credentialToUpdate = false;
					if (line.startsWith("#Insert your AWS credentials")) {
						content += line + "\r\n";
						credentialExists = true;
						credentialToUpdate = true;
					} else if (line.startsWith("#Last updated ") && credentialToUpdate) {
						content += "#Last updated " + date.toString() + "\r\n";
					} else if (line.startsWith("secretKey=") && credentialToUpdate) {
						content += "secretKey=" + secretKey + "\r\n";
					} else if (line.startsWith("accessKey=") && credentialToUpdate) { 
						content += "accessKey=" + accessKey + "\r\n\r\n";
						credentialToUpdate = false;
					} else {
						content += line + "\r\n";
					}
				}
				if (!credentialExists) {
					content = "#Insert your AWS credentials from http://aws.amazon.com/security-credentials\r\n" +
					"#Last updated " + date.toString() + "\r\n" + 
					"secretKey=" + secretKey + "\r\n" +
					"accessKey=" + accessKey + "\r\n\r\n";
				}
			}

			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			project.getFolder("src\\").refreshLocal(IResource.DEPTH_INFINITE, null);
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public IProject getProject() {
		return project;
	}

	public ArrayList<String> getPackages() {
		return packages;
	}
	
	public String getAccessKey() {
		return accessKey;
	}
	
	public String getSecretKey() {
		return secretKey;
	}
}
