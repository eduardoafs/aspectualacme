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

import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart;
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
			parser.setViewPattern("Component {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Component {0}"); //$NON-NLS-1$
			parser.setEditPattern("Component {0}"); //$NON-NLS-1$
			componentName_5001Parser = parser;
		}
		return componentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser representationName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getRepresentationName_5003Parser() {
		if (representationName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getRepresentation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Representation {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Representation {0}"); //$NON-NLS-1$
			parser.setEditPattern("Representation {0}"); //$NON-NLS-1$
			representationName_5003Parser = parser;
		}
		return representationName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser systemName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSystemName_5005Parser() {
		if (systemName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("System {0}"); //$NON-NLS-1$
			parser.setEditorPattern("System {0}"); //$NON-NLS-1$
			parser.setEditPattern("System {0}"); //$NON-NLS-1$
			systemName_5005Parser = parser;
		}
		return systemName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5004Parser() {
		if (componentName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { AspectualacmePackage.eINSTANCE
					.getElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Component {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Component {0}"); //$NON-NLS-1$
			parser.setEditPattern("Component {0}"); //$NON-NLS-1$
			componentName_5004Parser = parser;
		}
		return componentName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5001Parser();
		case RepresentationNameEditPart.VISUAL_ID:
			return getRepresentationName_5003Parser();
		case SystemNameEditPart.VISUAL_ID:
			return getSystemName_5005Parser();
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentName_5004Parser();
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
	@Override
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
	@Override
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
		@Override
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
