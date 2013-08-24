package owls.cloud;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;

public class EucalyptusCloudService implements UnifiedCloudService {
	private IPath projectFullPath;
	private String deployUrl;
	
	public EucalyptusCloudService(IPath projectFullPath, String deployUrl) {
		this.projectFullPath = projectFullPath;
		this.deployUrl = deployUrl;
	}
	
	public boolean prepareToPublish() {
		updateCredentials();
		return false;
	}
	
	public boolean updateCredentials() {
		return false;
	}
}
