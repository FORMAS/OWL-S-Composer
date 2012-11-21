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

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import owls.OwlsCompositeProcess;
import owls.OwlsPackage;

/**
 * @author Andre Fonseca
 *
 */
public class EMFModelLoad {
	
	public OwlsCompositeProcess load(String path) {
		// Initialize the model
		OwlsPackage.eINSTANCE.eClass();
		
		// Register the XMI resource factory for the .owls_diagram extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("owls_diagram", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		//Resource resource = resSet.createResource(URI.createURI(path));
		Resource resource = resSet.getResource(URI.createFileURI(path), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		OwlsCompositeProcess owlsComposite = (OwlsCompositeProcess) resource.getContents().get(0);
		return owlsComposite;
	}

}
