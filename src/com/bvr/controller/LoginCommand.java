package com.bvr.controller;



import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvr.bean.RegisterBean;
import com.bvr.dao.Command;
import com.bvr.dao.UserDao;
/**
 * Servlet implementation class LoginCommand
 */
public class LoginCommand implements Command {
	private static final long serialVersionUID = 1L;
       
    

	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterBean ub = new RegisterBean();
        mapToRegisterBean (request,ub);
       String user=request.getParameter("username");
       String pass=request.getParameter("passoword");
                
        if ("success".equalsIgnoreCase(this.checkUser(ub))){        
        	
         
        	HttpSession session = request.getSession();
        	session.setAttribute("UserBean", ub);
        	//String empname = request.getParameter("EmployeeName");
        	//session.setAttribute("employeename", empname);
        	ServletContext context = request.getSession().getServletContext();
        	String username = ub.getUserName();
			String password = ub.getPassword();
        	if ("user".equalsIgnoreCase(username)
					&& "pass".equalsIgnoreCase(password)) {
				context.getRequestDispatcher("/allinone.jsp").forward(
						request, response);
			} else {
				
        	 ServletContext context1 = request.getSession().getServletContext();
             context1.getRequestDispatcher("/index.jsp").forward(request, response);	
			}
        }
               
    }

   
	/**
     * Reads the request object and creates the user bean object
     * 
     */
	
	/**
	 * Calls the DAO Check User
	 */
  



	private String checkUser(RegisterBean ub) {
		// TODO Auto-generated method stub
		try{
    		UserDao  dao = new UserDao(); 
       	return dao.checkUser(ub);
    	}catch(Exception ex){
    		//log.error("Login Error" );
    		return "FAILURE";
    		
    	}
	}



	 private void mapToRegisterBean(HttpServletRequest request, RegisterBean ub) {
		// TODO Auto-generated method stub
		ub.setUserName(request.getParameter("username"));
		ub.setPassword(request.getParameter("password"));
	}

}
