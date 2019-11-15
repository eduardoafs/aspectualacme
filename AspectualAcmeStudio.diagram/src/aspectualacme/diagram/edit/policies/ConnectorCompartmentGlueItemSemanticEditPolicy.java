package aspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import aspectualacme.diagram.edit.commands.GlueCreateCommand;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class ConnectorCompartmentGlueItemSemanticEditPolicy extends
		AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorCompartmentGlueItemSemanticEditPolicy() {
		super(AspectualacmeElementTypes.Connector_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AspectualacmeElementTypes.Glue_3004 == req.getElementType()) {
			return getGEFWrapper(new GlueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
