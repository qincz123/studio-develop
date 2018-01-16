package com.mu.jup.studio.extension.wizard;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import com.primeton.studio.navigator.ProjectNavigator;

public class NewXyzWizard extends BasicNewResourceWizard {
	
	private WizardNewFileCreationPage firstPage;
	private NewXyzSecondPage secondPage;
	
	@Override
	public void addPages() {
		ISelection selection = ProjectNavigator.getViewInstance().getCommonViewer().getSelection();
		
//		firstPage = new NewXyzWizardPage("新建Xyz文件", (IStructuredSelection) selection);
		firstPage = new WizardNewFileCreationPage("新建Xyz文件", (IStructuredSelection) selection);
		firstPage.setFileExtension("xyz");
		firstPage.setDescription("This a wizard to new Xyz.");
		firstPage.setTitle("New Xyz wizard");
		firstPage.setMessage("This a Xyz wizard messsage.");
		
		addPage(firstPage);
		
		secondPage = new NewXyzSecondPage();
		//secondPage.setXXX
		addPage(secondPage);
	}
	
	

    @Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof NewXyzWizardPage) {
			return secondPage;
		}
		return super.getNextPage(page);
	}



	public boolean performFinish() {
        IFile file = firstPage.createNewFile();
        if (file == null) {
			return false;
		}
        
        try {
			file.setCharset("utf-8", new NullProgressMonitor());
			file.setContents(new ByteArrayInputStream("# This is xyz template".getBytes("utf-8")), true, true, new NullProgressMonitor());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

        selectAndReveal(file);

        // Open editor on new file.
        IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
        try {
            if (dw != null) {
                IWorkbenchPage page = dw.getActivePage();
                if (page != null) {
                    IDE.openEditor(page, file, true);
                }
            }
        } catch (PartInitException e) {
            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage, 
                    e.getMessage(), e);
        }

        return true;
    }

}
