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

package owls.facade;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andre Fonseca
 *
 */
public class OwlsInitializerFacade {

	private String mainProcessName;
	
	private String processNamespace;
	
	private List<OwlsParameterFacade> mainProcessInputs = new ArrayList<OwlsParameterFacade>();
	
	private List<OwlsParameterFacade> mainProcessOutputs = new ArrayList<OwlsParameterFacade>();
	
	private List<File> composedFiles = new ArrayList<File>();

	public String getMainProcessName() {
		return mainProcessName;
	}

	public void setMainProcessName(String mainProcessName) {
		this.mainProcessName = mainProcessName;
	}

	public String getProcessNamespace() {
		return processNamespace;
	}

	public void setProcessNamespace(String processNamespace) {
		this.processNamespace = processNamespace;
	}

	public List<OwlsParameterFacade> getMainProcessInputs() {
		return mainProcessInputs;
	}

	public List<OwlsParameterFacade> getMainProcessOutputs() {
		return mainProcessOutputs;
	}

	public List<File> getComposedFiles() {
		return composedFiles;
	}
}
