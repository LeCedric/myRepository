/*
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.ui.tests;

import com.google.inject.Injector;
import com.tad.chart.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ChartDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("com.tad.chart.xtext.ChartDsl");
	}

}
