package com.tad.school.genhtml.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.tad.school.Academy;
import com.tad.school.genhtml.main.GenerateHtml;

public class GenerateHTMLHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection selection) {
		
		
		Object element = selection.getFirstElement();
		if (element instanceof Academy) {
			Academy academy = (Academy) element;
			try {
				GenerateHtml generateHtml = new GenerateHtml(academy, new File("/tmp"), Collections.emptyList());
				generateHtml.doGenerate(new BasicMonitor());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection selection) {
		Object element = selection.getFirstElement();
		if (element instanceof Academy) {
			return true;
		}
		return false;
	}
}
