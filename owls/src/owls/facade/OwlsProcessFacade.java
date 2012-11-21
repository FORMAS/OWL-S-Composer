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


/**
 * @author Andre Fonseca
 *
 */
import org.eclipse.emf.common.util.EList;

import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsProcess;

public class OwlsProcessFacade {

	private OwlsCompositeProcess rootProcess;
	
	public 	OwlsProcessFacade(OwlsCompositeProcess rootProcess){
		this.rootProcess = rootProcess;
	}
	
	public void setProcessRName(OwlsProcess process){
		String uri = process.getProcessURI();
		
		int charLoc = uri.indexOf("#");
		String rname = uri.substring((charLoc+1), (uri.length()-1));
		process.setReferenceName(rname);
	}
	
	public String getProcessURI(OwlsProcess process){
		String uri = process.getProcessURI();
		
		int charLoc = uri.indexOf("#");
		String newUri = uri.substring(0, charLoc);
		return newUri;
	}
	
	public EList<OwlsProcess> getAllProcess(){
		OwlsControlConstruct firstConstruct = rootProcess.getComposedOf();
		
		if (firstConstruct != null){
			EList<OwlsProcess> result = firstConstruct.getProcesses();
			EList<OwlsControlConstruct> innerConstructs = firstConstruct.getConstructs();
			for (int i=0; i < innerConstructs.size();i++){
				getAllProcess(innerConstructs, result);
			}
			return result;
		}
		return null;
	}
	

	private void getAllProcess(EList<OwlsControlConstruct> innerConstructs, EList<OwlsProcess> result) {
		
		for (int i=0; i< innerConstructs.size(); i++){
			OwlsControlConstruct cc = innerConstructs.get(i);
			EList<OwlsProcess> ccResult = cc.getProcesses();
			result.addAll(ccResult);
			EList<OwlsControlConstruct> innerCC = cc.getConstructs();
			if (cc != null) {
				getAllProcess(innerCC, result);
			}
		}
	}
}
