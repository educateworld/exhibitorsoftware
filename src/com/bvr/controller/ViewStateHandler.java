package com.bvr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewStateDAO;

/**
 * Servlet implementation class ViewStateHandler
 */
public class ViewStateHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String ListState="/Distributor.jsp";
	private static String StateRecord = "/admin.jsp"; 
	private ViewStateDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStateHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewStateDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("ListState")){
           // redirect = StateRecord;
            try {
				request.setAttribute("states", dao.getAllStates());
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
