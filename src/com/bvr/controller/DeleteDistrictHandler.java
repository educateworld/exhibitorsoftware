package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteDistrictDAO;

/**
 * Servlet implementation class DeleteDistrictHandler
 */
public class DeleteDistrictHandler extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private static String deleteDistrict = "/ListDistrict.jsp";
	    private static String districtRecord = "/Distributor.jsp";
	    private DeleteDistrictDAO dao;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDistrictHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteDistrictDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteDistrict")){
     String stateId = request.getParameter("stateId");
    int stateName=Integer.parseInt(stateId);
     try {
			dao.removeDistrict(stateName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    // redirect = districtRecord;
     request.setAttribute("users", dao.getAllDistrict());
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
