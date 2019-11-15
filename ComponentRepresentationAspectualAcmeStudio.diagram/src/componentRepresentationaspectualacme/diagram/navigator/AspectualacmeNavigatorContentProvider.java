package componentRepresentationaspectualacme.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class AspectualacmeNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public AspectualacmeNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem> result = new ArrayList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup group = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem navigatorItem = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {

		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_WildCard_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_WildCard_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.SystemRepSystemCompEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.SystemRepSystemCompEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.SystemRepSystemCompEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Port_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Port_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_BaseRole_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_BaseRole_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Port_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Port_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Binding_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Binding_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup links = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Representation_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_CrosscuttingRole_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_CrosscuttingRole_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Node sv = (Node) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup incominglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Role_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup outgoinglinks = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Role_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID: {
			LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem> result = new LinkedList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup target = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup source = new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup(
					componentRepresentationaspectualacme.diagram.part.Messages.NavigatorGroupName_Attachment_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
							.getType(componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.MODEL_ID
				.equals(componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem> result = new ArrayList<componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem abstractNavigatorItem = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
