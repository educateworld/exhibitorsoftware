package com.bvr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewCenterDAO;
import com.bvr.dao.ViewDistrictDAO;

/**
 * Servlet implementation class ViewCenterHandler
 */
public class ViewCenterHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String listCenter="ListCenter.jsp";
	private static String CenterRecord = "/admin.jsp"; 
	private ViewCenterDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCenterHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewCenterDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("listCenter")){
            //redirect = CenterRecord;
            try {
				request.setAttribute("center", dao.getAllCenters());
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
