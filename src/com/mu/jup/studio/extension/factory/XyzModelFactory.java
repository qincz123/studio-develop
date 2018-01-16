package com.mu.jup.studio.extension.factory;

import org.eclipse.core.runtime.IProgressMonitor;

import com.mu.jup.studio.extension.Activator;
import com.primeton.studio.core.IMessageCaller;
import com.primeton.studio.runtime.RuntimeConstant;
import com.primeton.studio.runtime.model.IModelCompiler;
import com.primeton.studio.runtime.model.IModelParser;
import com.primeton.studio.runtime.model.IModelValidator;
import com.primeton.studio.runtime.model.ModelChangeEvent;
import com.primeton.studio.runtime.model.base.AbstractModelFactory;
import com.primeton.studio.runtime.model.base.AbstractModelValidator;
import com.primeton.studio.runtime.model.internal.CopyModelCompiler;
import com.primeton.studio.runtime.resources.IFileDelegate;


public class XyzModelFactory extends AbstractModelFactory {
	
	static final String EXTENSION = "xyz";

	@Override
	public String getBundleName() {
		return Activator.PLUGIN_ID;
	}

	@Override
	public IModelCompiler getCompiler(Object model,
			IProgressMonitor progressMonitor) {
		return new CopyModelCompiler(EXTENSION);
	}

	@Override
	public IModelValidator getValidator(Object model,
			IProgressMonitor progressMonitor) {
		return new AbstractModelValidator() {
			
			@Override
			public boolean validate(IFileDelegate fileDelegate, Object object,
					ModelChangeEvent modelChangeEvent, IMessageCaller messageCaller,
					IProgressMonitor progressMonitor) {
				return true;
			}
		};
	}

	@Override
	public IModelParser getModelParser(IFileDelegate fileDelegate,
			IProgressMonitor progressMonitor) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Object createModel(IProgressMonitor progressMonitor) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getCategory() {
		return RuntimeConstant.FILE;
	}

	@Override
	public String getName() {
		return "Xyz";
	}

	@Override
	public String getDisplayName() {
		return "Xyz";
	}

}
