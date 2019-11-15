package wildcardrepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import wildcardrepresentationaspectualacme.diagram.edit.commands.Component2CreateCommand;
import wildcardrepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class SystemCompartmentWSystemItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemCompartmentWSystemItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.System_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AspectualacmeElementTypes.Component_3005 == req.getElementType()) {
			return getGEFWrapper(new Component2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
