package aspectualacme.diagram.providers;

import aspectualacme.AspectualacmeFactory;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.Port;
import aspectualacme.Representation;
import aspectualacme.System;
import aspectualacme.diagram.expressions.AspectualacmeOCLFactory;
import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Connector_2001(Connector instance) {
		try {
			Object value_0 = AspectualacmeOCLFactory.getExpression(0,
					AspectualacmePackage.eINSTANCE.getConnector(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_2002(Component instance) {
		try {
			Object value_0 = AspectualacmeOCLFactory.getExpression(1,
					AspectualacmePackage.eINSTANCE.getComponent(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			Port newInstance_1_0 = AspectualacmeFactory.eINSTANCE.createPort();
			instance.getPort().add(newInstance_1_0);
			Object value_1_0_0 = AspectualacmeOCLFactory.getExpression(2,
					AspectualacmePackage.eINSTANCE.getPort(), null).evaluate(
					newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3005(Port instance) {
		try {
			Object value_0 = AspectualacmeOCLFactory.getExpression(3,
					AspectualacmePackage.eINSTANCE.getPort(), null).evaluate(
					instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Representation_3010(Representation instance) {
		try {
			Object value_0 = AspectualacmeOCLFactory.getExpression(4,
					AspectualacmePackage.eINSTANCE.getRepresentation(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			System newInstance_1_0 = AspectualacmeFactory.eINSTANCE
					.createSystem();
			instance.setSystem(newInstance_1_0);
			Object value_1_0_0 = AspectualacmeOCLFactory.getExpression(5,
					AspectualacmePackage.eINSTANCE.getSystem(), null).evaluate(
					newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AspectualacmeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			AspectualacmeDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
