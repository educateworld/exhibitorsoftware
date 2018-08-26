package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.InsertStateDAO;
import com.bvr.insertbean.InsertStateBean;

/**
 * Servlet implementation class InsertStateHandler
 */
public class InsertStateHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTSTATE= "/allinone.jsp";  
	private static String StateRecord = "/allinone.jsp"; 
	private InsertStateDAO dao;
    public InsertStateHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new InsertStateDAO();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String Id = request.getParameter("stateName");        
        String action = request.getParameter("action");
        if(!((Id)== null) && action.equalsIgnoreCase("INSERTSTATE"))
        {
               InsertStateBean user = new  InsertStateBean();
                user.setStateName(request.getParameter("stateName"));
           
                try {
					dao.insertState(user);
				} 
                catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
                catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//redirect = StateRecord;
                System.out.println("state Added Successfully");
        }
        response.sendRedirect("TheaterManager.jsp");
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
	
}
