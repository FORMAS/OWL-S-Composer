package owls.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DiscoverySimilarServicesWizardPage extends WizardPage {

	private Text directoryText;
	
	private List<Degree> filterDegree = new ArrayList<Degree>();
	
	protected DiscoverySimilarServicesWizardPage(String pageName) {
		super(pageName);
		setTitle("OWL-S Composer");
		setDescription("Set the service directory, to search for similar services.");		
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Services directory:");

		directoryText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		directoryText.setLayoutData(gd);
		directoryText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}			
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}

			
		});
		setControl(container);
		
		Group filterGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
		filterGroup.setText("Filters");
		filterGroup.setLayout(new GridLayout(4, true));
		GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 3;
		filterGroup.setLayoutData(gridData);

		Button btnExact = new Button(filterGroup, SWT.CHECK);
		btnExact.setText("Exact");	
		btnExact.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				selectionChanged(Degree.EXACT);
			}

			
		});
		
		Button btnPlugin = new Button(filterGroup, SWT.CHECK);
		btnPlugin.setText("Plugin");
		btnPlugin.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				selectionChanged(Degree.PLUGIN);
			}
		});
		
		Button btnSubsumes = new Button(filterGroup, SWT.CHECK);
		btnSubsumes.setText("Subsumes");
		btnSubsumes.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				selectionChanged(Degree.SUBSUMES);
			}
		});
		
		Button btnSibling = new Button(filterGroup, SWT.CHECK);
		btnSibling.setText("Sibling");	
		btnSibling.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				selectionChanged(Degree.SIBLING);
			}
		});
		
	}
	
	private void handleBrowse() {
		DirectoryDialog directoryDialog = new DirectoryDialog(getShell(), SWT.OPEN);
		directoryDialog.setMessage("Select the service directory.");
		directoryText.setText(directoryDialog.open());
	}
	
	private void selectionChanged(Degree filter) {
		if (filterDegree.contains(filter)){
			filterDegree.remove(filter);
		} else {
			filterDegree.add(filter);
		}
	}
	
	private void dialogChanged() {
		// TODO Auto-generated method stub
		
	}

	public String getDirectoryText() {
		return directoryText.getText();
	}
	
	public List<Degree> getFilterDegree(){
		return filterDegree;
	}

	
}
