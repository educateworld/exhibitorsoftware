package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.DistributorBean;
import com.bvr.bean.TermBean;
import com.bvr.dao.UpdateDistributorDAO;
import com.bvr.dao.UpdateTermDAO;

/**
 * Servlet implementation class UpdateDistributorHandler
 */
public class UpdateDistributorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updatedist = "/editDistributor.jsp";
    private static String userRecord = "/Distributor.jsp";
    private UpdateDistributorDAO dao;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDistributorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateDistributorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updatedist")){
			
			int u = Integer.parseInt(request.getParameter("distid"));
			String stateName = request.getParameter("Term");
      DistributorBean state = new DistributorBean();
      
        state.setDistributorId(u);

        state.setDistributorName(request.getParameter("distname"));
        state.setMobileNumber(request.getParameter("distmobileno"));
        state.setAddress(request.getParameter("distaddress"));
       
        
        
        dao.editDistributor(state);
       
        request.setAttribute("DistributorId", userRecord);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
        //redirect = userRecord;
        try {
			request.setAttribute("states", dao.getAllDistributor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
