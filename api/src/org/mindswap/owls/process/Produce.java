/*
 * Created on Jan 4, 2005
 */
package org.mindswap.owls.process;


/**
 * @author Evren Sirin
 *
 */
public interface Produce extends ControlConstruct {
    public OutputBinding getBinding();
    
    public void setBinding(OutputBinding binding);
}
