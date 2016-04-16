package com.android.uiautomator.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import com.android.uiautomator.UiAutomatorViewer;

public class ClearTextAction extends Action{
	UiAutomatorViewer mWindow;
	
	public ClearTextAction(UiAutomatorViewer window){
		mWindow = window;
		setText("&Clear Text");
	}
	
	@Override
    public ImageDescriptor getImageDescriptor() {
        return ImageHelper.loadImageDescriptorFromResource("images/clear.png");
    }
	
	@Override
	public void run(){
		mWindow.clearShow();
	}
}
