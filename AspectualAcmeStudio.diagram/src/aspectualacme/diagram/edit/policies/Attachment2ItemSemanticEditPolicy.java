package aspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class Attachment2ItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Attachment2ItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Attachment_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
