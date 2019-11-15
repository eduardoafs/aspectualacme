package wildcardrepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import wildcardrepresentationaspectualacme.diagram.edit.commands.SystemCreateCommand;
import wildcardrepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class RepresentationCompartmentWRepresentationItemSemanticEditPolicy
		extends AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepresentationCompartmentWRepresentationItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Representation_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AspectualacmeElementTypes.System_3003 == req.getElementType()) {
			return getGEFWrapper(new SystemCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
