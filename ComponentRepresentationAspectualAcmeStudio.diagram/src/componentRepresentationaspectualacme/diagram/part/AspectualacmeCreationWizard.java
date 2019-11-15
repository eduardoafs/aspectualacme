package componentRepresentationaspectualacme.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class AspectualacmeCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected componentRepresentationaspectualacme.diagram.part.AspectualacmeCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected componentRepresentationaspectualacme.diagram.part.AspectualacmeCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizardTitle);
		setDefaultPageImageDescriptor(componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewAspectualacmeWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new componentRepresentationaspectualacme.diagram.part.AspectualacmeCreationWizardPage(
				"DiagramModelFile", getSelection(), "componentrepresentationaspectualacme_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new componentRepresentationaspectualacme.diagram.part.AspectualacmeCreationWizardPage(
				"DomainModelFile", getSelection(), "componentrepresentationaspectualacme") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName
							.substring(
									0,
									fileName.length()
											- ".componentrepresentationaspectualacme_diagram".length()); //$NON-NLS-1$
					setFileName(componentRepresentationaspectualacme.diagram.part.AspectualacmeDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName,
									"componentrepresentationaspectualacme")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = componentRepresentationaspectualacme.diagram.part.AspectualacmeDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						componentRepresentationaspectualacme.diagram.part.AspectualacmeDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								componentRepresentationaspectualacme.diagram.part.Messages.AspectualacmeCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
