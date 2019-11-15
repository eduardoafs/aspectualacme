package aspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import aspectualacme.diagram.edit.commands.RepresentationCreateCommand;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class ComponentComponentCompartmentItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentCompartmentItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Component_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AspectualacmeElementTypes.Representation_3010 == req
				.getElementType()) {
			return getGEFWrapper(new RepresentationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
