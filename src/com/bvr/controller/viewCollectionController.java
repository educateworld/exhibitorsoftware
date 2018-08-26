package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewAllUsersDao;
import com.bvr.dao.ViewAllcollectionsDao;

/**
 * Servlet implementation class viewCollectionController
 */
public class viewCollectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UserRecord ="/collectionview.jsp";
	private static String VIEWALL= "/collectionview.jsp";
	
	   private ViewAllcollectionsDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewCollectionController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new ViewAllcollectionsDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";
		 String action = request.getParameter("action");
		 if (action.equalsIgnoreCase("VIEWALL")){
	          //  redirect = UserRecord;
	            request.setAttribute("users", dao.viewAllusers());
	         } else {
	          
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
