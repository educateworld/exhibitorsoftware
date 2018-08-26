package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.InsertCenterDAO;
import com.bvr.dao.InsertDistrictDAO;
import com.bvr.dao.InsertStateDAO;
import com.bvr.insertbean.InsertCenterBean;

/**
 * Servlet implementation class InsertCenterHandler
 */
public class InsertCenterHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTCENTER= "/allinone.jsp";  
	private static String UserRecord = "/allinone.jsp"; 
	private InsertCenterDAO dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCenterHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new InsertCenterDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String sid = request.getParameter("stateId");   
		String Id = request.getParameter("districtId");
		String action = request.getParameter("action");
       if(!((Id)== null) && action.equalsIgnoreCase("INSERTCENTER"))
       {
              InsertCenterBean user = new  InsertCenterBean();
               user.setDistrictName(request.getParameter("districtId"));
               user.setCenterName(request.getParameter("centerName"));
               try {
					dao.insertCenter(user);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               //redirect = INSERTCENTER;
               System.out.println("center Added Successfully");
       }
       /*RequestDispatcher rd = request.getRequestDispatcher(redirect);
       rd.forward(request, response);*/
       response.sendRedirect("TheaterManager.jsp");
   }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
