package componentRepresentationaspectualacme.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BindableElement;
import aspectualacme.Binding;
import aspectualacme.Representation;
import aspectualacme.System;

/**
 * @generated
 */
public class AspectualacmeBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected AspectualacmeBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(
					componentRepresentationaspectualacme.diagram.edit.helpers.AspectualacmeBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(
				componentRepresentationaspectualacme.diagram.edit.helpers.AspectualacmeBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(
				componentRepresentationaspectualacme.diagram.edit.helpers.AspectualacmeBaseEditHelper.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(
				componentRepresentationaspectualacme.diagram.edit.helpers.AspectualacmeBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().setLinkConstraints(
							cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4001(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4002(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4003(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4004(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4005(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttachment_4006(System container,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			return canExistAttachment_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBinding_4007(Representation container,
				BindableElement source, BindableElement target) {
			return canExistBinding_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4001(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									6,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									7,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4002(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									8,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									9,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4003(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									10,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									11,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4004(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									12,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									13,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4005(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									14,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									15,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttachment_4006(System container,
				Attachment linkInstance,
				aspectualacme.attachableElement source,
				aspectualacme.attachableElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object sourceVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									16,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", AspectualacmePackage.eINSTANCE.getattachableElement()); //$NON-NLS-1$
					Object targetVal = componentRepresentationaspectualacme.diagram.expressions.AspectualacmeOCLFactory
							.getExpression(
									17,
									AspectualacmePackage.eINSTANCE
											.getattachableElement(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
								"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistBinding_4007(Representation container,
				Binding linkInstance, BindableElement source,
				BindableElement target) {
			return true;
		}
	}

}
