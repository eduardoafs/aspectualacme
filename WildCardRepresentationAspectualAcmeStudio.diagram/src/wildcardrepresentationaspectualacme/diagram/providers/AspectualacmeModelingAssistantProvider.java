package wildcardrepresentationaspectualacme.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import wildcardrepresentationaspectualacme.diagram.edit.parts.Component2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentCompartmentWComponent2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentCompartmentWComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemCompartmentWSystemEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardEditPart;
import wildcardrepresentationaspectualacme.diagram.part.Messages;
import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

/**
 * @generated
 */
public class AspectualacmeModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WildCardEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Component_2002);
			return types;
		}
		if (editPart instanceof ComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Port_3001);
			return types;
		}
		if (editPart instanceof RepresentationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.System_3003);
			return types;
		}
		if (editPart instanceof Component2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Port_3001);
			return types;
		}
		if (editPart instanceof ComponentCompartmentWComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Representation_3004);
			return types;
		}
		if (editPart instanceof SystemCompartmentWSystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Component_3005);
			return types;
		}
		if (editPart instanceof ComponentCompartmentWComponent2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AspectualacmeElementTypes.Representation_3004);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WildCardRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.AspectualacmeModelingAssistantProviderMessage);
		dialog.setTitle(Messages.AspectualacmeModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
