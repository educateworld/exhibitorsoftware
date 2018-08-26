package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteStateDAO;

/**
 * Servlet implementation class DeleteStateHandler
 */
public class DeleteStateHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static String deleteState = "/new.jsp";
	    private static String StateRecord = "/Distributor.jsp";
	    private DeleteStateDAO dao;   
   /**
    * @see HttpServlet#HttpServlet()
    */
   public DeleteStateHandler() {
       super();
       // TODO Auto-generated constructor stub
       dao=new DeleteStateDAO();
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteState")){
        String stateName = request.getParameter("stateName");
       
        try {
			dao.removeState(stateName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // redirect = StateRecord;
        request.setAttribute("users", dao.getAllState());
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
		doGet(request, response);
	}

}
