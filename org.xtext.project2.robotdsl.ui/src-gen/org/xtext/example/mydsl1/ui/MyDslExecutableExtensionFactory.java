/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl1.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.project2.robotdsl.ui.internal.RobotdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RobotdslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RobotdslActivator activator = RobotdslActivator.getInstance();
		return activator != null ? activator.getInjector(RobotdslActivator.ORG_XTEXT_EXAMPLE_MYDSL1_MYDSL) : null;
	}

}
