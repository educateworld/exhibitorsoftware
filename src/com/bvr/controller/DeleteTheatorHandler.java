package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteCenterDAO;
import com.bvr.dao.DeleteDistrictDAO;
import com.bvr.dao.DeleteTheatorDAO;

/**
 * Servlet implementation class DeleteDistrictHandler
 */
public class DeleteTheatorHandler extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private static String deleteTheator = "/ListTheator.jsp";
	    private static String UserRecord ="/Distributor.jsp";
	    private DeleteTheatorDAO dao;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTheatorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteTheatorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteTheator")){
			String c = request.getParameter("centerId");
    int centerName =Integer.parseInt(c);
     try {
			dao.removeTheator(centerName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    // redirect = UserRecord;
     request.setAttribute("users", dao.getAllTheators());
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
