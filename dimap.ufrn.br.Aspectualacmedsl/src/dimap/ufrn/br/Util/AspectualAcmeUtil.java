package dimap.ufrn.br.Util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class AspectualAcmeUtil {
	public static EList<aspectualacme.BindableElement> bindablesFor(
			aspectualacme.Representation rep) {
		aspectualacme.System system = rep.getSystem();

		EList<aspectualacme.Component> components = system.getComponents();
		EList<aspectualacme.Connector> connectors = system.getConnectors();
		EList<aspectualacme.BindableElement> allBindables = new BasicEList<aspectualacme.BindableElement>();

		// Parent of representation, if a component
		aspectualacme.Element parent = rep.getElement();
		if (parent instanceof aspectualacme.Component) {
			allBindables.addAll(((aspectualacme.Component) parent).allPorts());
		} else if (parent instanceof aspectualacme.Connector) {
			allBindables.addAll(((aspectualacme.Connector) parent).allRoles());
		}

		for (aspectualacme.Component c : components) {
			allBindables.addAll(c.allPorts());
		}

		for (aspectualacme.Connector c : connectors) {
			allBindables.addAll(c.allRoles());
		}

		return allBindables;
	}

	public static EList<aspectualacme.attachableElement> attachablesFor(
			aspectualacme.BasicElement sys) {
		EList<aspectualacme.attachableElement> attachables = new BasicEList<aspectualacme.attachableElement>();
		if (sys instanceof aspectualacme.System) {
			for (aspectualacme.Component c : ((aspectualacme.System) sys)
					.getComponents())
				attachables.addAll(c.allPorts());

			for (aspectualacme.Connector c : ((aspectualacme.System) sys)
					.getConnectors())
				attachables.addAll(c.allRoles());

			attachables.addAll(((aspectualacme.System) sys).getWildCard());
		} else if (sys instanceof aspectualacme.Family) {
			for (aspectualacme.Component c : ((aspectualacme.Family) sys)
					.getComponents())
				attachables.addAll(c.allPorts());

			for (aspectualacme.Connector c : ((aspectualacme.Family) sys)
					.getConnectors())
				attachables.addAll(c.allRoles());

			attachables.addAll(((aspectualacme.Family) sys).getWildcard());
		}

		return attachables;
	}

	public static EList<aspectualacme.ComponentType> fullInheritance(
			aspectualacme.ComponentType t) {
		EList<aspectualacme.ComponentType> inheritanceList = new BasicEList<aspectualacme.ComponentType>();
		
		inheritanceList.add(t);

		EList<aspectualacme.ComponentType> parents = t.getParentType();
		for (aspectualacme.ComponentType fam : parents) {
			if (!inheritanceList.contains(fam)) inheritanceList.add(fam);
		}
		return inheritanceList;
	}

	public static EList<aspectualacme.Family> fullInheritance(
			aspectualacme.Family f) {
		EList<aspectualacme.Family> inheritedMembers = new BasicEList<aspectualacme.Family>();

		inheritedMembers.add(f); // Self-add

		EList<aspectualacme.Family> immediateParents = f.getParentFamily();

		for (aspectualacme.Family fam : immediateParents) {
			if (!inheritedMembers.contains(fam)) inheritedMembers.add(fam);
		}

		return inheritedMembers;
	}

	public static EList<aspectualacme.Family> fullInheritance(
			aspectualacme.System s) {
		EList<aspectualacme.Family> families = new BasicEList<aspectualacme.Family>();
		families.addAll(s.getParentFamily());

		aspectualacme.Representation rep = s.getParentRepresentation();

		aspectualacme.Element systemsParent = null;
		if (rep != null)
			systemsParent = rep.getElement();

		aspectualacme.BasicElement parentParentFamily = null;
		aspectualacme.BasicElement parentParentSystem = null;
		while (systemsParent != null) {
			if (systemsParent instanceof aspectualacme.Component) {
				parentParentSystem = ((aspectualacme.Component) systemsParent)
						.getParentSystem();
				parentParentFamily = ((aspectualacme.Component) systemsParent)
						.getParentFamily();
			} else if (systemsParent instanceof aspectualacme.Connector) {
				parentParentSystem = ((aspectualacme.Connector) systemsParent)
						.getParentSystem();
				parentParentFamily = ((aspectualacme.Connector) systemsParent)
						.getParentFamily();
			} else if (systemsParent instanceof aspectualacme.Role) {
				if (((aspectualacme.Role) systemsParent).getConnector() != null) {
					parentParentSystem = ((aspectualacme.Role) systemsParent)
							.getConnector().getParentSystem();
					parentParentFamily = ((aspectualacme.Role) systemsParent)
							.getConnector().getParentFamily();
				} else if (((aspectualacme.Role) systemsParent).getConnectorT() != null) { // Parent
																							// is
																							// a
																							// ConnectorType
					parentParentSystem = null;
					parentParentFamily = ((aspectualacme.Role) systemsParent)
							.getConnectorT().getParentFamily();
				}
			} else if (systemsParent instanceof aspectualacme.Port) {
				if (((aspectualacme.Port) systemsParent).getComponent() != null) {
					parentParentSystem = ((aspectualacme.Port) systemsParent)
							.getComponent().getParentSystem();
					parentParentFamily = ((aspectualacme.Port) systemsParent)
							.getComponent().getParentFamily();
				} else if (((aspectualacme.Port) systemsParent).getComponentT() != null) { // Parent
																							// is
																							// a
																							// ComponentType
					parentParentSystem = null;
					parentParentFamily = ((aspectualacme.Port) systemsParent)
							.getComponentT().getParentFamily();
				}
			}

			// Aqui eu pego o pai do elemento no representation, e ajusto o
			// próx pai
			aspectualacme.BasicElement parentParent = (parentParentSystem == null ? parentParentFamily
					: parentParentSystem);

			// pegar o parent, e identificar os types dele
			// Adicionar todas as familias à lista de familias que serão
			// usadas por este escopo
			families.addAll(parentParent.getParentFamily());

			// Para subir para os outros níveis
			if (parentParent instanceof aspectualacme.System
					&& ((aspectualacme.System) parentParent)
							.getParentRepresentation() != null) {
				systemsParent = ((aspectualacme.System) parentParent)
						.getParentRepresentation().getElement();
			} else {
				systemsParent = null;
			}
		}
		return families;
	}

	public static EList<aspectualacme.Family> fullInheritance(
			aspectualacme.BasicElement b) {
		if (b instanceof aspectualacme.Family)
			return fullInheritance((aspectualacme.Family) b);
		else
			return fullInheritance((aspectualacme.System) b);
	}
	
}
