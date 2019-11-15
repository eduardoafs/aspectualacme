package componentRepresentationaspectualacme.diagram.providers;

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

/**
 * @generated
 */
public class AspectualacmeParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser systemName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSystemName_5004Parser() {
		if (systemName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			systemName_5004Parser = parser;
		}
		return systemName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5005Parser() {
		if (componentName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			componentName_5005Parser = parser;
		}
		return componentName_5005Parser;
	}

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
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			componentName_5001Parser = parser;
		}
		return componentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorName_5002Parser() {
		if (connectorName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			connectorName_5002Parser = parser;
		}
		return connectorName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser glue_3007Parser;

	/**
	 * @generated
	 */
	private IParser getGlue_3007Parser() {
		if (glue_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getGlue_GlueType() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getGlue_GlueType() };
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			glue_3007Parser = parser;
		}
		return glue_3007Parser;
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
			componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser parser = new componentRepresentationaspectualacme.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			wildCardName_5003Parser = parser;
		}
		return wildCardName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart.VISUAL_ID:
			return getSystemName_5004Parser();
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5005Parser();
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart.VISUAL_ID:
			return getComponentName_5001Parser();
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorNameEditPart.VISUAL_ID:
			return getConnectorName_5002Parser();
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getGlue_3007Parser();
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart.VISUAL_ID:
			return getWildCardName_5003Parser();
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
			return getParser(componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
					.getElement(hint) == null) {
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
