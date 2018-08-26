package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteCenterDAO;
import com.bvr.dao.DeleteDistrictDAO;

/**
 * Servlet implementation class DeleteDistrictHandler
 */
public class DeleteCenterHandler extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private static String deleteCenter = "/ListCenter.jsp";
	    private static String CenterRecord = "/Distributor.jsp";
	    private DeleteCenterDAO dao;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCenterHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteCenterDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteCenter")){
			int districtId = Integer.parseInt(request.getParameter("districtId"));
    
     try {
			dao.removeCenter(districtId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    // redirect = CenterRecord;
     request.setAttribute("users", dao.getAllCenters());
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
