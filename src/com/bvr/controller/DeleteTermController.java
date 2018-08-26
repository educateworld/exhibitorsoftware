package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteTermDao;
import com.bvr.dao.DeleteUserDao;

/**
 * Servlet implementation class DeleteTermController
 */
public class DeleteTermController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static String deleteTerm = "/ViewAllTerm.jsp";
	    private static String UserRecord = "/Distributor.jsp";
	    private DeleteTermDao dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTermController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteTermDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteTerm")){
         String userId = request.getParameter("termId");
         int uid = Integer.parseInt(userId);
         dao.removeTerm(uid);
         //redirect = UserRecord;
         request.setAttribute("users", dao.getAllTerm());
         System.out.println("Record Deleted Successfully");
     }
		/*RequestDispatcher rd = request.getRequestDispatcher(redirect);
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
