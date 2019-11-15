
package dimap.ufrn.br;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AspectualAcmeStandaloneSetup extends AspectualAcmeStandaloneSetupGenerated{

	public static void doSetup() {
		new AspectualAcmeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

