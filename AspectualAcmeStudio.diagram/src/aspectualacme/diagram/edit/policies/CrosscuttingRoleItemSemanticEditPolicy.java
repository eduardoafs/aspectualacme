package aspectualacme.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.diagram.edit.commands.Attachment2CreateCommand;
import aspectualacme.diagram.edit.commands.Attachment2ReorientCommand;
import aspectualacme.diagram.edit.commands.Attachment3CreateCommand;
import aspectualacme.diagram.edit.commands.Attachment3ReorientCommand;
import aspectualacme.diagram.edit.commands.Attachment4CreateCommand;
import aspectualacme.diagram.edit.commands.Attachment4ReorientCommand;
import aspectualacme.diagram.edit.commands.Attachment5CreateCommand;
import aspectualacme.diagram.edit.commands.Attachment5ReorientCommand;
import aspectualacme.diagram.edit.commands.Attachment6CreateCommand;
import aspectualacme.diagram.edit.commands.Attachment6ReorientCommand;
import aspectualacme.diagram.edit.commands.AttachmentCreateCommand;
import aspectualacme.diagram.edit.commands.AttachmentReorientCommand;
import aspectualacme.diagram.edit.parts.Attachment2EditPart;
import aspectualacme.diagram.edit.parts.Attachment3EditPart;
import aspectualacme.diagram.edit.parts.Attachment4EditPart;
import aspectualacme.diagram.edit.parts.Attachment5EditPart;
import aspectualacme.diagram.edit.parts.Attachment6EditPart;
import aspectualacme.diagram.edit.parts.AttachmentEditPart;
import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class CrosscuttingRoleItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CrosscuttingRoleItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.CrosscuttingRole_3002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == Attachment5EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == Attachment6EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == AttachmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == Attachment2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == Attachment3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(incomingLink) == Attachment4EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == Attachment5EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == Attachment6EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == AttachmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == Attachment2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == Attachment3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getVisualID(outgoingLink) == Attachment4EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AspectualacmeElementTypes.Attachment_4001 == req.getElementType()) {
			return getGEFWrapper(new Attachment5CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4002 == req.getElementType()) {
			return getGEFWrapper(new Attachment6CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4003 == req.getElementType()) {
			return getGEFWrapper(new AttachmentCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4004 == req.getElementType()) {
			return getGEFWrapper(new Attachment2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4005 == req.getElementType()) {
			return getGEFWrapper(new Attachment3CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4006 == req.getElementType()) {
			return getGEFWrapper(new Attachment4CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AspectualacmeElementTypes.Attachment_4001 == req.getElementType()) {
			return getGEFWrapper(new Attachment5CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4002 == req.getElementType()) {
			return getGEFWrapper(new Attachment6CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4003 == req.getElementType()) {
			return getGEFWrapper(new AttachmentCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4004 == req.getElementType()) {
			return getGEFWrapper(new Attachment2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4005 == req.getElementType()) {
			return getGEFWrapper(new Attachment3CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AspectualacmeElementTypes.Attachment_4006 == req.getElementType()) {
			return getGEFWrapper(new Attachment4CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Attachment5EditPart.VISUAL_ID:
			return getGEFWrapper(new Attachment5ReorientCommand(req));
		case Attachment6EditPart.VISUAL_ID:
			return getGEFWrapper(new Attachment6ReorientCommand(req));
		case AttachmentEditPart.VISUAL_ID:
			return getGEFWrapper(new AttachmentReorientCommand(req));
		case Attachment2EditPart.VISUAL_ID:
			return getGEFWrapper(new Attachment2ReorientCommand(req));
		case Attachment3EditPart.VISUAL_ID:
			return getGEFWrapper(new Attachment3ReorientCommand(req));
		case Attachment4EditPart.VISUAL_ID:
			return getGEFWrapper(new Attachment4ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
