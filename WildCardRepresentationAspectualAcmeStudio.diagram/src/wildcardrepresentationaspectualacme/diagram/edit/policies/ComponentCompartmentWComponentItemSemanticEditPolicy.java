package wildcardrepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import wildcardrepresentationaspectualacme.diagram.edit.commands.RepresentationCreateCommand;
import wildcardrepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class ComponentCompartmentWComponentItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentCompartmentWComponentItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Component_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AspectualacmeElementTypes.Representation_3004 == req
				.getElementType()) {
			return getGEFWrapper(new RepresentationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
