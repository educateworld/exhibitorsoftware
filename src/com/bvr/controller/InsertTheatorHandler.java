package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.InsertCenterDAO;
import com.bvr.dao.InsertStateDAO;
import com.bvr.dao.InsertTheatorDAO;
import com.bvr.insertbean.InsertTheatorBean;

/**
 * Servlet implementation class InsertTheatorHandler
 */
public class InsertTheatorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTTHEATOR= "/hom.jsp";  
	private static String UserRecord = "/hom.jsp"; 
	private InsertTheatorDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTheatorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new InsertTheatorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String Id = request.getParameter("centerId"); 
		String[] ss = Id.split("_");
	       
   	 String action = request.getParameter("action");
       if(!((Id)== null) && action.equalsIgnoreCase("INSERTTHEATOR"))
       {
               //int centerId = Integer.parseInt(Id);
              InsertTheatorBean user = new  InsertTheatorBean();
               user.setCenterName(ss[0]);
               user.setStateName(request.getParameter("stateId"));
               user.setDistrictName(request.getParameter("tdistrictId"));
               user.setTheatorName(request.getParameter("theatorName"));
               user.setHousefulCapacity(Integer.parseInt(request.getParameter("housefulCapacity")));
               user.setTheatreDescription(request.getParameter("theatreDescription"));
               user.setOwnerName(request.getParameter("ownerName"));
               user.setContactNumber(request.getParameter("contactNumber"));
               user.setTheatreRent(Float.parseFloat(request.getParameter("theatreRent")));
               user.setDistributorShare(Float.parseFloat(request.getParameter("distributorShare")));
               user.setSlab(Float.parseFloat(request.getParameter("slab")));
               user.setShowTax(Float.parseFloat(request.getParameter("showTax")));
               user.setBatta(Float.parseFloat(request.getParameter("batta")));
               user.setInr(Float.parseFloat(request.getParameter("inr")));
               user.setMc(Float.parseFloat(request.getParameter("mc")));
               try {
					dao.insertTheator(user);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              // redirect = UserRecord;
         // request.setAttribute("users", dao.getAllUsers());    
               System.out.println("theator Added Successfully");
       }
//       RequestDispatcher rd = request.getRequestDispatcher(redirect);
//       rd.forward(request, response);
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
