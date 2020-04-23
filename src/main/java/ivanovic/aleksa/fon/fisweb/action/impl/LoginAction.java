/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanovic.aleksa.fon.fisweb.action.impl;

import ivanovic.aleksa.fon.fisweb.action.AbstractAction;
import ivanovic.aleksa.fon.fisweb.constants.PageConstants;
import ivanovic.aleksa.fon.fisweb.model.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aleksa
 */
public class LoginAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        System.out.println("====================================================");
        System.out.println("====================LoginAction=====================");
        System.out.println(email+"\t"+password);
        System.out.println("====================================================");
        
        //proveri da li postoji
        User user=findUser(request, email);
        if (user==null){
            request.setAttribute("message", "User does not exist!");
             return PageConstants.VIEW_LOGIN;
        }else{
            //korisnik postoji
            request.getSession(true).setAttribute("loginUser", user);
            return PageConstants.VIEW_HOME;
        }
    }

    private User findUser(HttpServletRequest request, String email) {
        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        System.out.println(users);
        for (User user : users) {
            if (user.getEmail().equals(email)) return user;
        }
        return null;
    }
    
}
