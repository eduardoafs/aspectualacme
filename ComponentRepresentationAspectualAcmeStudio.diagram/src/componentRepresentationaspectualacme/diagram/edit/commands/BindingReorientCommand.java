package componentRepresentationaspectualacme.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import aspectualacme.Binding;
import aspectualacme.Port;
import aspectualacme.Representation;

/**
 * @generated
 */
public class BindingReorientCommand extends EditElementCommand {

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
	public BindingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Binding) {
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
		if (!(oldEnd instanceof Port && newEnd instanceof Port)) {
			return false;
		}
		Port target = getLink().getSecondPort();
		if (!(getLink().eContainer() instanceof Representation)) {
			return false;
		}
		Representation container = (Representation) getLink().eContainer();
		return componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBinding_4007(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Port && newEnd instanceof Port)) {
			return false;
		}
		Port source = getLink().getFirstPort();
		if (!(getLink().eContainer() instanceof Representation)) {
			return false;
		}
		Representation container = (Representation) getLink().eContainer();
		return componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBinding_4007(container,
						getLink(), source, getNewTarget());
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
		getLink().setFirstPort(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSecondPort(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Binding getLink() {
		return (Binding) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Port getOldSource() {
		return (Port) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Port getNewSource() {
		return (Port) newEnd;
	}

	/**
	 * @generated
	 */
	protected Port getOldTarget() {
		return (Port) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Port getNewTarget() {
		return (Port) newEnd;
	}
}
