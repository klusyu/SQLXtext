/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl_sql;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SQLStandaloneSetup extends SQLStandaloneSetupGenerated {

	public static void doSetup() {
		new SQLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
