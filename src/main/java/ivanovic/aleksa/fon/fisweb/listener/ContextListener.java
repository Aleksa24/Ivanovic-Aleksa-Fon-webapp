/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.listener;

import ivanovic.aleksa.fon.fisweb.model.Department;
import ivanovic.aleksa.fon.fisweb.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Aleksa
 */
@WebListener
public class ContextListener implements ServletContextListener {

    public ContextListener() {
        System.out.println("ContextListener kreiran!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Kontekst je kreiran!");
        sce.getServletContext().setAttribute("users", getAllUsers());
        sce.getServletContext().setAttribute("departments", getAllDepartments());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("kontekst je unisten!");
    }

    private List<User> getAllUsers() {
        System.out.println("dodati users");
        return new ArrayList<User>() {
            {
                add(new User("pera", "peric", "pera", "pera"));
                add(new User("sofija", "sofic", "sofija", "sofija"));
                add(new User("jovan", "jovanic", "jovan", "jovan"));
            }
        };
    }

    private List<Department> getAllDepartments() {
        return new ArrayList<Department>() {
            {
                add(new Department(1l,"silab","Labaratorija za softversko inzinjerstvo"));
                add(new Department(2l,"mmklab","Labaratorija za multimedijalne komunikacije"));
                add(new Department(3l,"math","Katedra za matematiku"));
                add(new Department(4l,"labsys","Labaratorija za sisteme"));
            }
        };
    }
}
