/*
 * Created on Jan 24, 2005
 * by Christopher Bradford
 *
 */
package com.rohanclan.cfml.editors.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;

import com.rohanclan.cfml.CFMLPlugin;

/**
 * @author Christopher Bradford
 *
 * Runs the last Action registered with LastActionManager
 */
public class LastActionAction extends GenericEncloserAction {

    private IActionDelegate act;
    
    /**
     * 
     */
    public LastActionAction() {
        super();
    }

    public void run() {
        run(null);
    }
    
    public void run(IAction action) {
        try {
	        act = CFMLPlugin.getDefault().getLastActionManager().getLastActionForEditor(this.editor);
	        act.run(action);
        }
        catch (Exception e) {
            // Do nothing
        }
    }
}
