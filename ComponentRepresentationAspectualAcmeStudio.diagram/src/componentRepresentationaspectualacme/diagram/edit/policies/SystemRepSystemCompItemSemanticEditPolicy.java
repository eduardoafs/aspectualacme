package componentRepresentationaspectualacme.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SystemRepSystemCompItemSemanticEditPolicy
		extends
		componentRepresentationaspectualacme.diagram.edit.policies.AspectualacmeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemRepSystemCompItemSemanticEditPolicy() {
		super(
				componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.ComponentCreateCommand(
					req));
		}
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.ConnectorCreateCommand(
					req));
		}
		if (componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009 == req
				.getElementType()) {
			return getGEFWrapper(new componentRepresentationaspectualacme.diagram.edit.commands.WildCardCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
