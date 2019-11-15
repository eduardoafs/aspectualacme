package aspectualacme.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import aspectualacme.Attachment;
import aspectualacme.System;
import aspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Attachment3ReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public Attachment3ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Attachment) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof aspectualacme.attachableElement && newEnd instanceof aspectualacme.attachableElement)) {
			return false;
		}
		aspectualacme.attachableElement target = getLink().getSecondElement();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return AspectualacmeBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttachment_4005(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof aspectualacme.attachableElement && newEnd instanceof aspectualacme.attachableElement)) {
			return false;
		}
		aspectualacme.attachableElement source = getLink().getFirstElement();
		if (!(getLink().eContainer() instanceof System)) {
			return false;
		}
		System container = (System) getLink().eContainer();
		return AspectualacmeBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttachment_4005(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFirstElement(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSecondElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Attachment getLink() {
		return (Attachment) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected aspectualacme.attachableElement getOldSource() {
		return (aspectualacme.attachableElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected aspectualacme.attachableElement getNewSource() {
		return (aspectualacme.attachableElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected aspectualacme.attachableElement getOldTarget() {
		return (aspectualacme.attachableElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected aspectualacme.attachableElement getNewTarget() {
		return (aspectualacme.attachableElement) newEnd;
	}
}
