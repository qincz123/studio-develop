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
+ ``