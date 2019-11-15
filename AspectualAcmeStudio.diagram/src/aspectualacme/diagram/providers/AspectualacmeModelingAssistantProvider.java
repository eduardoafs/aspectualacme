package aspectualacme.diagram.providers;

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

import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;
import aspectualacme.diagram.part.Messages;

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
		if (editPart instanceof SystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(AspectualacmeElementTypes.Connector_2001);
			types.add(AspectualacmeElementTypes.Component_2002);
			types.add(AspectualacmeElementTypes.WildCard_2003);
			return types;
		}
		if (editPart instanceof ConnectorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Glue_3004);
			return types;
		}
		if (editPart instanceof ComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(AspectualacmeElementTypes.Port_3005);
			types.add(AspectualacmeElementTypes.Representation_3010);
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
		if (sourceEditPart instanceof WildCardEditPart) {
			return ((WildCardEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof BaseRoleEditPart) {
			return ((BaseRoleEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CrosscuttingRoleEditPart) {
			return ((CrosscuttingRoleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RoleEditPart) {
			return ((RoleEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PortEditPart) {
			return ((PortEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WildCardEditPart) {
			return ((WildCardEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			return ((BaseRoleEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			return ((CrosscuttingRoleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RoleEditPart) {
			return ((RoleEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PortEditPart) {
			return ((PortEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof WildCardEditPart) {
			return ((WildCardEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof BaseRoleEditPart) {
			return ((BaseRoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CrosscuttingRoleEditPart) {
			return ((CrosscuttingRoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RoleEditPart) {
			return ((RoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PortEditPart) {
			return ((PortEditPart) sourceEditPart)
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
		if (targetEditPart instanceof WildCardEditPart) {
			return ((WildCardEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			return ((BaseRoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			return ((CrosscuttingRoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RoleEditPart) {
			return ((RoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PortEditPart) {
			return ((PortEditPart) targetEditPart)
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
		if (sourceEditPart instanceof WildCardEditPart) {
			return ((WildCardEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof BaseRoleEditPart) {
			return ((BaseRoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CrosscuttingRoleEditPart) {
			return ((CrosscuttingRoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RoleEditPart) {
			return ((RoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PortEditPart) {
			return ((PortEditPart) sourceEditPart)
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
				AspectualacmeDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
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
