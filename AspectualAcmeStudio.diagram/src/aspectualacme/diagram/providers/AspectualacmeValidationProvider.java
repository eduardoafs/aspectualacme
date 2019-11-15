package aspectualacme.diagram.providers;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ITraversalStrategy;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.Port;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;
import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import aspectualacme.impl.BaseRoleImpl;
import aspectualacme.impl.ComponentImpl;
import aspectualacme.impl.ConnectorImpl;
import aspectualacme.impl.CrosscuttingRoleImpl;
import aspectualacme.impl.ElementImpl;
import aspectualacme.impl.PortImpl;
import aspectualacme.impl.RepresentationImpl;
import aspectualacme.impl.RoleImpl;
import aspectualacme.impl.SystemImpl;

/**
 * @generated
 */
public class AspectualacmeValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				AspectualacmeDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& SystemEditPart.MODEL_ID
							.equals(AspectualacmeVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class Ctx_2002 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == ComponentEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_2001 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == ConnectorEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_3005 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == PortEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_3011 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == RoleEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_3001 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == BaseRoleEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_3002 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == CrosscuttingRoleEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static class Ctx_3010 implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			if (isInDefaultEditorContext(object) && object instanceof View) {
				final int id = AspectualacmeVisualIDRegistry
						.getVisualID((View) object);
				boolean result = false;
				result = result || id == RepresentationEditPart.VISUAL_ID;
				return result;
			}
			return false;
		}
	}

	/**
	 * @generated
	 */
	public static ITraversalStrategy getNotationTraversalStrategy(
			IBatchValidator validator) {
		return new CtxSwitchStrategy(validator);
	}

	/**
	 * @generated
	 */
	private static class CtxSwitchStrategy implements ITraversalStrategy {

		/**
		 * @generated
		 */
		private ITraversalStrategy defaultStrategy;

		/**
		 * @generated
		 */
		private int currentSemanticCtxId = -1;

		/**
		 * @generated
		 */
		private boolean ctxChanged = true;

		/**
		 * @generated
		 */
		private EObject currentTarget;

		/**
		 * @generated
		 */
		private EObject preFetchedNextTarget;

		/**
		 * @generated
		 */
		private final int[] contextSwitchingIdentifiers;

		/**
		 * @generated
		 */
		CtxSwitchStrategy(IBatchValidator validator) {
			this.defaultStrategy = validator.getDefaultTraversalStrategy();
			this.contextSwitchingIdentifiers = new int[] {
					ComponentEditPart.VISUAL_ID, ConnectorEditPart.VISUAL_ID,
					PortEditPart.VISUAL_ID, RoleEditPart.VISUAL_ID,
					BaseRoleEditPart.VISUAL_ID,
					CrosscuttingRoleEditPart.VISUAL_ID,
					RepresentationEditPart.VISUAL_ID };
			Arrays.sort(this.contextSwitchingIdentifiers);
		}

		/**
		 * @generated
		 */
		public void elementValidated(EObject element, IStatus status) {
			defaultStrategy.elementValidated(element, status);
		}

		/**
		 * @generated
		 */
		public boolean hasNext() {
			return defaultStrategy.hasNext();
		}

		/**
		 * @generated
		 */
		public boolean isClientContextChanged() {
			if (preFetchedNextTarget == null) {
				preFetchedNextTarget = next();
				prepareNextClientContext(preFetchedNextTarget);
			}
			return ctxChanged;
		}

		/**
		 * @generated
		 */
		public EObject next() {
			EObject nextTarget = preFetchedNextTarget;
			if (nextTarget == null) {
				nextTarget = defaultStrategy.next();
			}
			this.preFetchedNextTarget = null;
			return this.currentTarget = nextTarget;
		}

		/**
		 * @generated
		 */
		public void startTraversal(Collection traversalRoots,
				IProgressMonitor monitor) {
			defaultStrategy.startTraversal(traversalRoots, monitor);
		}

		/**
		 * @generated
		 */
		private void prepareNextClientContext(EObject nextTarget) {
			if (nextTarget != null && currentTarget != null) {
				if (nextTarget instanceof View) {
					final int id = AspectualacmeVisualIDRegistry
							.getVisualID((View) nextTarget);
					int nextSemanticId = (id != -1 && Arrays.binarySearch(
							contextSwitchingIdentifiers, id) >= 0) ? id : -1;
					if ((currentSemanticCtxId != -1 && currentSemanticCtxId != nextSemanticId)
							|| (nextSemanticId != -1 && nextSemanticId != currentSemanticCtxId)) {
						this.ctxChanged = true;
					}
					currentSemanticCtxId = nextSemanticId;
				} else {
					// context of domain model
					this.ctxChanged = currentSemanticCtxId != -1;
					currentSemanticCtxId = -1;
				}
			} else {
				this.ctxChanged = false;
			}
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter1 extends AbstractModelConstraint {

		/**
		 * Component
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			ComponentImpl component = (ComponentImpl) context.getElement();
			SystemImpl system = (SystemImpl) component.eContainer();
			for (Component c : system.getComponents()) {
				if (c != component && c.getName().equals(component.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter2 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			ConnectorImpl connector = (ConnectorImpl) context.getElement();
			SystemImpl system = (SystemImpl) connector.eContainer();
			for (Connector c : system.getConnectors()) {
				if (c != connector && c.getName().equals(connector.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter3 extends AbstractModelConstraint {

		/**
		 * Port
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			PortImpl port = (PortImpl) context.getElement();
			ComponentImpl component = (ComponentImpl) port.eContainer();
			for (Port c : component.getPort()) {
				if (c != port && c.getName().equals(port.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter4 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			RoleImpl role = (RoleImpl) context.getElement();
			ConnectorImpl connector = (ConnectorImpl) role.eContainer();
			for (Role c : connector.getRole()) {
				if (c != role && c.getName().equals(role.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter5 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			BaseRoleImpl role = (BaseRoleImpl) context.getElement();
			ConnectorImpl connector = (ConnectorImpl) role.eContainer();
			for (Role c : connector.getRole()) {
				if (c != role && c.getName().equals(role.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter6 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			CrosscuttingRoleImpl role = (CrosscuttingRoleImpl) context
					.getElement();
			ConnectorImpl connector = (ConnectorImpl) role.eContainer();
			for (Role c : connector.getRole()) {
				if (c != role && c.getName().equals(role.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter7 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			RepresentationImpl representation = (RepresentationImpl) context
					.getElement();
			ElementImpl parent = (ElementImpl) representation.eContainer();
			for (Representation c : parent.getRepresentations()) {
				if (c != representation
						&& c.getName().equals(representation.getName())) {
					return ctx.createFailureStatus(context);
				}

			}
			return ctx.createSuccessStatus();
		}
	}

	/**
	 * @generated
	 */
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
