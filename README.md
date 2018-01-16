# Primeton Studio Plugin Development


## 1）新建向导
给新的资源类型建立向导
扩展点：`org.eclipse.ui.newWizards`


## 2）虚节点，后缀待定
扩展点：`com.primeton.studio.runtime.modelFactory `
隐含配置：虚节点icon配置


## 3）form编辑器
参考ESB代码

## 4）隐藏节点
1）按标准模式扩展的节点，可以直接删除插件项目即可  
2）非标准模式扩展的节点，需要修改底层代码（资源树核心代码，有几个类） 

涉及ptp有关资源树的几个核心类：(plugin: com.primeton.studio.navigator)

+ `ContributionWorkbenchAdapter`
+ `PackageNodeWorkbenchAdapter`


## 5）国际化

### 代码里的国际化
```java

public class NLSMessage extends NLS {

	private static final String BUNDLE_NAME = NLSMessage.class.getName(); //$NON-NLS-1$

	private NLSMessage() {
		super();
	}
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, NLSMessage.class);
	}
	
	public static String SPRING_SERVICE;
	
	public static String SPRING_CONTROLLER;
	
	// ...
```
然后在这个类的相同的路径下新建国化化属性文件 `NLSMessage_zh_CN.properties`, `NLSMessage.properties`, ...

### 插件描述信息
在项目跟径下新建 `plugin.properties`, `plugin_zh_CN.properties`；引用方式:可用于插件概览/扩展配置等，语法：`%key`