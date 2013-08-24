package owls.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import owls.cloud.AWSCloudService;
import owls.cloud.EucalyptusCloudService;

public class CloudPrePublishWizard extends Wizard implements INewWizard {
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private IProject project;
	
	private CloudPrePublishWizardPage pageOne;
	private CloudPrePublishAWSWizardPage pageTwo;
	private CloudPrePublishEucalyptusWizardPage pageThree;
	
	public void addPages() {
		super.addPages();

		pageOne = new CloudPrePublishWizardPage("Prepare to publish on cloud");
		pageOne.setTitle("Prepare to publish on cloud");
		pageOne.setDescription("Select the cloud providers and packages.");
		pageTwo = new CloudPrePublishAWSWizardPage("From Scratch Project Wizard");
		pageTwo.setTitle("Publish on Amazon Web Services");
		pageTwo.setDescription("Fill the form below if you wish to publish your project on Amazon Web Services platform.");
		pageThree = new CloudPrePublishEucalyptusWizardPage("From Scratch Project Wizard");
		pageThree.setTitle("Publish on Eucalyptus");
		pageThree.setDescription("Fill the form below if you wish to publish your project on Eucalyptus platform.");
		
		addPage(pageOne);
		addPage(pageTwo);
		addPage(pageThree);
	}
	
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.equals(pageOne)) {
			if (pageOne.getAWSCheckbox().getSelection()) {
				return pageTwo;
			} else if (pageOne.getEucalyptusCheckbox().getSelection()) {
				return pageThree;
			}
		}
		else {
			return super.getNextPage(page);
		}
		
		return null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof IAdaptable) {
			this.project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
		}
	}
	
	public boolean canFinish() {
		if ((pageOne.getAWSCheckbox().getSelection() || 
			pageOne.getEucalyptusCheckbox().getSelection())) {
			return true;
		}
		
		return false;
	}

	public boolean performFinish() {
		if (pageOne.getAWSCheckbox().getSelection()) {
			new AWSCloudService(project, 
					pageOne.getCheckedPackageNames(),
					pageTwo.getAccessKey().getText(),
					pageTwo.getSecretKey().getText()
					).prepareToPublish();
		}
		if (pageOne.getEucalyptusCheckbox().getSelection()) {
			new EucalyptusCloudService(project,
					pageOne.getCheckedPackageNames(),
					pageThree.getAccessKey().getText(),
					pageThree.getSecretKey().getText()
					).prepareToPublish();
		}
		return true;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}
	
	public IProject getProject() {
		return project;
	}
}
