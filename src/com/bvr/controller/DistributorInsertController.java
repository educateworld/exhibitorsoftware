package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DistributorInsertDao;
import com.bvr.insertbean.InsertDistributorBean;


/**
 * Servlet implementation class DistributorInsertController
 */
public class DistributorInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTDISTRIBUTOR= "/Distributor.jsp";
	 private static String UserRecord = "/Distributor.jsp";
	 private DistributorInsertDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistributorInsertController() {
        super();
        // TODO Auto-generated constructor stub
        dao = new DistributorInsertDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubif (
		 String redirect="";
		  String action = request.getParameter("action");
       	String Id = request.getParameter("distributorName");        
      	 //String action1 = request.getParameter("action");
          if(!((Id)== null) && action.equalsIgnoreCase("INSERTDISTRIBUTOR"))
          {
                  
                 InsertDistributorBean user = new  InsertDistributorBean();
                  user.setDistributorName(Id);
                  user.setMobileNumber(request.getParameter("mobileNumber"));
                  user.setAddress(request.getParameter("address"));
             
              
                  try {
						dao.insertDistributor(user);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					// redirect = UserRecord;
			            //request.setAttribute("users", dao.getAllUsers());    
			                System.out.println("Record Added Successfully");
			                System.out.println("movie Added Successfully");
		            
				
		     /*RequestDispatcher rd = request.getRequestDispatcher(redirect);
		     rd.forward(request, response);*/
			}
          response.sendRedirect("Distributor.jsp");
			}        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         doGet(request, response);
		     }
		}