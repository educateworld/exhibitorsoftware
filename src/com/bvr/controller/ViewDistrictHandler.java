package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewDistrictDAO;
import com.bvr.dao.ViewStateDAO;

/**
 * Servlet implementation class ViewDistrictHandler
 */
public class ViewDistrictHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String DistrictRecord = "/admin.jsp"; 
	private ViewDistrictDAO dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDistrictHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewDistrictDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("listDistrict")){
            //redirect = DistrictRecord;
            try {
				request.setAttribute("district", dao.getAllDistrict());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         } 
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
