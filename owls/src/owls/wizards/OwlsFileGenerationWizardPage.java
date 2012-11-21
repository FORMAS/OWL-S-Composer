/*******************************************************************************
 * Copyright (c) 2008 OWL-S Composer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André Fonseca - initial API and implementation
 *******************************************************************************/

package owls.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import owls.plugin.Activator;

/**
 * @author Andre Fonseca
 *
 */
public class OwlsFileGenerationWizardPage extends WizardPage {

	private Text diagramText;

	/**
	 * Constructor for SampleNewWizardPage.
	 * @param pageName
	 */
	public OwlsFileGenerationWizardPage() {
		super("wizardPage");
		setTitle("OWL-S Composer");
		setDescription("This wizard creates a new owl-s file with *.owl extension from an owls_diagram.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Owls Diagram:");

		diagramText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		diagramText.setLayoutData(gd);
		diagramText.addModifyListener(new ModifyListener() {
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

		initialize();
		dialogChanged();
		setControl(container);
	}
	
	/**
	 * Tests if the current workbench selection is a suitable
	 * container to use.
	 */
	
	private void initialize() {
		if ((Activator.getCurrentFilePath())!=null) {
			diagramText.setText(Activator.getCurrentFilePath().toOSString());
		}
		diagramText.setFocus();
	}
	
	/**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private void handleBrowse() {
		FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
	    fd.setText("Open");
	    String[] filterExt = {"*.owls_diagram"};
	    fd.setFilterExtensions(filterExt);
	    String selected = fd.open();
	    diagramText.setText(selected);
	}
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		String diagramName = getDiagramText();

		if ((diagramName.length() == 0) && (diagramText.isFocusControl())) {
			updateStatus("OWLS Diagram must be set.");
			return;
		}
		int dotLoc = diagramName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = diagramName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("owls_diagram") == false) {
				updateStatus("File extension must be \"owls_diagram\".");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getDiagramText() {
		return diagramText.getText();
	}

}

