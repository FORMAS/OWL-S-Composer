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

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.ui.internal.wizards.datatransfer.IDataTransferHelpContextIds;
import org.eclipse.ui.internal.wizards.datatransfer.MinimizedFileSystemElement;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;

import owls.cloud.PublishDescriptor;
import owls.facade.OwlsInitializerFacade;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


/**
 * @author Andre Fonseca
 *
 */
public class OwlsSelectionWizardPage extends WizardResourceImportPage
implements Listener{
	
	// widgets
    protected Combo sourceNameField;
    
    protected Text publisherDescriptorField;

    protected Button createContainerStructureButton;

    protected Button createOnlySelectedButton;

    protected Button sourceBrowseButton;

    //A boolean to indicate if the user has typed anything
    private boolean entryChanged = false;
    
    // dialog store id constants
    private final static String STORE_SOURCE_NAMES_ID = "OwlsSelectionWizardPage.STORE_SOURCE_NAMES_ID";//$NON-NLS-1$

    private static final String SELECT_SOURCE_TITLE = DataTransferMessages.FileImport_selectSourceTitle;

    private static final String SELECT_SOURCE_MESSAGE = DataTransferMessages.FileImport_selectSource;

    protected static final String SOURCE_EMPTY_MESSAGE = DataTransferMessages.FileImport_sourceEmpty;
    
    // selection list
    protected List selectionList;
    
    protected ArrayList<PublishDescriptor> descriptorsList;

	/**
     *	Creates an instance of this class
     */
    protected OwlsSelectionWizardPage(String name,
            IWorkbench aWorkbench, IStructuredSelection selection) {
        super(name, selection);
    }

    /**
     *	Creates an instance of this class
     *
     * @param aWorkbench IWorkbench
     * @param selection IStructuredSelection
     */
    public OwlsSelectionWizardPage(IWorkbench aWorkbench,
            IStructuredSelection selection) {
        this("Owl-s Composer", aWorkbench, selection);//$NON-NLS-1$
        setTitle("Owl-s Composer");
        setDescription("Select files with *.owl extension to compose an owl file.");
    }


    /* (non-Javadoc)
     * Method declared on IDialogPage.
     */
    public void createControl(Composite parent) {

        initializeDialogUnits(parent);

        Composite composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                | GridData.HORIZONTAL_ALIGN_FILL));
        composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        composite.setFont(parent.getFont());
        Label label = new Label(composite, SWT.NULL);
		label.setText("Enter the Publish Descriptor URI (optional, comma-separated)");
		publisherDescriptorField = new Text(composite, SWT.BORDER | SWT.SINGLE);
		publisherDescriptorField.setData("publishDescriptor", "publishDescriptor");
		publisherDescriptorField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
        createSourceGroup(composite);

        restoreWidgetValues();
        updateWidgetEnablements();
        setPageComplete(determinePageCompletion());
        setErrorMessage(null);	// should not initially have error message

        setControl(composite);
        
        validateSourceGroup();
        PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(),
                IDataTransferHelpContextIds.FILE_SYSTEM_IMPORT_WIZARD_PAGE);
        
        initialize();
    }
    
    protected void initialize(){
    	// Seting default path
        sourceNameField.setText(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toOSString());
        setMessage("Select files with *.owl extension to compose an owl file,");
        descriptorsList = new ArrayList<PublishDescriptor>();
    }

    /**
     *	Create the group for creating the root directory
     */
    protected void createRootDirectoryGroup(Composite parent) {
        Composite sourceContainerGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        sourceContainerGroup.setLayout(layout);
        sourceContainerGroup.setFont(parent.getFont());
        sourceContainerGroup.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

        Label groupLabel = new Label(sourceContainerGroup, SWT.NONE);
        groupLabel.setText(getSourceLabel());
        groupLabel.setFont(parent.getFont());

        // source name entry field
        sourceNameField = new Combo(sourceContainerGroup, SWT.BORDER);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        sourceNameField.setLayoutData(data);
        sourceNameField.setFont(parent.getFont());

        sourceNameField.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                updateFromSourceField();
            }
        });

        sourceNameField.addKeyListener(new KeyListener() {
            /*
             * @see KeyListener.keyPressed
             */
            public void keyPressed(KeyEvent e) {
                //If there has been a key pressed then mark as dirty
                entryChanged = true;
            }

            /*
             * @see KeyListener.keyReleased
             */
            public void keyReleased(KeyEvent e) {
            }
        });

        sourceNameField.addFocusListener(new FocusListener() {
            /*
             * @see FocusListener.focusGained(FocusEvent)
             */
            public void focusGained(FocusEvent e) {
                //Do nothing when getting focus
            }

            /*
             * @see FocusListener.focusLost(FocusEvent)
             */
            public void focusLost(FocusEvent e) {
                //Clear the flag to prevent constant update
                if (entryChanged) {
                    entryChanged = false;
                    updateFromSourceField();
                }

            }
        });

        // source browse button
        sourceBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
        sourceBrowseButton.setText(DataTransferMessages.DataTransfer_browse);
        sourceBrowseButton.addListener(SWT.Selection, this);
        sourceBrowseButton.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL));
        sourceBrowseButton.setFont(parent.getFont());
        setButtonLayoutData(sourceBrowseButton);
    }

    /**
     * Update the receiver from the source name field.
     */

    private void updateFromSourceField() {

        setSourceName(sourceNameField.getText());
        //Update enablements when this is selected
        updateWidgetEnablements();
    }

    /**
     * Creates and returns a <code>FileSystemElement</code> if the specified
     * file system object merits one.  The criteria for this are:
     * Also create the children.
     */
    protected MinimizedFileSystemElement createRootElement(
            Object fileSystemObject, IImportStructureProvider provider) {
        boolean isContainer = provider.isFolder(fileSystemObject);
        String elementLabel = provider.getLabel(fileSystemObject);

        // Use an empty label so that display of the element's full name
        // doesn't include a confusing label
        MinimizedFileSystemElement dummyParent = new MinimizedFileSystemElement(
                "", null, true);//$NON-NLS-1$
        dummyParent.setPopulated();
        MinimizedFileSystemElement result = new MinimizedFileSystemElement(
                elementLabel, dummyParent, isContainer);
        result.setFileSystemObject(fileSystemObject);

        //Get the files for the element so as to build the first level
        result.getFiles(provider);

        return dummyParent;
    }

    /**
     *	Create the import source specification widgets
     */
    protected void createSourceGroup(Composite parent) {
    	
        createRootDirectoryGroup(parent);
        createFileSelectionGroup(parent);            
    }


    /**
     *	Answer a boolean indicating whether the specified source currently exists
     *	and is valid
     */
    protected boolean ensureSourceIsValid() {
        if (new File(getSourceDirectoryName()).isDirectory()) {
			return true;
		}

        setErrorMessage(DataTransferMessages.FileImport_invalidSource);
        sourceNameField.setFocus();
        return false;
    }

    /**
     *	Update the values selected by the user.
     * @param facade 
     *
     * @return boolean
     */
    public void setSelectedFiles(OwlsInitializerFacade facade) {
        if (!ensureSourceIsValid()) {
			return ;
		}

        saveWidgetValues();
        
        Iterator resourcesEnum = getSelectionList().iterator();
        List fileSystemObjects = new ArrayList();
        
        String descriptors = publisherDescriptorField.getText();
        StringTokenizer descriptorTokens = new StringTokenizer(descriptors, ",; ");
        while(descriptorTokens.hasMoreTokens()){
        	URL publishDescriptorURL;
			try {
				String descriptorURL = descriptorTokens.nextToken();
				System.err.println(descriptorURL);
				if(descriptorURL.length() > 0){
					publishDescriptorURL = new URL(descriptorURL);
					PublishDescriptor publishDescriptor = new PublishDescriptor(publishDescriptorURL);
					fileSystemObjects.addAll(publishDescriptor.getOWLSFromFile());
					
					descriptorsList.add(publishDescriptor);
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        //Save the descriptor File
        
        while (resourcesEnum.hasNext()) {
            fileSystemObjects.add(((FileSystemElement) resourcesEnum.next())
                    .getFileSystemObject());
        }
        
        List fileList = facade.getComposedFiles();
    	for (Object object : fileSystemObjects) {
			if ((object instanceof File) && !(fileList.contains(object))){
				File file = (File)object;
				facade.getComposedFiles().add(file);
			}
		}

        return;
    }

    /**
     * Returns a content provider for <code>FileSystemElement</code>s that returns 
     * only files as children.
     */
    protected ITreeContentProvider getFileProvider() {
        return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (o instanceof MinimizedFileSystemElement) {
                    MinimizedFileSystemElement element = (MinimizedFileSystemElement) o;
                    Object[] files = element.getFiles(
                            FileSystemStructureProvider.INSTANCE).getChildren(
                            element);
                    List filter = new ArrayList();
                    for (int i=0; i<files.length;i++) {
                    	Object object = files[i];
						if (object instanceof MinimizedFileSystemElement){
							MinimizedFileSystemElement fileObject = (MinimizedFileSystemElement)object;
							String extension = fileObject.getFileNameExtension();
							//FIXME Extension owls??
							if (extension.equals("owl")){
								filter.add(fileObject);
							}
						}
					}
                    return filter.toArray();
                }
                return new Object[0];
            }
        };
    }

    /**
     *	Answer the root FileSystemElement that represents the contents of
     *	the currently-specified source.  If this FileSystemElement is not
     *	currently defined then create and return it.
     */
    protected MinimizedFileSystemElement getFileSystemTree() {

        File sourceDirectory = getSourceDirectory();
        if (sourceDirectory == null) {
			return null;
		}

        return selectFiles(sourceDirectory,
                FileSystemStructureProvider.INSTANCE);
    }

    /**
     * Returns a content provider for <code>FileSystemElement</code>s that returns 
     * only folders as children.
     */
    protected ITreeContentProvider getFolderProvider() {
        return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (o instanceof MinimizedFileSystemElement) {
                    MinimizedFileSystemElement element = (MinimizedFileSystemElement) o;
                    return element.getFolders(
                            FileSystemStructureProvider.INSTANCE).getChildren(
                            element);
                }
                return new Object[0];
            }

            public boolean hasChildren(Object o) {
                if (o instanceof MinimizedFileSystemElement) {
                    MinimizedFileSystemElement element = (MinimizedFileSystemElement) o;
                    return getChildren(element).length > 0;
                }
                return false;
            }
        };
    }

    /**
     * Returns a File object representing the currently-named source directory iff
     * it exists as a valid directory, or <code>null</code> otherwise.
     */
    protected File getSourceDirectory() {
        return getSourceDirectory(this.sourceNameField.getText());
    }

    /**
     * Returns a File object representing the currently-named source directory iff
     * it exists as a valid directory, or <code>null</code> otherwise.
     *
     * @param path a String not yet formatted for java.io.File compatability
     */
    private File getSourceDirectory(String path) {
        File sourceDirectory = new File(getSourceDirectoryName(path));
        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            return null;
        }

        return sourceDirectory;
    }

    /**
     *	Answer the directory name specified as being the import source.
     *	Note that if it ends with a separator then the separator is first
     *	removed so that java treats it as a proper directory
     */
    private String getSourceDirectoryName() {
        return getSourceDirectoryName(this.sourceNameField.getText());
    }

    /**
     *	Answer the directory name specified as being the import source.
     *	Note that if it ends with a separator then the separator is first
     *	removed so that java treats it as a proper directory
     */
    private String getSourceDirectoryName(String sourceName) {
        IPath result = new Path(sourceName.trim());

        if (result.getDevice() != null && result.segmentCount() == 0) {
			result = result.addTrailingSeparator();
		} else {
			result = result.removeTrailingSeparator();
		}

        return result.toOSString();
    }

    /**
     *	Answer the string to display as the label for the source specification field
     */
    protected String getSourceLabel() {
        return DataTransferMessages.FileImport_fromDirectory;
    }

    /**
     *	Handle all events and enablements for widgets in this dialog
     *
     * @param event Event
     */
    public void handleEvent(Event event) {
        if (event.widget == sourceBrowseButton) {
			handleSourceBrowseButtonPressed();
		}

        super.handleEvent(event);
    }

    /**
     *	Open an appropriate source browser so that the user can specify a source
     *	to import from
     */
    protected void handleSourceBrowseButtonPressed() {

        String currentSource = this.sourceNameField.getText();
        DirectoryDialog dialog = new DirectoryDialog(
                sourceNameField.getShell(), SWT.SAVE);
        dialog.setText(SELECT_SOURCE_TITLE);
        dialog.setMessage(SELECT_SOURCE_MESSAGE);
        dialog.setFilterPath(getSourceDirectoryName(currentSource));

        String selectedDirectory = dialog.open();
        if (selectedDirectory != null) {
            //Just quit if the directory is not valid
            if ((getSourceDirectory(selectedDirectory) == null)
                    || selectedDirectory.equals(currentSource)) {
				return;
			}
            //If it is valid then proceed to populate
            setErrorMessage(null);
            setSourceName(selectedDirectory);
            selectionGroup.setFocus();
        }
    }

    /**
     *	Repopulate the view based on the currently entered directory.
     */
    protected void resetSelection() {

    	//setupSelectionsBasedOnSelectedTypes();
        MinimizedFileSystemElement currentRoot = getFileSystemTree();
        this.selectionGroup.setRoot(currentRoot);

    }

    /**
     * Invokes a file selection operation using the specified file system and
     * structure provider.  If the user specifies files to be imported then
     * this selection is cached for later retrieval and is returned.
     */
    protected MinimizedFileSystemElement selectFiles(
            final Object rootFileSystemObject,
            final IImportStructureProvider structureProvider) {

        final MinimizedFileSystemElement[] results = new MinimizedFileSystemElement[1];
        
        BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
            public void run() {
                //Create the root element from the supplied file system object
                results[0] = createRootElement(rootFileSystemObject,
                        structureProvider);
            }
        });

        return results[0];
    }

    /**
     * Sets the source name of the import to be the supplied path.
     * Adds the name of the path to the list of items in the
     * source combo and selects it.
     *
     * @param path the path to be added
     */
    protected void setSourceName(String path) {

        if (path.length() > 0) {

            String[] currentItems = this.sourceNameField.getItems();
            int selectionIndex = -1;
            for (int i = 0; i < currentItems.length; i++) {
                if (currentItems[i].equals(path)) {
					selectionIndex = i;
				}
            }
            if (selectionIndex < 0) {
                int oldLength = currentItems.length;
                String[] newItems = new String[oldLength + 1];
                System.arraycopy(currentItems, 0, newItems, 0, oldLength);
                newItems[oldLength] = path;
                this.sourceNameField.setItems(newItems);
                selectionIndex = oldLength;
            }
            this.sourceNameField.select(selectionIndex);

            resetSelection();
        }
    }

    /* (non-Javadoc)
     * Method declared on IDialogPage. Set the selection up when it becomes visible.
     */
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        resetSelection();
        if (visible) {
			this.sourceNameField.setFocus();
		}
    }

    /**
     * Update the selections with those in map . Implemented here to give inner class
     * visibility
     * @param map Map - key tree elements, values Lists of list elements
     */
    protected void updateSelections(Map map) {
        super.updateSelections(map);
    }

    protected boolean validatePublisherDescriptor() {
       if(publisherDescriptorField.getText() != ""){
    	   return true;
       }
       return false;
    }
    
    /**
     *	Answer a boolean indicating whether self's source specification
     *	widgets currently all contain valid values.
     */
    protected boolean validateSourceGroup() {
        File sourceDirectory = getSourceDirectory();
        if (sourceDirectory == null) {
            setMessage(SOURCE_EMPTY_MESSAGE);
            return false;
        }

        List resources = selectionGroup.getAllWhiteCheckedItems();
        if (resources.size() == 0){
        	setMessage(null);
        	setErrorMessage(DataTransferMessages.FileImport_noneSelected);
        	return false;
        }
        
		setErrorMessage(null);
        return true;
    }
    
    @Override
    protected boolean determinePageCompletion() {
        boolean complete = (validateSourceGroup()||validatePublisherDescriptor());

        // Avoid draw flicker by not clearing the error
        // message unless all is valid.
        if (complete) {
			setErrorMessage(null);
			selectionList = getSelectedResources();
		}

        return complete;
    }
    
    /**
     *	Use the dialog store to restore widget values to the values that they held
     *	last time this wizard was used to completion
     */
    protected void restoreWidgetValues() {
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
            String[] sourceNames = settings.getArray(STORE_SOURCE_NAMES_ID);
            if (sourceNames == null) {
				return; // ie.- no values stored, so stop
			}

            // set filenames history
            for (int i = 0; i < sourceNames.length; i++) {
				sourceNameField.add(sourceNames[i]);
			}
        }
    }

    /**
     * 	Since Finish was pressed, write widget values to the dialog store so that they
     *	will persist into the next invocation of this wizard page
     */
    protected void saveWidgetValues() {
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
            // update source names history
            String[] sourceNames = settings.getArray(STORE_SOURCE_NAMES_ID);
            if (sourceNames == null) {
				sourceNames = new String[0];
			}

            sourceNames = addToHistory(sourceNames, getSourceDirectoryName());
            settings.put(STORE_SOURCE_NAMES_ID, sourceNames);
        }
    }
    
    public List getSelectionList() {
		return selectionList;
	}

	public void setSelectionList(List selectionList) {
		this.selectionList = selectionList;
	}
	
	public List getDescriptorsList() {
		return descriptorsList;
	}
}
