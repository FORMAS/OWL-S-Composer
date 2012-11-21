/*
 * Created on Aug 30, 2004
 */
package impl.owls.process;

import impl.owl.WrappedIndividual;

import org.mindswap.exceptions.NotImplementedException;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLType;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Binding;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.process.ParameterValue;
import org.mindswap.owls.process.ValueData;
import org.mindswap.owls.process.ValueOf;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.utils.RDFUtils;

/**
 * @author Evren Sirin
 */
public abstract class BindingImpl extends WrappedIndividual implements Binding {
    public BindingImpl(OWLIndividual ind) {
        super(ind);
    }

    public ParameterValue getValue() {
        ParameterValue value = 
            (ParameterValue) getPropertyAs(OWLS.Process.valueSource, ValueOf.class);
        
        if(value == null) {
    	    OWLDataValue dataValue = getProperty(OWLS.Process.valueData);	    
    	    if(dataValue != null) {
    	        Parameter param = getParameter();
    	        OWLType paramType = (param == null) ? null : param.getParamType();
    	        OWLValue owlValue = null;
				if((paramType == null) || paramType.isDataType())
				    owlValue = dataValue;
				else {
				    String rdf = RDFUtils.addRDFTag( dataValue.getLexicalValue() );
				    owlValue = getOntology().parseLiteral( rdf );
				}
				
				return getKB().createValueData(owlValue);
    	    }
        }
//        if(value == null)
//            value = (ParameterValue) getProperty(OWLS.Process.valueForm);
//        
//        if(value == null)
//            value = (ParameterValue) getPropertyAs(OWLS.Process.valueType, ParameterValue.class);
//        
//        if(value == null)
//            value = (ParameterValue) getPropertyAs(OWLS.Process.valueSpecifier, ValueOf.class);
//        
//        if(value == null)
//            value = (ParameterValue) getPropertyAs(OWLS.Process.valueFunction, ValueFunction.class);
        
        
        return value;
    }

    /* (non-Javadoc)
     * @see org.mindswap.owls.process.Binding#setValue(org.mindswap.owls.process.ParameterValue)
     */
    public void setValue(ParameterValue paramValue) {
        if(paramValue instanceof ValueOf)
            setProperty(OWLS.Process.valueSource, (ValueOf) paramValue);
        else if (paramValue instanceof ValueData) {
            OWLValue value = ((ValueData) paramValue).getData();
            if( value.isDataValue() )
                setProperty(OWLS.Process.valueData, (OWLDataValue) value);
            else
                setProperty(OWLS.Process.valueData, ((OWLIndividual) value).toRDF(false));            
        }
        else
            throw new NotImplementedException("Only ValueOf parameter values are implemented!");
    }

}
