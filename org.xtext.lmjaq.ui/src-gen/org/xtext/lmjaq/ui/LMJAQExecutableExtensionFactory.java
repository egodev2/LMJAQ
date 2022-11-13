/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.lmjaq.ui.internal.LmjaqActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LMJAQExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LmjaqActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LmjaqActivator activator = LmjaqActivator.getInstance();
		return activator != null ? activator.getInjector(LmjaqActivator.ORG_XTEXT_LMJAQ_LMJAQ) : null;
	}

}
