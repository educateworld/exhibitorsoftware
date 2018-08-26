package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.RegisterDAO;
import com.bvr.dao.TermInsertDAO;
import com.bvr.insertbean.InsertTermBean;

/**
 * Servlet implementation class TermInsertController
 */
public class TermInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTTERM= "/allinone.jsp";
	private static String UserRecord = "/allinone.jsp";
	private TermInsertDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TermInsertController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new TermInsertDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		 String redirect="";
		 if (action.equalsIgnoreCase("INSERTTERM")){
	        	String tId = request.getParameter("termname");        
	        	
	            if(!((tId)== null) && action.equalsIgnoreCase("INSERTTERM"))
	            {
	                    //int percentage = Integer.parseInt(tId);
	                   InsertTermBean user = new  InsertTermBean();
	                    user.setTermname(tId);
	               
	               /* user.setMarginProfit(Integer.parseInt(request.getParameter("mg")));
	                user.setAdvance(Integer.parseInt(request.getParameter("advance")));*/
	                    try {
							dao.insertTerm(user);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                    //redirect = UserRecord;
	                    System.out.println("term Added Successfully");
			            
	    				
	       		     /*RequestDispatcher rd = request.getRequestDispatcher(redirect);
	       		     rd.forward(request, response);*/
	                    response.sendRedirect("TheaterManager.jsp");
	       			}
		 }
	       			}        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       		         doGet(request, response);
	       		     }

}
