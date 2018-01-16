/**
 * I18nMessage.java
 * Created at Aug 11, 2014
 * Created by Administrator
 * Copyright (C) 2014 SHANGHAI VOLKSWAGEN, All rights reserved.
 */
package com.mu.jup.studio.extension;

import org.eclipse.osgi.util.NLS;

/**
 * <p>ClassName: NLSMessage</p>
 * <p>Description: 国际化信息 </p>
 * <p>Author: Administrator</p>
 * <p>Date: Aug 11, 2014</p>
 */
public class NLSMessage extends NLS {

	private static final String BUNDLE_NAME = NLSMessage.class.getName(); //$NON-NLS-1$

	/**
	 * <p>Description: 构造方法私有化</p>
	 */
	private NLSMessage() {
		super();
	}
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, NLSMessage.class);
	}
	
	public static String NEW_XYZ_WIZARD_PAGE1_NAME;
	
	public static String NEW_XYZ_WIZARD_PAGE2_NAME;
	
    
}
