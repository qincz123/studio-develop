package com.mu.jup.studio.extension.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewXyzWizardPage extends WizardNewFileCreationPage {

	public NewXyzWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setFileExtension("xyz");
	}
}
