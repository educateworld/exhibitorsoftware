package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewAllTermDao;
import com.bvr.dao.ViewTermDao;

/**
 * Servlet implementation class ViewAllTermController
 */
public class ViewAllTermController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String VIEWALLTERM= "/admin.jsp";
	private static String UserRecord = "/Distributor.jsp";
	   private ViewAllTermDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllTermController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new ViewAllTermDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";
		 String action = request.getParameter("action");
		 if (action.equalsIgnoreCase("VIEWALLTERM")){
	           // redirect = VIEWALLTERM;
	            request.setAttribute("users", dao.viewAllTerm());
	         } else {
	           // redirect = UserRecord;
	        }

	       /* RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);*/
		 response.sendRedirect("Distributor.jsp");
	    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
