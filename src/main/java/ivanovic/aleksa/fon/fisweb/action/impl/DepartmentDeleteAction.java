/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.action.impl;

import ivanovic.aleksa.fon.fisweb.action.AbstractAction;
import ivanovic.aleksa.fon.fisweb.constants.PageConstants;
import ivanovic.aleksa.fon.fisweb.model.Department;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aleksa
 */
public class DepartmentDeleteAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        Long id = Long.parseLong((String)request.getParameter("id"));
        System.out.println("id za brisanje: " + id);
        deleteDepartment(id, request);
        
        return PageConstants.VIEW_ALL_DEPARTMENT;
    }

    private void deleteDepartment(Long id, HttpServletRequest request) {
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        departments.remove(new Department(id, "", ""));
    }
    
}
