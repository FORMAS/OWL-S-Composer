package owls.cloud;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

public class EucalyptusCloudService implements UnifiedCloudService {
	private IProject project;
	private ArrayList<String> packages;
	
	private String accessKey;
	private String secretKey;
	
	public EucalyptusCloudService(IProject project, ArrayList<String> packages, String accessKey, String secretKey) {
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
	
	public boolean updateCredentials() {
		return false;
	}
	
	public boolean importJAXWS() {
		return false;
	}
	
	public boolean updateWebXML() {
		return false;
	}
	
	public boolean updateJAXWSXML() {
		return false;
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
