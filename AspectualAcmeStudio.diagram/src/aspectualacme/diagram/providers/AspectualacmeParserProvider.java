package aspectualacme.diagram.providers;

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

import aspectualacme.AspectualacmePackage;
import aspectualacme.diagram.edit.parts.ComponentNameEditPart;
import aspectualacme.diagram.edit.parts.ConnectorNameEditPart;
import aspectualacme.diagram.edit.parts.GlueEditPart;
import aspectualacme.diagram.edit.parts.WildCardNameEditPart;
import aspectualacme.diagram.parsers.MessageFormatParser;
import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;

/**
 * @generated
 */
public class AspectualacmeParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser connectorName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorName_5001Parser() {
		if (connectorName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			connectorName_5001Parser = parser;
		}
		return connectorName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5002Parser() {
		if (componentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			componentName_5002Parser = parser;
		}
		return componentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser wildCardName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getWildCardName_5003Parser() {
		if (wildCardName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			wildCardName_5003Parser = parser;
		}
		return wildCardName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser glue_3004Parser;

	/**
	 * @generated
	 */
	private IParser getGlue_3004Parser() {
		if (glue_3004Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getGlue_GlueType() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getGlue_GlueType() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			glue_3004Parser = parser;
		}
		return glue_3004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConnectorNameEditPart.VISUAL_ID:
			return getConnectorName_5001Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5002Parser();
		case WildCardNameEditPart.VISUAL_ID:
			return getWildCardName_5003Parser();
		case GlueEditPart.VISUAL_ID:
			return getGlue_3004Parser();
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
