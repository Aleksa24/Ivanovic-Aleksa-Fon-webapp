/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.action.factory;

import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentNewAction;
import ivanovic.aleksa.fon.fisweb.action.AbstractAction;
import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentAllAction;
import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentDeleteAction;
import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentNewAddAction;
import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentUpdateAction;
import ivanovic.aleksa.fon.fisweb.action.impl.DepartmentUpdateActionAction;
import ivanovic.aleksa.fon.fisweb.action.impl.LoginAction;
import ivanovic.aleksa.fon.fisweb.constants.ActionConstants;

/**
 *
 * @author Aleksa
 */
public class ActionFactory {
    public static AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if (actionName.equals(ActionConstants.URL_LOGIN)) {
            action = new LoginAction();
        }
        if (actionName.equals(ActionConstants.URL_ALL_DEPARTMENT)) {
            action = new DepartmentAllAction();
        }
        if (actionName.equals(ActionConstants.URL_NEW_DEPARTMENT)) {
            action = new DepartmentNewAction();
        }
        if (actionName.equals(ActionConstants.URL_DELETE_DEPARTMENT)) {
            action = new DepartmentDeleteAction();
        }
        if (actionName.equals(ActionConstants.URL_UPDATE_DEPARTMENT)) {
            action = new DepartmentUpdateAction();
        }
        if (actionName.equals(ActionConstants.URL_UPDATE_DEPARTMENT_ACTION)) {
            action = new DepartmentUpdateActionAction();
        }
        
        
        return action;
    }
}
