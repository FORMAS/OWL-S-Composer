package owls.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import sun.misc.InvalidJarIndexException;

public class CloudPrePublishWizardPage extends WizardPage {
	private Button awsCheckbox;
	private Button eucalyptusCheckbox;
	private ArrayList<TreeItem> packageTreeItems;

	protected CloudPrePublishWizardPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		GridData gridData = new GridData(GridData.FILL, GridData.BEGINNING, true, false);
		gridLayout.numColumns = 1;
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(gridLayout);
		
		Group providerGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
		providerGroup.setLayoutData(gridData);
		providerGroup.setLayout(gridLayout);
		providerGroup.setText("Select provider(s)");
		
		awsCheckbox = new Button(providerGroup, SWT.CHECK);
		awsCheckbox.setText("Amazon Web Services");
		awsCheckbox.setLocation(20, 30);
		awsCheckbox.pack();
		
		awsCheckbox.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				getWizard().getContainer().updateButtons();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				getWizard().getContainer().updateButtons();
			}
		});
		
		eucalyptusCheckbox = new Button(providerGroup, SWT.CHECK);
		eucalyptusCheckbox.setText("Eucalyptus");
		eucalyptusCheckbox.setLocation(20, 50);
		eucalyptusCheckbox.pack();
		
		eucalyptusCheckbox.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				getWizard().getContainer().updateButtons();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				getWizard().getContainer().updateButtons();
			}			
		});
		
		Group packageGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
		gridData = new GridData(GridData.FILL, GridData.FILL, true, true);
		packageGroup.setLayout(gridLayout);
		packageGroup.setLayoutData(gridData);
		packageGroup.setText("Select package(s)");
		
		Tree packageTree = new Tree(packageGroup, SWT.BORDER | SWT.CHECK);
		packageTree.setLayout(gridLayout);
		packageTree.setLayoutData(gridData);
		
		Image image = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		CloudPrePublishWizard wizard = (CloudPrePublishWizard) this.getWizard();
		IProject project = wizard.getProject();
		
		packageTreeItems = new ArrayList<TreeItem>();
		
		packageTree.pack();
		try {
			IResource[] resources = project.getFolder("src\\").members();
			buildTree(resources, packageTree);
			
//			for (int i = 0; i < resources.length; i++) {
//				if (resources[i].getType() == IResource.FOLDER) {
//					TreeItem treeItem = new TreeItem(packageTree, 0);
//					treeItem.setText(resources[i].getName());
//					treeItem.setImage(image);
//					
//					packageTreeItems.add(treeItem);
//				}
//			}
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		setControl(composite);
	}
	
    public boolean canFlipToNextPage() {
        return isPageComplete() && getNextPage() != null && 
        	(awsCheckbox.getSelection() || eucalyptusCheckbox.getSelection());
    }

	public Button getAWSCheckbox() {
		return awsCheckbox;
	}

	public Button getEucalyptusCheckbox() {
		return eucalyptusCheckbox;
	}

	public ArrayList<TreeItem> getPackageTreeItems() {
		return packageTreeItems;
	}
	
	private ArrayList<String> packageNames = new ArrayList<String>();
	
	public ArrayList<String> getCheckedPackageNames() {		
		for (TreeItem treeItem : packageTreeItems) {
			if (treeItem.getChecked()) {
				if (treeItem.getItems().length > 0) {
					getChildrenName(treeItem.getItems());
				} else {
					TreeItem newTreeItem = treeItem;
					String packageName = newTreeItem.getText();
					while(newTreeItem.getParentItem() != null) {
						newTreeItem = newTreeItem.getParentItem();
						packageName = newTreeItem.getText() + "." + packageName;
					}
					
					if (!packageNames.contains((String) packageName)) {
						packageNames.add(packageName);
					}
				}
			}
		}
		
		return packageNames;
	}
	
	public void getChildrenName(TreeItem[] treeItems) {
		for (TreeItem treeItem : treeItems) {
			if (treeItem.getChecked()) {
				if (treeItem.getItems().length > 0) {
					getChildrenName(treeItem.getItems());
				} else {
					TreeItem newTreeItem = treeItem;
					String packageName = newTreeItem.getText();
					while(newTreeItem.getParentItem() != null) {
						newTreeItem = newTreeItem.getParentItem();
						packageName = newTreeItem.getText() + "." + packageName;
					}
					
					if (!packageNames.contains((String) packageName)) {
						packageNames.add(packageName);
					}
				}
			}
		}
	}
		
	public void buildTree(IResource[] resources, Tree treeItem) {
		try {
			for (int i = 0; i < resources.length; i++) {
				if (resources[i].getType() == IResource.FOLDER) {
					TreeItem newTreeItem = new TreeItem(treeItem, SWT.NONE);
					newTreeItem.setText(resources[i].getName());
					packageTreeItems.add(newTreeItem);
						buildTree(((IFolder) resources[i]).members(), newTreeItem);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public void buildTree(IResource[] resources, TreeItem treeItem) {
		try {
			for (int i = 0; i < resources.length; i++) {
				if (resources[i].getType() == IResource.FOLDER) {
					TreeItem newTreeItem = new TreeItem(treeItem, SWT.NONE);
					newTreeItem.setText(resources[i].getName());
					packageTreeItems.add(newTreeItem);
					buildTree(((IFolder) resources[i]).members(), newTreeItem);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public boolean hasPackagesSelected() {
		for (TreeItem treeItem : packageTreeItems) {
			if (treeItem.getChecked()) {
				return true;
			}
		}
		
		return false;
	}
}
