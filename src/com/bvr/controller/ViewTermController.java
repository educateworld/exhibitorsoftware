package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewTermDao;

/**
 * Servlet implementation class ViewTermController
 */
public class ViewTermController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String VIEWTERM= "/admin.jsp";
	private static String UserRecord = "/RegisterSuccess.jsp";
	   private ViewTermDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTermController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new ViewTermDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";
		 String action = request.getParameter("action");
		 if (action.equalsIgnoreCase("VIEWTERM")){
	            redirect = VIEWTERM;
	            request.setAttribute("users",dao.viewTerm());
	         } else {
	            redirect = UserRecord;
	        }

	        RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);
	    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
