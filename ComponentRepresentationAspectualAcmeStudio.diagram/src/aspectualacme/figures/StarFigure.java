/*******************************************************************************
 * Copyright (c) 2009 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin;

/**
 * @generated
 */
public class StarFigure extends ImageFigure {

	public StarFigure() {
		super(
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.imageDescriptorFromPlugin(
								ComponentRepresentationAspectualacmeDiagramEditorPlugin.ID,
								"/images/star.png").createImage(), 0);
	}

}
