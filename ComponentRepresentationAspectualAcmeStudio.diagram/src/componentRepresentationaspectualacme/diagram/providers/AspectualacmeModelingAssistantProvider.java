package componentRepresentationaspectualacme.diagram.providers;

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

/**
 * @generated
 */
public class AspectualacmeModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2001);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_2002);
			return types;
		}
		if (editPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3010);
			return types;
		}
		if (editPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3002);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_3003);
			return types;
		}
		if (editPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.BaseRole_3005);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.CrosscuttingRole_3006);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Role_3008);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3007);
			return types;
		}
		if (editPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004);
			types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) {
			return ((componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
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
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeModelingAssistantProviderMessage);
		dialog.setTitle(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
