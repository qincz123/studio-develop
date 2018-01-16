package com.mu.jup.studio.extension.adapter;

import org.eclipse.jface.resource.ImageDescriptor;

import com.mu.jup.studio.extension.Activator;
import com.primeton.studio.navigator.IProjectNavigator;
import com.primeton.studio.navigator.base.AbstractWorkbenchAdapter;

@Deprecated
public class XyzNodeWorkbenchAdapter extends AbstractWorkbenchAdapter {
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object,
			IProjectNavigator projectNavigator) {
		return Activator.getDefault().getImageRegistry().getDescriptor("/icons/m2.gif");
//		return super.getImageDescriptor(object, projectNavigator);
	}

}
