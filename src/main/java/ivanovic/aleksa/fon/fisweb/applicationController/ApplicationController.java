/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.applicationController;

import ivanovic.aleksa.fon.fisweb.action.AbstractAction;
import ivanovic.aleksa.fon.fisweb.action.factory.ActionFactory;
import ivanovic.aleksa.fon.fisweb.constants.PageConstants;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aleksa
 */
public class ApplicationController {
    public String processRequest(String pathInfo, HttpServletRequest request) {
        String nextPage = PageConstants.VIEW_DEFAULT_ERROR;
        
        AbstractAction action = ActionFactory.createActionFactory(pathInfo);
        if (action != null) {
            nextPage = action.execute(request);
        }
        
        return nextPage;
    }
}
