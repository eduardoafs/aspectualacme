package wildcardrepresentationaspectualacme.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class AspectualacmeDiagramActionBarContributor extends
		DiagramActionBarContributor {

	/**
	 * @generated
	 */
	@Override
	protected Class getEditorClass() {
		return AspectualacmeDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	@Override
	protected String getEditorId() {
		return AspectualacmeDiagramEditor.ID;
	}

	/**
	 * @generated
	 */
	@Override
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
}
