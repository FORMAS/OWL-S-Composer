package owls.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CloudPrePublishEucalyptusWizardPage extends WizardPage {
	private Text deployUrl;

	protected CloudPrePublishEucalyptusWizardPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		int columnsNumber = 2;
		
		gridLayout.numColumns = columnsNumber;
		gridLayout.verticalSpacing = 9;
		composite.setLayout(gridLayout);
		
		new Label(composite, SWT.NONE).setText("Deploy url");
		deployUrl = new Text(composite, SWT.BORDER);
		deployUrl.setSize(20, 10);
		deployUrl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		
		Composite classesComposite = new Composite(parent, SWT.NONE);
		
		new Button(classesComposite, SWT.FLAT).setText("Add");
		
		setControl(composite);
	}
	
	public Text getDeployUrl() {
		return deployUrl;
	}

}
