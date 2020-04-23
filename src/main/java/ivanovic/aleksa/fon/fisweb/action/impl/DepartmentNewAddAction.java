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
public class DepartmentNewAddAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String shortName = (String) request.getParameter("short name");
        String name = (String) request.getParameter("name");
        System.out.println("short name + name:");
        System.out.println(shortName + " " + name);
        
        addNewDepartment(shortName,name,request);
        return PageConstants.VIEW_NEW_DEPARTMENT_ADD;
    }

    private void addNewDepartment(String shortName, String name, HttpServletRequest request) {
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        System.out.println("departments " + departments);
        Department lastDepartment = departments.get(departments.size() - 1);
        departments.add(new Department(lastDepartment.getId() + 1, shortName, name));
    }

    
}
