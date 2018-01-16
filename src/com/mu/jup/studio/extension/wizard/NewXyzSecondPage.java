package com.mu.jup.studio.extension.wizard;

import java.util.Arrays;

import com.mu.jup.studio.extension.NLSMessage;
import com.primeton.studio.core.IValueRepository;
import com.primeton.studio.core.model.impl.ListProvider;
import com.primeton.studio.ui.context.DefaultValueRepository;
import com.primeton.studio.ui.editor.ObjectEditor;
import com.primeton.studio.ui.editor.swt.impl.ComboPropertyEditor;
import com.primeton.studio.ui.editor.swt.impl.StringPropertyEditor;
import com.primeton.studio.ui.editor.swt.layout.GridLayoutBuilder;
import com.primeton.studio.ui.swt.wizard.base.AbstractObjectEditorWizardPage;

public class NewXyzSecondPage extends AbstractObjectEditorWizardPage {
	
	private StringPropertyEditor idEditor;
	private ComboPropertyEditor regionEditor;
	

	private ObjectEditor objectEditor;
	private IValueRepository valueRepository = new DefaultValueRepository();
	

	public NewXyzSecondPage() {
		super(NLSMessage.NEW_XYZ_WIZARD_PAGE2_NAME);
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected ObjectEditor createObjectEditor() {
		
		objectEditor = new ObjectEditor();
		GridLayoutBuilder layoutBuilder = new GridLayoutBuilder();
		layoutBuilder.setColumnCount(2);
		objectEditor.setLayoutBuilder(layoutBuilder);
		
		idEditor = new StringPropertyEditor();
		idEditor.setLabel("Apple ID");
		idEditor.setPropertyName("appleId");
		objectEditor.doAddPropertyEditor(idEditor);
		
		regionEditor = new ComboPropertyEditor();
		regionEditor.setLabel("Region");
		regionEditor.setPropertyName("region");
		regionEditor.setDataProvider(new ListProvider(Arrays.asList(new String[] { "Shanghai", "Beijing", "Nanjing" })));
		//regionEditor.setValue("Beijing");
		objectEditor.doAddPropertyEditor(regionEditor);
		
		objectEditor.setDescription("This is a simple form editor");
		valueRepository.put("region", "Beijing"); // 设置下拉框默认值
		objectEditor.setElement(valueRepository);
		
		return objectEditor;
	}

	@Override
	protected String getHelpContextId() {
		return null;
	}

}
