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

package owls.plugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "owls_composer";

	// The shared instance
	private static Activator plugin;
	
	// The current project selected
	private static IProject currentProject;
	
	// The current file selected
	private static IPath currentFilePath;
	
	// The SelectionListener needed to capture resources
	private static SelectionListener listener;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		listener = new SelectionListener();
		this.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(listener);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		this.getWorkbench().getActiveWorkbenchWindow().getSelectionService().removeSelectionListener(listener);
		
		plugin = null;
		super.stop(context);
	}

	public void init(){
		this.setChangedResource(listener.getCurrentSelection());
	}
	
	public void setChangedResource(ISelection selection){
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object currentSelection = ss.getFirstElement();
			if (currentSelection instanceof IResource) {
				currentProject= ((IResource)currentSelection).getProject();
	        } 
			else if (currentSelection instanceof IAdaptable) {
				IAdaptable a = (IAdaptable)currentSelection;
				Object adapter = a.getAdapter(IResource.class);
				if (adapter instanceof IResource) {
					IResource currentResource = (IResource)adapter;
					if (currentResource instanceof IFile) {
						currentResource = (IFile)currentResource;
						currentFilePath = currentResource.getRawLocation();
					}
					currentProject = currentResource.getProject();
				}
			}
		}
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static IProject getCurrentProject() {
		return currentProject;
	}

	public static IPath getCurrentFilePath() {
		return currentFilePath;
	}
	
	public static SelectionListener getListener() {
		return listener;
	}
	
	public static void setListener(SelectionListener listener) {
		Activator.listener = listener;
	}
}
