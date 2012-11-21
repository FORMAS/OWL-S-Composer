package owls.cloud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PublishDescriptor {

	private URL descriptorURL;
	private static String baseDirectory = "C:\\Temp\\servicos\\";
	private String cloudUrl;

	public String getDirectory() {
		if (cloudUrl.length() > 0) {
			return baseDirectory + cloudUrl.substring(7);
		}
		return "";
	}

	public URL getDescriptorURL() {
		return descriptorURL;
	}

	public static String getBasedirectory() {
		return baseDirectory;
	}

	public PublishDescriptor(URL descriptorURI) {
		// TODO Auto-generated constructor stub
		this.descriptorURL = descriptorURI;
		this.cloudUrl = "";

	}

	public ArrayList<File> getOWLSFromFile() {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			// Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// parse using builder to get DOM representation of the XML file
			Document dom = db.parse(descriptorURL.openStream());

			System.out.println("Endereco do Descritor: "
					+ descriptorURL.toString());
			Element cloudProvider = dom.getDocumentElement();
			URL cloudURL = new URL(cloudProvider.getAttribute("URI"));
			this.cloudUrl = cloudURL.toString();

			System.out.println("Endereco da Nuvem: " + cloudURL.toString());
			NodeList services = cloudProvider.getChildNodes();

			// TODO: Consertar este codigo.
			String folder = this.getDirectory();
			File path = new File(folder);
			if (!path.exists()) {
				path.mkdirs();
			}
			path.setReadable(true);
			path.setWritable(true);
			ArrayList<File> files = new ArrayList<File>();

			if (services != null & services.getLength() > 0) {
				for (int i = 0; i < services.getLength(); i++) {
					Node node = services.item(i);
					if (!(node instanceof Element)) {
						System.err.println("Node nao eh elemento");
						System.out.println("Node: " + node.getNodeName());
						continue;
					} else {
						System.out.println("Node eh Elemento");
						Element service = (Element) node;
						URL owlsURI = new URL(cloudURL.toString()
								+ service.getAttribute("descriptorName"));
						System.out.println("Endereco do Servico: "
								+ owlsURI.toString());
						BufferedReader in = new BufferedReader(
								new InputStreamReader(owlsURI.openStream()));
						String str;
						String fileContent = "";
						while ((str = in.readLine()) != null) {
							fileContent += str;
						}
						File owlsFile = new File(folder
								+ service.getAttribute("descriptorName"));
						owlsFile.setReadable(true);
						owlsFile.setWritable(true);
						FileWriter serviceFile = new FileWriter(owlsFile);
						serviceFile.write(fileContent);
						serviceFile.flush();
						serviceFile.close();
						files.add(owlsFile);
						in.close();
						
					}
				}
			}
			return files;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean isInDescriptor(String needle) {
		System.out.println("Verificacao de Igualdade: "+needle);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			// Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// parse using builder to get DOM representation of the XML file
			Document dom = db.parse(descriptorURL.openStream());

			System.out.println("Endereco do Descritor: "
					+ descriptorURL.toString());
			Element cloudProvider = dom.getDocumentElement();
			URL cloudURL = new URL(cloudProvider.getAttribute("URI"));
			this.cloudUrl = cloudURL.toString();

			System.out.println("Endereco da Nuvem " + this.cloudUrl);
			NodeList services = cloudProvider.getChildNodes();

			if (services != null) {
				for (int i = 0; i < services.getLength(); i++) {
					Node node = services.item(i);
					if (!(node instanceof Element)) {
						continue;
					} else {
						Element service = (Element) node;
						String owlsName = service.getAttribute("descriptorName");
						if (needle.equals(owlsName)) {
							return true;
						}
					}
				}
			}
			else{
				System.out.println("NAO EXISTEM SERVICOS");
			}
			return false;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
