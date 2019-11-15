package dimap.ufrn.br.validation;

import org.eclipse.xtext.validation.Check;

import aspectualacme.AspectualacmePackage;

public class AspectualAcmeJavaValidator extends
		AbstractAspectualAcmeJavaValidator {

/*	@Check
	public void checkArmaniIsValid(aspectualacme.Armani ar) {
		// System.out.println("Teste");
		EList<String> tokens = new BasicEList<String>();
		tokens.addAll(ar.getTokens());
		tokens.add("$");
		ArmaniParser parser = new ArmaniParser(tokens);
		try {
			parser.parseArmani();
		} catch (ArmaniException e) {
			error(e.cause(), ar, 0);
		}
	}*/

	@Check
	public void checkBindingElementsAreValid(aspectualacme.Binding b) {
		String firstName = b.getFirstPort().getName();
		String secondName = b.getSecondPort().getName();

		if (b.getFirstPort() instanceof aspectualacme.Role) {
			if (b.getSecondPort() instanceof aspectualacme.Role) {
				// Checkar se um é porta interna e o outro externa
			} else {
				error(firstName + " (Role) and " + secondName
						+ " (Port) must have same type.", b, AspectualacmePackage.BINDING__SECOND_PORT);
			}
		} else if (b.getFirstPort() instanceof aspectualacme.Port) {
			if (b.getSecondPort() instanceof aspectualacme.Port) {

			} else {
				error(firstName + " (Port) and " + secondName
						+ " (Role) must have same type.", b, AspectualacmePackage.BINDING__SECOND_PORT);
			}
		}
	}

	@Check
	public void checkAttachmentElementsAreValid(aspectualacme.Attachment a) {
		aspectualacme.attachableElement first = a.getFirstElement();
		aspectualacme.attachableElement second = a.getSecondElement();

		if (first instanceof aspectualacme.Port) {
			if (!(second instanceof aspectualacme.Role)) {
				error(first.getName() + " (Port) must be attached to a Role",
						a, AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT);
			}
		} else if (first instanceof aspectualacme.Role) {
			if (!(second instanceof aspectualacme.Port)
					&& !(second instanceof aspectualacme.WildCard)) {
				error(first.getName()
						+ " (Role) must be attached to a Port or Wildcard",
						a, AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT);
			}
		} else if (first instanceof aspectualacme.WildCard) {
			if (!(second instanceof aspectualacme.Role)) {
				error(first.getName()
						+ " (Wildcard) must be attached to a Role", a, AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT);
			}
		}
	}

}
