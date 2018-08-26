package com.bvr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewCenterDAO;
import com.bvr.dao.ViewTheatorDAO;

/**
 * Servlet implementation class ViewTheatorHandler
 */
public class ViewTheatorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String TheatorRecord = "/admin.jsp"; 
	private ViewTheatorDAO dao;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTheatorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewTheatorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("listTheator")){
            redirect = TheatorRecord;
            try {
				request.setAttribute("theator", dao.getAllTheators());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
