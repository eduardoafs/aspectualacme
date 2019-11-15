package componentRepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class Attachment2ItemSemanticEditPolicy
		extends
		componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Attachment2ItemSemanticEditPolicy() {
		super(
				componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
