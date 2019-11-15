package wildcardrepresentationaspectualacme.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart;
import wildcardrepresentationaspectualacme.diagram.parsers.MessageFormatParser;
import wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import aspectualacme.AspectualacmePackage;

/**
 * @generated
 */
public class AspectualacmeParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5001Parser() {
		if (componentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			componentName_5001Parser = parser;
		}
		return componentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser wildCardName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getWildCardName_5002Parser() {
		if (wildCardName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			wildCardName_5002Parser = parser;
		}
		return wildCardName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5001Parser();
		case WildCardNameEditPart.VISUAL_ID:
			return getWildCardName_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AspectualacmeVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AspectualacmeVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AspectualacmeElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

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
