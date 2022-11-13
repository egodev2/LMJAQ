/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.lmjaq.LMJAQRuntimeModule;
import org.xtext.lmjaq.LMJAQStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LMJAQIdeSetup extends LMJAQStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LMJAQRuntimeModule(), new LMJAQIdeModule()));
	}
	
}