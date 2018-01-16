package com.mu.jup.studio.extension.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class XyzEditor extends TextEditor {

	private ColorManager colorManager;

	public XyzEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
