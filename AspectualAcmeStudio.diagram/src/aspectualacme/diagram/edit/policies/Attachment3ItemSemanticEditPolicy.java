package aspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class Attachment3ItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Attachment3ItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Attachment_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
