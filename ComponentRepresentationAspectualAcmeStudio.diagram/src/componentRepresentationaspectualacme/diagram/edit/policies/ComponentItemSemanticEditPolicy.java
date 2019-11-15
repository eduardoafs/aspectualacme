package componentRepresentationaspectualacme.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ComponentItemSemanticEditPolicy
		extends
		componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentItemSemanticEditPolicy() {
		super(
				componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3002 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.PortCreateCommand(
					req));
		}
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_3003 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.RepresentationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(node)) {
			case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(incomingLink) == componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getVisualID(outgoingLink) == componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
