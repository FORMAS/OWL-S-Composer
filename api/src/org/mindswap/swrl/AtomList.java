// The MIT License
//
// Copyright (c) 2004 Evren Sirin
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/*
 * Created on Oct 26, 2004
 */
package org.mindswap.swrl;

import java.util.List;

import org.mindswap.owl.list.RDFList;
import org.mindswap.query.ABoxQuery;
import org.mindswap.query.ValueMap;

/**
 * @author Evren Sirin
 */
public interface AtomList extends RDFList {
	public Atom atomAt(int index);
	
	/**
	 * Apply the given values possibly binding some of the variables in this AtomList to 
	 * concrete values.
	 *
	 * @param values
	 * @return
	 */
	public AtomList apply(ValueMap values);
	
	/**
	 * Create a query out of this atom list.
	 */
	public ABoxQuery toQuery();
	
	/**
	 * Create a query out of this atom list with the specified variables put into the 
	 * result variables.
	 */	
	public ABoxQuery toQuery(List resultVars);
}
