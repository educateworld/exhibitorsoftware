package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewAllAddDao;
import com.bvr.dao.ViewAllUsersDao;

/**
 * Servlet implementation class AddController
 */
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String VIEWALL= "/viewAdd.jsp";
	private static String UserRecord = "/RegisterSuccess.jsp";
	   private ViewAllAddDao dao; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
          dao=new ViewAllAddDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String redirect="";
		 String action = request.getParameter("action");
		 if (action.equalsIgnoreCase("VIEWALL")){
	            redirect = VIEWALL;
	            request.setAttribute("users", dao.viewAll());
	         } else {
	            redirect = UserRecord;
	        }

	        RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);
	    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
