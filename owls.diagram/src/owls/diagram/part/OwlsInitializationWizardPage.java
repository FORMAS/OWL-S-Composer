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

package owls.diagram.part;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import owls.facade.OwlsInitializerFacade;
import owls.facade.OwlsParameterFacade;

/**
 * @author Andre Fonseca
 *
 */
public class OwlsInitializationWizardPage extends WizardPage {

	private Label outputsLabel;
	private Label inputsLabel;
	private Label namespaceLabel;
	private Label serviceNameLabel;
	private Button addButton_1;
	private Button removeButton_1;
	private Button removeButton;
	private Button addButton;
	private Text serviceText;
	private Text namespaceText;
	private Table tableInput;
	private Table tableOutput;
	private Button inputOntology;
	private Button outputOntology;


	private static final String INPUT_NAME = "inputName";
	private static final String OUTPUT_NAME = "outputName";	
	private static final String PARAMETER_TYPE = "parameterType";
//	private static final String ONTOLOGY_TYPE = "ontologyType";

	/**
	 * Constructor for SampleNewWizardPage.
	 * @param pageName
	 */
	public OwlsInitializationWizardPage() {
		super("wizardPage");
		setTitle("OWL-S Composer");
		setDescription("Set the main attributes of the new OWL-S file.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		serviceText = new Text(container, SWT.BORDER);
		serviceText.setBounds(110, 20, 343, 20);
		serviceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		namespaceText = new Text(container, SWT.BORDER);
		namespaceText.setBounds(110, 60, 343, 20);
		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		tableInput = new Table(container, SWT.BORDER);
		tableInput.setHeaderVisible(true);
		tableInput.setBounds(15, 125, 440, 105);

		final TableColumn newColumnTableColumn = new TableColumn(tableInput, SWT.NONE);
		newColumnTableColumn.setResizable(false);
		newColumnTableColumn.setWidth(229);
		newColumnTableColumn.setText("Name");

		final TableColumn newColumnTableColumn_1 = new TableColumn(tableInput, SWT.NONE);
		newColumnTableColumn_1.setResizable(false);
		newColumnTableColumn_1.setWidth(207);
		newColumnTableColumn_1.setText("Type");

		tableInput.addListener(SWT.MeasureItem, new Listener() {
			public void handleEvent(Event event) {
				// height cannot be per row so simply set
				event.height = 20;
			}
		});


		tableOutput = new Table(container, SWT.BORDER);
		tableOutput.setHeaderVisible(true);
		tableOutput.setBounds(15, 295, 440, 105);

		final TableColumn newColumnTableColumn_3 = new TableColumn(tableOutput, SWT.NONE);
		newColumnTableColumn_3.setResizable(false);
		newColumnTableColumn_3.setWidth(229);
		newColumnTableColumn_3.setText("Name");

		final TableColumn newColumnTableColumn_2 = new TableColumn(tableOutput, SWT.NONE);
		newColumnTableColumn_2.setResizable(false);
		newColumnTableColumn_2.setWidth(207);
		newColumnTableColumn_2.setText("Type");

		tableOutput.addListener(SWT.MeasureItem, new Listener() {
			public void handleEvent(Event event) {
				// height cannot be per row so simply set
				event.height = 20;
			}
		});

		removeButton = new Button(container, SWT.NONE);
		removeButton.setText("Remove");
		removeButton.setBounds(75, 240, 60, 23);
		removeButton.setEnabled(false);
		removeButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleRemoveInput();
				if (tableInput.getItemCount()==0){
					removeButton.setEnabled(false);
				}
				else{
					tableInput.setSelection(0);
				}
				dialogChanged();
			}
		});

		addButton = new Button(container, SWT.NONE);
		addButton.setText("Add");
		addButton.setBounds(15, 240, 54, 23);
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleAddInput();
				tableInput.setSelection(0);
				removeButton.setEnabled(true);
				dialogChanged();
			}
		});

		removeButton_1 = new Button(container, SWT.NONE);
		removeButton_1.setText("Remove");
		removeButton_1.setBounds(75, 410, 60, 23);
		removeButton_1.setEnabled(false);
		removeButton_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleRemoveOutput();
				if (tableOutput.getItemCount()==0){
					removeButton_1.setEnabled(false);
				}
				else{
					tableOutput.setSelection(0);
				}
				dialogChanged();
			}
		});

		addButton_1 = new Button(container, SWT.NONE);
		addButton_1.setText("Add");
		addButton_1.setBounds(15, 410, 54, 23);
		addButton_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleAddOutput();
				tableOutput.setSelection(0);
				removeButton_1.setEnabled(true);
				dialogChanged();
			}
		});

		serviceNameLabel = new Label(container, SWT.NONE);
		serviceNameLabel.setText("Service Name:");
		serviceNameLabel.setBounds(15, 25, 92, 15);

		namespaceLabel = new Label(container, SWT.NONE);
		namespaceLabel.setText("Namespace:");
		namespaceLabel.setBounds(15, 65, 92, 15);

		inputsLabel = new Label(container, SWT.NONE);
		inputsLabel.setText("Inputs");
		inputsLabel.setBounds(15, 105, 54, 15);

		inputOntology = new Button(container, SWT.CHECK);
		inputOntology.setText("Use ontology");
		inputOntology.setBounds(110, 105, 343, 15);
		inputOntology.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (inputOntology.getSelection()){
					newColumnTableColumn_1.setText("Ontology URI");
				} else{
					newColumnTableColumn_1.setText("Type");
				}
				super.widgetSelected(e);
			}
		});

		outputsLabel = new Label(container, SWT.NONE);
		outputsLabel.setText("Outputs");
		outputsLabel.setBounds(15, 275, 54, 15);

		outputOntology = new Button(container, SWT.CHECK);
		outputOntology.setText("Use ontology");
		outputOntology.setBounds(110, 275, 343, 15);
		outputOntology.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (outputOntology.getSelection()){
					newColumnTableColumn_2.setText("Ontology URI");
				} else{
					newColumnTableColumn_2.setText("Type");
				}
				super.widgetSelected(e);
				super.widgetSelected(e);
			}
		});

		tableInput.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				removeButton.setEnabled(true);
			}
		});

		tableOutput.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				removeButton_1.setEnabled(true);
			}
		});

		initialize();
		dialogChanged();
		setControl(container);
		container.setTabList(new Control[] {serviceText, namespaceText, removeButton, addButton, tableOutput, removeButton_1, addButton_1, serviceNameLabel, namespaceLabel, inputsLabel, outputsLabel, tableInput});
	}

	/**
	 * Tests if the current workbench selection is a suitable
	 * container to use.
	 */

	private void initialize() {
		serviceText.setFocus();
	}

	/**
	 * Set this wizard's values in the initializer object
	 */
	public void setInitializationValues(OwlsInitializerFacade facade){
		facade.setMainProcessName(serviceText.getText().toString());
		facade.setProcessNamespace(namespaceText.getText().toString());
		TableItem[] inputItens = tableInput.getItems();
		for (TableItem tableItem : inputItens) {
			TableEditor textEditor = (TableEditor)tableItem.getData(INPUT_NAME);
			Text text = (Text)textEditor.getEditor();
			TableEditor comboEditor = (TableEditor)tableItem.getData(PARAMETER_TYPE);
			OwlsParameterFacade parameter = null;
			if (comboEditor.getEditor() instanceof Combo){
				Combo combo = (Combo)comboEditor.getEditor();
				parameter = new OwlsParameterFacade(text.getText(),combo.getText());				
			} else {
				Text ontology = (Text)comboEditor.getEditor();
				parameter = new OwlsParameterFacade(text.getText(),ontology.getText());
			}
			facade.getMainProcessInputs().add(parameter);
		}
		TableItem[] outputItens = tableOutput.getItems();
		for (TableItem tableItem : outputItens) {
			TableEditor textEditor = (TableEditor)tableItem.getData(OUTPUT_NAME);
			Text text = (Text)textEditor.getEditor();
			TableEditor comboEditor = (TableEditor)tableItem.getData(PARAMETER_TYPE);
			OwlsParameterFacade parameter = null;
			if (comboEditor.getEditor() instanceof Combo){
			Combo combo = (Combo)comboEditor.getEditor();
			parameter = new OwlsParameterFacade(text.getText(),combo.getText());
			} else {
				Text ontology = (Text)comboEditor.getEditor();
				parameter = new OwlsParameterFacade(text.getText(),ontology.getText());
			}
			facade.getMainProcessOutputs().add(parameter);
		}
	}

	private void handleAddInput() {
		TableItem tableItem = new TableItem(tableInput,SWT.NONE);		
		TableEditor editor = new TableEditor (tableInput);

		Text inputName = new Text(tableInput, SWT.BORDER);
		inputName.pack();

		editor.grabHorizontal = true;
		editor.horizontalAlignment = SWT.CENTER;
		editor.minimumHeight = 21;
		editor.setEditor(inputName, tableItem, 0);
		tableItem.setData(INPUT_NAME,editor);

		editor = new TableEditor (tableInput);

		if (inputOntology.getSelection()){
			Text inputOntology = new Text(tableInput, SWT.BORDER);
			inputName.pack();
			editor.grabHorizontal=true;
			editor.horizontalAlignment = SWT.CENTER;
			editor.minimumHeight = 20;
			editor.setEditor(inputOntology, tableItem, 1);
			tableItem.setData(PARAMETER_TYPE,editor);
		} else {
			Combo comboType = new Combo(tableInput, SWT.CHECK);
			addWsdlTypes(comboType);
			comboType.pack();
			editor.grabHorizontal=true;
			editor.horizontalAlignment = SWT.CENTER;
			editor.minimumHeight = 20;
			editor.setEditor(comboType, tableItem, 1);
			tableItem.setData(PARAMETER_TYPE,editor);
		}


	}

	private void handleRemoveInput() {
		int index = tableInput.getSelectionIndex();
		if (index != -1){
			TableEditor editorName = (TableEditor)tableInput.getItem(index).getData(INPUT_NAME);
			editorName.getEditor().dispose();
			TableEditor editorCombo = (TableEditor)tableInput.getItem(index).getData(PARAMETER_TYPE);
			editorCombo.getEditor().dispose();
			tableInput.remove(index);
		}
	}

	private void handleAddOutput() {
		TableItem tableItem = new TableItem(tableOutput,SWT.NONE);
		TableEditor editor = new TableEditor (tableOutput);

		Text outputName = new Text(tableOutput, SWT.BORDER);
		outputName.pack();

		editor.grabHorizontal = true;
		editor.horizontalAlignment = SWT.CENTER;
		editor.minimumHeight = 21;
		editor.setEditor(outputName, tableItem, 0);
		tableItem.setData(OUTPUT_NAME,editor);

		editor = new TableEditor (tableOutput);

		if (outputOntology.getSelection()){
			Text ontologyType = new Text(tableOutput, SWT.BORDER);
			ontologyType.pack();
			editor.grabHorizontal = true;
			editor.horizontalAlignment = SWT.CENTER;
			editor.minimumHeight = 20;
			editor.setEditor(ontologyType, tableItem, 1);
			tableItem.setData(PARAMETER_TYPE,editor);

		} else {
			Combo comboType = new Combo(tableOutput, SWT.CHECK);
			addWsdlTypes(comboType);
			comboType.pack();
			editor.grabHorizontal = true;
			editor.horizontalAlignment = SWT.CENTER;
			editor.minimumHeight = 20;
			editor.setEditor(comboType, tableItem, 1);
			tableItem.setData(PARAMETER_TYPE,editor);
		}
	}

	private void handleRemoveOutput() {
		int index = tableOutput.getSelectionIndex();
		if (index != -1){
			TableEditor editorName = (TableEditor)tableOutput.getItem(index).getData(OUTPUT_NAME);
			editorName.getEditor().dispose();
			TableEditor editorCombo = (TableEditor)tableOutput.getItem(index).getData(PARAMETER_TYPE);
			editorCombo.getEditor().dispose();
			tableOutput.remove(index);
		}
	}

	private void addWsdlTypes(Combo comboType) {
		comboType.add("anyURI");
		comboType.add("binary");
		comboType.add("byte");
		comboType.add("boolean");
		comboType.add("date");
		comboType.add("decimal");
		comboType.add("double");
		comboType.add("float");
		comboType.add("int");
		comboType.add("integer");
		comboType.add("long");
		comboType.add("negativeInteger");
		comboType.add("nonNegativeInteger");
		comboType.add("nonPositiveInteger");
		comboType.add("positiveInteger");
		comboType.add("short");
		comboType.add("string");
		comboType.add("time");
		comboType.add("unsignedInt");
		comboType.add("unsignedByte");
		comboType.add("unsignedLong");
		comboType.add("unsignedShort");
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		String serviceName = getServiceText();
		String namespaceName = getNamespaceText();

		if ((serviceName.length() == 0) && (namespaceText.isFocusControl())) {
			updateStatus("Service name must be specified");
			return;
		}
		if ((namespaceName.length() == 0) && (tableInput.isFocusControl())) {
			updateStatus("Namespace must be specified");
			return;
		}
		if ((tableInput.getSelectionCount() == 0) && (tableOutput.isFocusControl())){
			updateStatus("Service must has at least one input");
			return;
		}
		if ((tableOutput.getSelectionCount() == 0) && (tableOutput.isFocusControl())){
			updateStatus("Service must has at least one output");
			return;
		}


		updateStatus(null);
	}

	@Override
	public boolean canFlipToNextPage() {	
		if ((serviceText.getText().length() != 0) && (namespaceText.getText().length() !=0) 
				&& (tableInput.getItemCount() > 0) && (tableOutput.getItemCount() > 0)){
			return isPageComplete() && getNextPage() != null;
		}
		return false;
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getNamespaceText() {
		return namespaceText.getText();
	}

	public String getServiceText() {
		return serviceText.getText();
	}

}