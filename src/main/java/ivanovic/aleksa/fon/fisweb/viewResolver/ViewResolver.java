/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.viewResolver;

import ivanovic.aleksa.fon.fisweb.constants.PageConstants;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aleksa
 */
public class ViewResolver {
    private final Map<String, String> viewPageMap;
    
    public ViewResolver(){
        viewPageMap=new HashMap<String, String>(){
            {   //key = view, value=page
                put(PageConstants.VIEW_HOME,PageConstants.PAGE_HOME );
                put(PageConstants.VIEW_LOGIN,PageConstants.PAGE_LOGIN );
                put(PageConstants.VIEW_DEFAULT_ERROR,PageConstants.PAGE_DEFAULT_ERROR );
                put(PageConstants.VIEW_ALL_USERS,PageConstants.PAGE_ALL_USERS );
                put(PageConstants.VIEW_ADD_USER,PageConstants.PAGE_ADD_USER );
                put(PageConstants.VIEW_NEW_DEPARTMENT,PageConstants.PAGE_NEW_DEPARTMENT );
                put(PageConstants.VIEW_ALL_DEPARTMENT,PageConstants.PAGE_ALL_DEPARTMENT );
                put(PageConstants.VIEW_NEW_DEPARTMENT_ADD,PageConstants.PAGE_NEW_DEPARTMENT_ADD );
                put(PageConstants.VIEW_UPDATE_DEPARTMENT,PageConstants.PAGE_UPDATE_DEPARTMENT );
            }
        };
    }
    public String getPage(String view) {
        return viewPageMap.get(view);
    }
}
