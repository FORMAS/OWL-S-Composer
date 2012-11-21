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

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;


/**
 * @author Andre Fonseca
 *
 */
public class OwlsKBFacade {
	
	private static List<File> composedFiles = new ArrayList<File>();
	
	private static OWLKnowledgeBase kb = OWLFactory.createKB();

	public static OWLKnowledgeBase getKb() {
		return kb;
	}
}
