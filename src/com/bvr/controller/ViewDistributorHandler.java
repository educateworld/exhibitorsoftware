package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewDistributorDAO;

import com.bvr.insertbean.InsertDistributorBean;

/**
 * Servlet implementation class ViewDistributorHandler
 */
public class ViewDistributorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String DistributorRecord = "/admin.jsp"; 
	private ViewDistributorDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDistributorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewDistributorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("ListDistributor")){
            //redirect = DistributorRecord;
            try {
				request.setAttribute("distributor", dao.getAllDistributors());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		response.sendRedirect("allinone.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
