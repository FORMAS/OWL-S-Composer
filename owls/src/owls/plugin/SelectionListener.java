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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author Andre Fonseca
 *
 */
public class SelectionListener implements ISelectionListener {
	
	private ISelection currentSelection;

	public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
		// we ignore our own selections
		if (sourcepart != Activator.getDefault()) {
		    this.currentSelection = selection;
		}
	}

	public ISelection getCurrentSelection() {
		return currentSelection;
	}

	public void setCurrentSelection(ISelection currentSelection) {
		this.currentSelection = currentSelection;
	}
	
}
