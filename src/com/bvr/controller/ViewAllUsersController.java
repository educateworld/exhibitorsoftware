package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewAllTermDao;
import com.bvr.dao.ViewAllUsersDao;

/**
 * Servlet implementation class ViewAllUsersController
 */
public class ViewAllUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String VIEWALLUSERS= "/admin.jsp";
	private static String UserRecord = "/Distributor.jsp";
	   private ViewAllUsersDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllUsersController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new ViewAllUsersDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";
		 String action = request.getParameter("action");
		 if (action.equalsIgnoreCase("VIEWALLUSERS")){
	            //redirect = VIEWALLUSERS;
	            request.setAttribute("users", dao.viewAllusers());
	         } else {
	           // redirect = UserRecord;
	        }

	       RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);
		// response.sendRedirect("allinone.jsp");
	    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
