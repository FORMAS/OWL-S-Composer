package owls.generator;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import owls.*;;

public class GenComposition
{
  protected static String nl;
  public static synchronized GenComposition create(String lineSeparator)
  {
    nl = lineSeparator;
    GenComposition result = new GenComposition();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "<process:ControlConstructList>" + NL + "\t\t  ";
  protected final String TEXT_3 = "<list:first rdf:resource=\"#";
  protected final String TEXT_4 = "\" />" + NL + "\t\t  ";
  protected final String TEXT_5 = "<list:rest>";
  protected final String TEXT_6 = NL + "\t\t\t\t     ";
  protected final String TEXT_7 = NL + NL + "\t\t  ";
  protected final String TEXT_8 = "</list:rest>";
  protected final String TEXT_9 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = "</process:ControlConstructList>";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = "<process:ControlConstructBag>" + NL + "\t\t  ";
  protected final String TEXT_14 = "<list:first rdf:resource=\"#";
  protected final String TEXT_15 = "\" />" + NL + "\t\t  ";
  protected final String TEXT_16 = "<list:rest>";
  protected final String TEXT_17 = NL + "\t\t\t\t     ";
  protected final String TEXT_18 = NL + "\t\t  ";
  protected final String TEXT_19 = "</list:rest>";
  protected final String TEXT_20 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_21 = NL;
  protected final String TEXT_22 = "</process:ControlConstructBag>";
  protected final String TEXT_23 = NL;
  protected final String TEXT_24 = "<process:ControlConstructList>" + NL + "\t\t  ";
  protected final String TEXT_25 = "<list:first rdf:resource=\"#";
  protected final String TEXT_26 = "\" />" + NL + "\t\t  ";
  protected final String TEXT_27 = "<list:rest>";
  protected final String TEXT_28 = NL + "\t\t\t\t     ";
  protected final String TEXT_29 = NL + "\t\t  ";
  protected final String TEXT_30 = "</list:rest>";
  protected final String TEXT_31 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_32 = NL;
  protected final String TEXT_33 = "</process:ControlConstructList>";
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = "<process:ControlConstructBag>" + NL + "\t\t  ";
  protected final String TEXT_36 = "<list:first rdf:resource=\"#";
  protected final String TEXT_37 = "\" />" + NL + "\t\t  ";
  protected final String TEXT_38 = "<list:rest>";
  protected final String TEXT_39 = NL + "\t\t\t\t     ";
  protected final String TEXT_40 = NL + "\t\t  ";
  protected final String TEXT_41 = "</list:rest>";
  protected final String TEXT_42 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_43 = NL;
  protected final String TEXT_44 = "</process:ControlConstructBag>";
  protected final String TEXT_45 = "<process:Sequence>" + NL + "\t\t\t";
  protected final String TEXT_46 = "<process:components>";
  protected final String TEXT_47 = NL + "\t\t\t\t   ";
  protected final String TEXT_48 = NL + "\t\t\t";
  protected final String TEXT_49 = "</process:components>" + NL + "\t\t";
  protected final String TEXT_50 = "</process:Sequence>";
  protected final String TEXT_51 = NL + "\t  \t";
  protected final String TEXT_52 = "<process:ControlConstructList>" + NL + "\t  \t\t";
  protected final String TEXT_53 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_54 = "<process:Sequence>" + NL + "\t\t\t\t\t";
  protected final String TEXT_55 = "<process:components>";
  protected final String TEXT_56 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_57 = NL + "\t\t\t\t\t";
  protected final String TEXT_58 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_59 = "</process:Sequence>" + NL + "\t\t  \t";
  protected final String TEXT_60 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_61 = "<list:rest>";
  protected final String TEXT_62 = NL + "\t\t\t\t     ";
  protected final String TEXT_63 = NL + "\t\t  \t";
  protected final String TEXT_64 = "</list:rest>";
  protected final String TEXT_65 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_66 = NL + "\t\t";
  protected final String TEXT_67 = "</process:ControlConstructList>";
  protected final String TEXT_68 = NL + "\t\t  ";
  protected final String TEXT_69 = "<process:ControlConstructBag>" + NL + "\t  \t\t";
  protected final String TEXT_70 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_71 = "<process:Sequence>" + NL + "\t\t\t\t\t";
  protected final String TEXT_72 = "<process:components>";
  protected final String TEXT_73 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_74 = NL + "\t\t\t\t\t";
  protected final String TEXT_75 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_76 = "</process:Sequence>" + NL + "\t\t  \t";
  protected final String TEXT_77 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_78 = "<list:rest>";
  protected final String TEXT_79 = NL + "\t\t\t\t     ";
  protected final String TEXT_80 = NL + "\t\t  \t";
  protected final String TEXT_81 = "</list:rest>";
  protected final String TEXT_82 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_83 = NL + "\t\t";
  protected final String TEXT_84 = "</process:ControlConstructBag>";
  protected final String TEXT_85 = "<process:Split>" + NL + "\t\t\t";
  protected final String TEXT_86 = "<process:components>";
  protected final String TEXT_87 = NL + "\t\t\t\t   ";
  protected final String TEXT_88 = NL + "\t\t\t";
  protected final String TEXT_89 = "</process:components>" + NL + "\t\t";
  protected final String TEXT_90 = "</process:Split>";
  protected final String TEXT_91 = NL + "\t  \t";
  protected final String TEXT_92 = "<process:ControlConstructList>" + NL + "\t  \t\t";
  protected final String TEXT_93 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_94 = "<process:Split>" + NL + "\t\t\t\t\t";
  protected final String TEXT_95 = "<process:components>";
  protected final String TEXT_96 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_97 = NL + "\t\t\t\t\t";
  protected final String TEXT_98 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_99 = "</process:Split>" + NL + "\t\t  \t";
  protected final String TEXT_100 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_101 = "<list:rest>";
  protected final String TEXT_102 = NL + "\t\t\t\t     ";
  protected final String TEXT_103 = NL + "\t\t  \t";
  protected final String TEXT_104 = "</list:rest>";
  protected final String TEXT_105 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_106 = NL + "\t\t";
  protected final String TEXT_107 = "</process:ControlConstructList>";
  protected final String TEXT_108 = NL + "\t\t  ";
  protected final String TEXT_109 = "<process:ControlConstructBag>" + NL + "\t  \t\t";
  protected final String TEXT_110 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_111 = "<process:Split>" + NL + "\t\t\t\t\t";
  protected final String TEXT_112 = "<process:components>";
  protected final String TEXT_113 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_114 = NL + "\t\t\t\t\t";
  protected final String TEXT_115 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_116 = "</process:Split>" + NL + "\t\t  \t";
  protected final String TEXT_117 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_118 = "<list:rest>";
  protected final String TEXT_119 = NL + "\t\t\t\t     ";
  protected final String TEXT_120 = NL + "\t\t  \t";
  protected final String TEXT_121 = "</list:rest>";
  protected final String TEXT_122 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_123 = NL + "\t\t";
  protected final String TEXT_124 = "</process:ControlConstructBag>";
  protected final String TEXT_125 = "<process:AnyOrder>" + NL + "\t\t\t";
  protected final String TEXT_126 = "<process:components>";
  protected final String TEXT_127 = NL + "\t\t\t\t   ";
  protected final String TEXT_128 = NL + "\t\t\t";
  protected final String TEXT_129 = "</process:components>" + NL + "\t\t";
  protected final String TEXT_130 = "</process:AnyOrder>";
  protected final String TEXT_131 = NL + "\t  \t";
  protected final String TEXT_132 = "<process:ControlConstructList>" + NL + "\t  \t\t";
  protected final String TEXT_133 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_134 = "<process:AnyOrder>" + NL + "\t\t\t\t\t";
  protected final String TEXT_135 = "<process:components>";
  protected final String TEXT_136 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_137 = NL + "\t\t\t\t\t";
  protected final String TEXT_138 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_139 = "</process:AnyOrder>" + NL + "\t\t  \t";
  protected final String TEXT_140 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_141 = "<list:rest>";
  protected final String TEXT_142 = NL + "\t\t\t\t     ";
  protected final String TEXT_143 = NL + "\t\t  \t";
  protected final String TEXT_144 = "</list:rest>";
  protected final String TEXT_145 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_146 = NL + "\t\t";
  protected final String TEXT_147 = "</process:ControlConstructList>";
  protected final String TEXT_148 = NL + "\t\t  ";
  protected final String TEXT_149 = "<process:ControlConstructBag>" + NL + "\t  \t\t";
  protected final String TEXT_150 = "<list:first>" + NL + "\t\t\t\t";
  protected final String TEXT_151 = "<process:AnyOrder>" + NL + "\t\t\t\t\t";
  protected final String TEXT_152 = "<process:components>";
  protected final String TEXT_153 = NL + "\t\t\t\t\t\t   ";
  protected final String TEXT_154 = NL + "\t\t\t\t\t";
  protected final String TEXT_155 = "</process:components>" + NL + "\t\t\t\t";
  protected final String TEXT_156 = "</process:AnyOrder>" + NL + "\t\t  \t";
  protected final String TEXT_157 = "</list:first>" + NL + "\t\t  \t";
  protected final String TEXT_158 = "<list:rest>";
  protected final String TEXT_159 = NL + "\t\t\t\t     ";
  protected final String TEXT_160 = NL + "\t\t  \t";
  protected final String TEXT_161 = "</list:rest>";
  protected final String TEXT_162 = "<list:rest rdf:resource=\"&list;#nil\"/>";
  protected final String TEXT_163 = NL + "\t\t";
  protected final String TEXT_164 = "</process:ControlConstructBag>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     List arg = (ArrayList)argument;
List rest = (List)arg.get(0);
EObject cc = (EObject)rest.get(0);
String ident = (String)arg.get(1);
String identAdd = new String();
identAdd ="			";


if (cc instanceof OwlsAtomicProcess){
	OwlsAtomicProcess aProcess = (OwlsAtomicProcess)cc;
	if ((aProcess.eContainer() instanceof OwlsSequence)){
    stringBuffer.append(TEXT_1);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(ident);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(aProcess.getPeformedBy().getID());
    stringBuffer.append(TEXT_4);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_5);
    
					 GenComposition gen = new GenComposition();
			   		 List newArg = new ArrayList();
				     newArg.add(rest.subList(1,rest.size()));
				     newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_8);
    
		  }else {
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_9);
    
		  }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_11);
    
	}
  	if ((aProcess.eContainer() instanceof OwlsAnyOrder) ||
  		(aProcess.eContainer() instanceof OwlsSplit)){
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(aProcess.getPeformedBy().getID());
    stringBuffer.append(TEXT_15);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_16);
    
					 GenComposition gen = new GenComposition();
			   		 List newArg = new ArrayList();
				     newArg.add(rest.subList(1,rest.size()));
				     newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_19);
    
		  }else {
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_20);
    
		  }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_22);
    
	}
}

if (cc instanceof OwlsCompositeProcess){
	OwlsCompositeProcess cProcess = (OwlsCompositeProcess)cc;
	if ((cProcess.eContainer() instanceof OwlsSequence)){
    stringBuffer.append(TEXT_23);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cProcess.getPeformedBy().getID());
    stringBuffer.append(TEXT_26);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_27);
    
					 GenComposition gen = new GenComposition();
			   		 List newArg = new ArrayList();
				     newArg.add(rest.subList(1,rest.size()));
				     newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_30);
    
		  }else {
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_31);
    
		  }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_33);
    
	}
  	if ((cProcess.eContainer() instanceof OwlsAnyOrder) ||
  		(cProcess.eContainer() instanceof OwlsSplit)){
    stringBuffer.append(TEXT_34);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cProcess.getPeformedBy().getID());
    stringBuffer.append(TEXT_37);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_38);
    
					 GenComposition gen = new GenComposition();
			   		 List newArg = new ArrayList();
				     newArg.add(rest.subList(1,rest.size()));
				     newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_41);
    
		  }else {
		  
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_42);
    
		  }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_44);
    
	}
}

if (cc instanceof OwlsSequence){
	OwlsSequence sequence = (OwlsSequence)cc;
	if (!(sequence.eContainer() instanceof OwlsSequence) &&
		!(sequence.eContainer() instanceof OwlsAnyOrder) &&
		!(sequence.eContainer() instanceof OwlsSplit)){
	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_46);
    
				   EList children = sequence.getElements();
				   GenComposition gen = new GenComposition();
				   List newArg = new ArrayList();
				   newArg.add(children);
				   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_50);
    
	}else
	{
	  if (sequence.eContainer() instanceof OwlsSequence){
    stringBuffer.append(TEXT_51);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_55);
    
						   EList children = sequence.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_60);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_61);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(gen.generate(newArg2));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_64);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_65);
    
			}
    stringBuffer.append(TEXT_66);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_67);
    
	  }
	  if ((sequence.eContainer() instanceof OwlsAnyOrder) ||
	  	  (sequence.eContainer() instanceof OwlsSplit)){
    stringBuffer.append(TEXT_68);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_72);
    
						   EList children = sequence.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_77);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_78);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(gen.generate(newArg2));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_81);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_82);
    
			}
    stringBuffer.append(TEXT_83);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_84);
    
	  }
	 }
}
if (cc instanceof OwlsSplit){
	OwlsSplit split = (OwlsSplit)cc;
	if (!(split.eContainer() instanceof OwlsSequence) &&
		!(split.eContainer() instanceof OwlsAnyOrder) &&
		!(split.eContainer() instanceof OwlsSplit)){
	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_86);
    
				   EList children = split.getElements();
				   GenComposition gen = new GenComposition();
				   List newArg = new ArrayList();
				   newArg.add(children);
				   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_90);
    
	}else
	{
	  if ((split.eContainer() instanceof OwlsSequence)){
    stringBuffer.append(TEXT_91);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_95);
    
						   EList children = split.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_100);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_101);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(gen.generate(newArg2));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_104);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_105);
    
			}
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_107);
    
	  }
	  if ((split.eContainer() instanceof OwlsAnyOrder) ||
	  	  (split.eContainer() instanceof OwlsSplit)){
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_112);
    
						   EList children = split.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_117);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_118);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_119);
    stringBuffer.append(gen.generate(newArg2));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_121);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_122);
    
			}
    stringBuffer.append(TEXT_123);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_124);
    
	  }
	 }
}
if (cc instanceof OwlsAnyOrder){
	OwlsAnyOrder anyOrder = (OwlsAnyOrder)cc;
	if ((anyOrder.eContainer() instanceof OwlsSequence) &&
		(anyOrder.eContainer() instanceof OwlsAnyOrder) &&
		(anyOrder.eContainer() instanceof OwlsSplit)){
	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_126);
    
				   EList children = anyOrder.getElements();
				   GenComposition gen = new GenComposition();
				   List newArg = new ArrayList();
				   newArg.add(children);
				   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_129);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_130);
    
	}else
	{
	  if ((anyOrder.eContainer() instanceof OwlsSequence)){
    stringBuffer.append(TEXT_131);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_135);
    
						   EList children = anyOrder.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_139);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_140);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_141);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_142);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_144);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_145);
    
			}
    stringBuffer.append(TEXT_146);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_147);
    
	  }
	  if ((anyOrder.eContainer() instanceof OwlsAnyOrder) ||
	  	  (anyOrder.eContainer() instanceof OwlsSplit)){
    stringBuffer.append(TEXT_148);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_149);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_152);
    
						   EList children = anyOrder.getElements();
						   GenComposition gen = new GenComposition();
						   List newArg = new ArrayList();
						   newArg.add(children);
						   newArg.add(ident+identAdd);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(gen.generate(newArg));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_157);
    if (!(rest.subList(1,rest.size()).isEmpty())){
		  	
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_158);
    
			   		 List newArg2 = new ArrayList();
				     newArg2.add(rest.subList(1,rest.size()));
				     newArg2.add(ident+identAdd);
    stringBuffer.append(TEXT_159);
    stringBuffer.append(gen.generate(newArg2));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_161);
    
		  	}else {
			
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_162);
    
			}
    stringBuffer.append(TEXT_163);
    stringBuffer.append(ident);
    stringBuffer.append(TEXT_164);
    
	  }
	 }
} 
    return stringBuffer.toString();
  }
}
