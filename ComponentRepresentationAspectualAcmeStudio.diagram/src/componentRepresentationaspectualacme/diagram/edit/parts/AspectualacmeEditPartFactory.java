package componentRepresentationaspectualacme.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class AspectualacmeEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(view)) {

			case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Representation2EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Representation2EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorNameEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ConnectorNameEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart(
						view);

			case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
				return new componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
