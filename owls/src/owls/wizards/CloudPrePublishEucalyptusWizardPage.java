package owls.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CloudPrePublishEucalyptusWizardPage extends WizardPage {
	private Text accessKey;
	private Text secretKey;

	protected CloudPrePublishEucalyptusWizardPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		Composite composite = new Composite(parent, SWT.NONE);	
		
		gridLayout.numColumns = 1;
		composite.setLayout(gridLayout);

		GridData gridData = new GridData(GridData.FILL, GridData.BEGINNING, true, true);
		gridLayout = new GridLayout(2, false);
		Group credentialsGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);		
		credentialsGroup.setLayout(gridLayout);
		credentialsGroup.setLayoutData(gridData);
		credentialsGroup.setText("Eucalyptus credentials");
		
		new Label(credentialsGroup, SWT.NONE).setText("API Key:");
		accessKey = new Text(credentialsGroup, SWT.BORDER);
		accessKey.setLayoutData(gridData);
		
		new Label(credentialsGroup, SWT.NONE).setText("Secret Key:");
		secretKey = new Text(credentialsGroup, SWT.BORDER | SWT.PASSWORD);
		secretKey.setLayoutData(gridData);

		setControl(composite);
	}
    
    public Text getAccessKey() {
    	return accessKey;
    }
    
    public Text getSecretKey() {
    	return secretKey;
    }
}
