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
public class DepartmentUpdateActionAction extends AbstractAction {

    @Override
    public String execute(HttpServletRequest request) {
        Long id = Long.parseLong((String)request.getParameter("id"));
        String shortName = (String) request.getParameter("short name");
        String name = (String) request.getParameter("name");
        System.out.println("short name + name:");
        System.out.println(shortName + " " + name);
        
        Department updateDepartment = updateDepartment(id,shortName,name,request);
        request.setAttribute("updateDepartment", updateDepartment);
        return PageConstants.VIEW_UPDATE_DEPARTMENT;
    }

    private Department updateDepartment(Long id, String shortName, String name, HttpServletRequest request) {
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        for (Department department : departments) {
            if (department.getId() == id) {
                department.setName(name);
                department.setShortName(shortName);
                return department; 
            }
        }
        return null;
    }
    
}
