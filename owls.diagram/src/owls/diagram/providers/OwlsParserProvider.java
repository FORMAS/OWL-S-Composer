package owls.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsPackage;
import owls.diagram.edit.parts.OwlsAtomicProcessIDEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessIDEditPart;
import owls.diagram.parsers.MessageFormatParser;
import owls.diagram.part.OwlsVisualIDRegistry;

/**
 * @generated
 */
public class OwlsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser owlsAtomicProcessID_4001Parser;

	/**
	 * @generated
	 */
	private IParser getOwlsAtomicProcessID_4001Parser() {
		if (owlsAtomicProcessID_4001Parser == null) {
			owlsAtomicProcessID_4001Parser = createOwlsAtomicProcessID_4001Parser();
		}
		return owlsAtomicProcessID_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOwlsAtomicProcessID_4001Parser() {
		EAttribute[] features = new EAttribute[] { OwlsPackage.eINSTANCE
				.getOwlsProcess_ID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser owlsCompositeProcessID_4002Parser;

	/**
	 * @generated
	 */
	private IParser getOwlsCompositeProcessID_4002Parser() {
		if (owlsCompositeProcessID_4002Parser == null) {
			owlsCompositeProcessID_4002Parser = createOwlsCompositeProcessID_4002Parser();
		}
		return owlsCompositeProcessID_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOwlsCompositeProcessID_4002Parser() {
		EAttribute[] features = new EAttribute[] { OwlsPackage.eINSTANCE
				.getOwlsProcess_ID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case OwlsAtomicProcessIDEditPart.VISUAL_ID:
			return getOwlsAtomicProcessID_4001Parser();
		case OwlsCompositeProcessIDEditPart.VISUAL_ID:
			return getOwlsCompositeProcessID_4002Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(OwlsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OwlsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (OwlsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
