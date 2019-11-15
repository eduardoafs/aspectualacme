/*
 * generated by Xtext
 */
package dimap.ufrn.br.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import aspectualacme.System;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class AspectualAcmeScopeProvider extends AbstractDeclarativeScopeProvider {

	// Inheritances
	public IScope scope_Component_type(aspectualacme.Component c, EReference t) {
		aspectualacme.BasicElement parentSystem = c.getParentSystem();
		aspectualacme.BasicElement parentFamily = c.getParentFamily();
		
		aspectualacme.BasicElement parent = (parentSystem==null? parentFamily : parentSystem);

		EList<aspectualacme.Family> families = parent.getParentFamily();
		EList<aspectualacme.ComponentType> all = null;
		
		// Incluir tipos da fam�lia atual, para depois adicionar os tipos 
		if (parent instanceof aspectualacme.Family) all = ((aspectualacme.Family) parent).getCtypes();
		else {
			// Elemento pai do system, quando ele est� inserido dentro de um representation
			aspectualacme.Representation rep = ((System)parent).getParentRepresentation();
			aspectualacme.Element systemsParent = null;
			if (rep!=null) systemsParent = rep.getElement();
			
			aspectualacme.BasicElement parentParentFamily = null;
			aspectualacme.BasicElement parentParentSystem = null;
			while (systemsParent!=null) {
				if (systemsParent instanceof aspectualacme.Component) {
					parentParentSystem = ((aspectualacme.Component)systemsParent).getParentSystem();
					parentParentFamily = ((aspectualacme.Component)systemsParent).getParentFamily();
				} else if (systemsParent instanceof aspectualacme.Connector) {}
				// TODO fazer para os outros tipos de elements
				
				
				// Aqui eu pego o pai do elemento no representation, e ajusto o pr�x pai
				aspectualacme.BasicElement parentParent =(parentParentSystem==null? parentParentFamily : parentParentSystem);
				
				// pegar o parent, e identificar os types dele
				// Adicionar todas as familias � lista de familias que ser�o usadas por este escopo
				families.addAll(parentParent.getParentFamily());
				
				// Para subir para os outros n�veis
				if (parentParent instanceof aspectualacme.System && ((System)parentParent).getParentRepresentation()!=null) {
					systemsParent = ((System)parentParent).getParentRepresentation().getElement();
				} else {
					systemsParent = null;
				}
			}
		}
		
		for (aspectualacme.Family s : families) {
			if (all==null) all = s.getCtypes();
			else all.addAll(s.getCtypes());
			families.addAll(s.getParentFamily());
		}
		return Scopes.scopeFor(all);
	}

}
