package owls.generator;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import owls.facade.*;
import owls.*;;

public class Model2Owl
{
  protected static String nl;
  public static synchronized Model2Owl create(String lineSeparator)
  {
    nl = lineSeparator;
    Model2Owl result = new Model2Owl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE uridef[" + NL + "  <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns\">" + NL + "  <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema\">" + NL + "  <!ENTITY owl \"http://www.w3.org/2002/07/owl\">" + NL + "  <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema\">" + NL + "  <!ENTITY service \"http://www.daml.org/services/owl-s/1.1/Service.owl\">" + NL + "  <!ENTITY profile \"http://www.daml.org/services/owl-s/1.1/Profile.owl\">" + NL + "  <!ENTITY process \"http://www.daml.org/services/owl-s/1.1/Process.owl\">" + NL + "  <!ENTITY grounding \"http://www.daml.org/services/owl-s/1.1/Grounding.owl\">" + NL + "  <!ENTITY expr \"http://www.daml.org/services/owl-s/1.1/generic/Expression.owl\">" + NL + "  <!ENTITY swrl \"http://www.w3.org/2003/11/swrl\">" + NL + "  <!ENTITY swrlb \"http://www.w3.org/2003/11/swrlb\">" + NL + "  <!ENTITY list \"http://www.daml.org/services/owl-s/1.1/generic/ObjectList.owl\"> ";
  protected final String TEXT_2 = " " + NL + "  <!ENTITY ";
  protected final String TEXT_3 = " \"";
  protected final String TEXT_4 = "\">  ";
  protected final String TEXT_5 = NL + "  <!ENTITY concepts \"http://www.mindswap.org/2004/owl-s/concepts.owl\">  " + NL + "  <!ENTITY this \"";
  protected final String TEXT_6 = "\">  " + NL + "]>" + NL + "<rdf:RDF" + NL + "  xmlns:rdf=\"&rdf;#\" " + NL + "  xmlns:rdfs=\"&rdfs;#\" " + NL + "  xmlns:owl=\"&owl;#\" " + NL + "  xmlns:xsd=\"&xsd;#\" " + NL + "  xmlns:service=\"&service;#\" " + NL + "  xmlns:profile=\"&profile;#\" " + NL + "  xmlns:process=\"&process;#\" " + NL + "  xmlns:grounding=\"&grounding;#\" " + NL + "  xmlns:expr=\"&expr;#\"" + NL + "  xmlns:swrl=\"&swrl;#\"" + NL + "  xmlns:list=\"&list;#\"" + NL + "  xml:base=\"&this;\"" + NL + "  xmlns=\"&this;#\"" + NL + ">" + NL + "" + NL + "<owl:Ontology rdf:about=\"\">";
  protected final String TEXT_7 = NL + "\t<owl:imports rdf:resource=\"&";
  protected final String TEXT_8 = ";\"/>";
  protected final String TEXT_9 = NL + "</owl:Ontology>" + NL + "" + NL + "<!-- Service description -->" + NL + "<service:Service rdf:ID=\"";
  protected final String TEXT_10 = "\">" + NL + "\t<service:presents rdf:resource=\"#";
  protected final String TEXT_11 = "\"/>" + NL + "" + NL + "\t<service:describedBy rdf:resource=\"#";
  protected final String TEXT_12 = "\"/>" + NL + "" + NL + "\t<service:supports rdf:resource=\"#";
  protected final String TEXT_13 = "\"/>" + NL + "</service:Service>" + NL + "" + NL + "<!-- Profile description -->" + NL + "<profile:Profile rdf:ID=\"";
  protected final String TEXT_14 = "\">" + NL + "\t<service:isPresentedBy rdf:resource=\"#";
  protected final String TEXT_15 = "\"/>" + NL + "" + NL + "\t<profile:serviceName xml:lang=\"en\">";
  protected final String TEXT_16 = "</profile:serviceName>" + NL;
  protected final String TEXT_17 = " " + NL + "\t<profile:hasInput rdf:resource=\"#";
  protected final String TEXT_18 = "\"/>";
  protected final String TEXT_19 = " " + NL + "\t<profile:hasOutput rdf:resource=\"#";
  protected final String TEXT_20 = "\"/>";
  protected final String TEXT_21 = NL + "</profile:Profile>" + NL + "" + NL + "<!-- Process Model description -->" + NL + "<process:CompositeProcess rdf:about=\"#";
  protected final String TEXT_22 = "\">" + NL + "\t<service:describes rdf:resource=\"#";
  protected final String TEXT_23 = "\"/>" + NL + "\t";
  protected final String TEXT_24 = " " + NL + "\t<process:hasInput>" + NL + "\t\t<process:Input rdf:ID=\"";
  protected final String TEXT_25 = "\">" + NL + "\t\t\t<process:parameterType rdf:datatype=\"&xsd;#anyURI\">" + NL + "\t\t\t\t";
  protected final String TEXT_26 = "</process:parameterType>" + NL + "\t\t\t</process:Input>" + NL + "\t</process:hasInput>" + NL + "\t";
  protected final String TEXT_27 = " " + NL + "\t<process:hasOutput>" + NL + "\t\t<process:Output rdf:ID=\"";
  protected final String TEXT_28 = "\">" + NL + "\t\t\t<process:parameterType rdf:datatype=\"&xsd;#anyURI\">" + NL + "\t\t\t\t";
  protected final String TEXT_29 = NL + "\t\t\t</process:parameterType>" + NL + "\t\t</process:Output>" + NL + "\t</process:hasOutput>";
  protected final String TEXT_30 = NL + "\t" + NL + "\t<process:hasResult>" + NL + "\t\t<process:Result>" + NL + "\t\t\t<process:withOutput>";
  protected final String TEXT_31 = NL + "\t\t\t\t<process:OutputBinding>" + NL + "\t\t\t\t\t<process:valueSource>" + NL + "\t\t\t\t\t\t<process:ValueOf>" + NL + "\t\t\t\t\t\t<process:fromProcess rdf:resource=\"#";
  protected final String TEXT_32 = "\"/>" + NL + "\t\t\t\t\t\t<process:theVar rdf:resource=\"&";
  protected final String TEXT_33 = ";#";
  protected final String TEXT_34 = "\"/>" + NL + "\t\t\t\t\t\t</process:ValueOf>" + NL + "\t\t\t\t\t</process:valueSource>" + NL + "\t\t\t\t\t<process:toParam rdf:resource=\"#";
  protected final String TEXT_35 = "\"/>" + NL + "\t\t\t\t</process:OutputBinding>" + NL + "\t\t\t</process:withOutput>" + NL + "\t\t</process:Result>" + NL + "\t</process:hasResult>";
  protected final String TEXT_36 = NL + "\t" + NL + "\t<process:composedOf>" + NL + "     \t";
  protected final String TEXT_37 = NL + "\t</process:composedOf>" + NL + "" + NL + "</process:CompositeProcess>" + NL;
  protected final String TEXT_38 = NL + "<process:Perform rdf:ID=\"";
  protected final String TEXT_39 = "\">" + NL + "\t<process:process rdf:resource=\"&";
  protected final String TEXT_40 = ";#";
  protected final String TEXT_41 = "\"/>";
  protected final String TEXT_42 = NL + "\t<process:hasDataFrom>" + NL + "\t\t<process:InputBinding>" + NL + "\t\t\t<process:valueSource>" + NL + "\t\t\t\t<process:ValueOf>" + NL + "\t\t\t\t<process:fromProcess rdf:resource=\"&process;#TheParentPerform\"/>" + NL + "\t\t\t\t<process:theVar rdf:resource=\"#";
  protected final String TEXT_43 = "\"/>" + NL + "\t\t\t\t</process:ValueOf>" + NL + "\t\t\t</process:valueSource>" + NL + "\t\t\t<process:toParam rdf:resource=\"&";
  protected final String TEXT_44 = ";#";
  protected final String TEXT_45 = "\"/>" + NL + "\t\t</process:InputBinding>" + NL + "\t</process:hasDataFrom>";
  protected final String TEXT_46 = NL + "\t<process:hasDataFrom>" + NL + "\t\t<process:InputBinding>" + NL + "\t\t\t<process:valueSource>" + NL + "\t\t\t\t<process:ValueOf>" + NL + "\t\t\t\t<process:fromProcess rdf:resource=\"#";
  protected final String TEXT_47 = "\"/>" + NL + "\t\t\t\t<process:theVar rdf:resource=\"&";
  protected final String TEXT_48 = ";#";
  protected final String TEXT_49 = "\"/>" + NL + "\t\t\t\t</process:ValueOf>" + NL + "\t\t\t</process:valueSource>" + NL + "\t\t\t<process:toParam rdf:resource=\"&";
  protected final String TEXT_50 = ";#";
  protected final String TEXT_51 = "\"/>" + NL + "\t\t</process:InputBinding>" + NL + "\t</process:hasDataFrom>";
  protected final String TEXT_52 = NL + "</process:Perform>" + NL;
  protected final String TEXT_53 = NL + "<!-- Grounding description -->" + NL + "<grounding:WsdlGrounding rdf:ID=\"";
  protected final String TEXT_54 = "\">" + NL + "\t<service:supportedBy rdf:resource=\"#";
  protected final String TEXT_55 = "\"/>";
  protected final String TEXT_56 = NL + "\t<grounding:hasAtomicProcessGrounding rdf:resource=\"&";
  protected final String TEXT_57 = ";#";
  protected final String TEXT_58 = "\"/>";
  protected final String TEXT_59 = NL + "</grounding:WsdlGrounding>" + NL + "" + NL + "</rdf:RDF>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     OwlsCompositeProcess compositeProcess = (OwlsCompositeProcess) argument; 
   Owls owls = compositeProcess.getDescribes().getOwnedBy();
   EList<OwlsInput> inputs = compositeProcess.getHasInputs();
   EList<OwlsOutput> outputs = compositeProcess.getHasOutputs();
   OwlsProcessFacade processFacade = new OwlsProcessFacade(compositeProcess); 
   EList<OwlsProcess> processes = processFacade.getAllProcess();
   String ident = new String();
   
   for (Iterator i = processes.iterator(); i.hasNext(); ){
   		processFacade.setProcessRName((OwlsProcess)i.next());
   }

    stringBuffer.append(TEXT_1);
     for (Iterator i = processes.iterator(); i.hasNext(); ) {
  		OwlsProcess process = (OwlsProcess)i.next();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(process.getReferenceName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(processFacade.getProcessURI(process));
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(owls.getNamespace());
    stringBuffer.append(TEXT_6);
    
	for (Iterator i = processes.iterator(); i.hasNext(); ) {
			OwlsProcess process = (OwlsProcess)i.next();
    stringBuffer.append(TEXT_7);
    stringBuffer.append(process.getReferenceName());
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(owls.getService().getID() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(owls.getProfile().getID() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(owls.getProcess().getID() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(owls.getService().getSupports().getID() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(owls.getProfile().getID() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(owls.getService().getID() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(compositeProcess.getLabel());
    stringBuffer.append(TEXT_16);
     
     for (Iterator i = inputs.iterator(); i.hasNext(); ) {
       OwlsInput input = (OwlsInput)i.next();
 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(input.getID());
    stringBuffer.append(TEXT_18);
     } 
     for (Iterator i = outputs.iterator(); i.hasNext(); ) {
     	OwlsOutput output = (OwlsOutput)i.next();
 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(output.getID());
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(owls.getProcess().getID() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(owls.getService().getID() );
    stringBuffer.append(TEXT_23);
     for (Iterator i = inputs.iterator(); i.hasNext(); ) {
       	OwlsInput input = (OwlsInput)i.next();
 	
    stringBuffer.append(TEXT_24);
    stringBuffer.append(input.getID());
    stringBuffer.append(TEXT_25);
     String parameterType = input.getParameterType();
					if (parameterType.startsWith("http")){
						stringBuffer.append(parameterType);
					} else {
						stringBuffer.append("&xsd;#"+parameterType);
					} 
    stringBuffer.append(TEXT_26);
     }
     for (Iterator i = outputs.iterator(); i.hasNext(); ) {
     	OwlsOutput output = (OwlsOutput)i.next();
 	
    stringBuffer.append(TEXT_27);
    stringBuffer.append(output.getID());
    stringBuffer.append(TEXT_28);
     String parameterType = output.getParameterType();
				if (parameterType.startsWith("http")){
					stringBuffer.append(parameterType);
				} else {
					stringBuffer.append("&xsd;#"+parameterType);
				} 
    stringBuffer.append(TEXT_29);
     } 
    stringBuffer.append(TEXT_30);
    
			for (Iterator i = processes.iterator(); i.hasNext(); ) {
				OwlsProcess process = (OwlsProcess)i.next();
				EList<OwlsAssignClient> clientAssings = process.getMessagesBindings();
				for (Iterator j = clientAssings.iterator(); j.hasNext(); ) {
					EObject object = (EObject)j.next();
					if ( object instanceof OwlsAssignOutputClient) {
						OwlsAssignOutputClient assignOut = (OwlsAssignOutputClient)object;
    stringBuffer.append(TEXT_31);
    stringBuffer.append(assignOut.getProcessReference().getPeformedBy().getID());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(assignOut.getProcessReference().getReferenceName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(assignOut.getInputReferences().getID());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(assignOut.getOutputsReferences().getID());
    stringBuffer.append(TEXT_35);
     } 
	} }
    stringBuffer.append(TEXT_36);
     GenComposition gen = new GenComposition();
     	   List arg = new ArrayList();
     	   List objects = new ArrayList();
     	   objects.add(compositeProcess.getComposedOf());
     	   arg.add(objects);
     	   arg.add(ident);
     	   stringBuffer.append(gen.generate(arg));
    stringBuffer.append(TEXT_37);
     for (Iterator i = processes.iterator(); i.hasNext(); ) {
	OwlsProcess process = (OwlsProcess)i.next();
    stringBuffer.append(TEXT_38);
    stringBuffer.append(process.getPeformedBy().getID());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(process.getReferenceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(process.getID());
    stringBuffer.append(TEXT_41);
    
	EList<OwlsAssignClient> clientAssings = process.getMessagesBindings();
	for (Iterator j = clientAssings.iterator(); j.hasNext(); ) {
		EObject object = (EObject)j.next();
		if ( object instanceof OwlsAssignInputClient) {
			OwlsAssignInputClient assignIn = (OwlsAssignInputClient)object;
    stringBuffer.append(TEXT_42);
    stringBuffer.append(assignIn.getInputReferences().getID());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(assignIn.getProcessReference().getReferenceName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(assignIn.getOutputsReferences().getID());
    stringBuffer.append(TEXT_45);
     }
	}
	EList<OwlsAssign> bindings = process.getBindings();
	for (Iterator j = bindings.iterator(); j.hasNext(); ) {
		EObject object = (EObject)j.next();
		OwlsAssign assign = (OwlsAssign)object;
    stringBuffer.append(TEXT_46);
    stringBuffer.append(assign.getSource().getPeformedBy().getID());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(assign.getSource().getReferenceName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(assign.getOutputSource().getID());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(assign.getTarget().getReferenceName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(assign.getInputTarget().getID());
    stringBuffer.append(TEXT_51);
     } 
    stringBuffer.append(TEXT_52);
     } 
    stringBuffer.append(TEXT_53);
    stringBuffer.append(owls.getService().getSupports().getID() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append(owls.getService().getID() );
    stringBuffer.append(TEXT_55);
    
	for (Iterator i = processes.iterator(); i.hasNext(); ) {
	      OwlsProcess process = (OwlsProcess)i.next();
	      EList<OwlsWsdlAtomicProcessGrounding> groundings = process.getDescribes().getSupports().getHasAtomicProcessGrounding();
	      OwlsWsdlAtomicProcessGrounding atomicGrounding = (OwlsWsdlAtomicProcessGrounding)groundings.get(0);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(process.getReferenceName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(atomicGrounding.getID());
    stringBuffer.append(TEXT_58);
     } 
    stringBuffer.append(TEXT_59);
    return stringBuffer.toString();
  }
}
