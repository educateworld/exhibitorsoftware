package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.InsertDistrictDAO;
import com.bvr.dao.InsertStateDAO;
import com.bvr.insertbean.InsertDistrictBean;

/**
 * Servlet implementation class InsertDistrictHandler
 */
public class InsertDistrictHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTDISTRICT= "/allinone.jsp";  
	private static String UserRecord = "/allinone.jsp"; 
	private InsertDistrictDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDistrictHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new InsertDistrictDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
        String action = request.getParameter("action");
        String Id = request.getParameter("dstateName1");        
       if(!((Id)== null) && action.equalsIgnoreCase("INSERTDISTRICT"))
       {
               //int stateId = Integer.parseInt(Id);
              InsertDistrictBean user = new  InsertDistrictBean();
               user.setStateName(request.getParameter("dstateName1"));
               user.setDistrictName(request.getParameter("districtName"));
          
           
               try {
					dao.insertDistrict(user);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              // redirect = INSERTDISTRICT;
               System.out.println("district Added Successfully");
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
