/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl_sql.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydsl_sql.ui.internal.Mydsl_sqlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SQLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Mydsl_sqlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Mydsl_sqlActivator activator = Mydsl_sqlActivator.getInstance();
		return activator != null ? activator.getInjector(Mydsl_sqlActivator.ORG_XTEXT_EXAMPLE_MYDSL_SQL_SQL) : null;
	}

}
