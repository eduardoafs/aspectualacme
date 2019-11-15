package dimap.ufrn.br.validation;

import org.eclipse.xtext.validation.Check;

import aspectualacme.Armani;
import dimap.ufrn.br.Armani.*;
import dimap.ufrn.br.Armani.ArmaniParser.ArmaniException;

public class AspectualAcmeJavaValidator extends AbstractAspectualAcmeJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}

	/*
	@Check
	public void checkArmani(aspectualacme.Armani ar) {
		System.out.println(ar.getTokens());
		ArmaniParser parser = new ArmaniParser(ar.getTokens());
		try {
			parser.parseArmani();
		} catch (ArmaniException e) {
			error(e.cause(), ar.hashCode());
		}
	}*/
}
