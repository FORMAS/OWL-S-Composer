/*
 * Created on Dec 30, 2004
 */
package impl.owls.process;

import impl.owl.OWLObjectImpl;

import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.ValueData;

/**
 * @author Evren Sirin
 *
 */
public class ValueDataImpl extends OWLObjectImpl implements ValueData {
    private OWLValue value;
    
    public ValueDataImpl(OWLValue value) {
        this.value = value;
    }
    
    public OWLValue getData() {
        return value;
    }

    public Object getImplementation() {
        return getData().getImplementation();
    }
}
