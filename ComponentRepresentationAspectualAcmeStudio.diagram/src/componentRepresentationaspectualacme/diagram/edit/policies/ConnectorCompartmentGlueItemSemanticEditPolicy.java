package componentRepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ConnectorCompartmentGlueItemSemanticEditPolicy
		extends
		componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorCompartmentGlueItemSemanticEditPolicy() {
		super(
				componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3008 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.GlueCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
