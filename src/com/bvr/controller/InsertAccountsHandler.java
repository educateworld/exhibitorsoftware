package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.AccountsBean;
import com.bvr.dao.InsertAccountDAO;

/**
 * Servlet implementation class InsertAccountsHandler
 */
public class InsertAccountsHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String insert= "/allinone.jsp";  
	private static String Record = "/allinone.jsp"; 
	private InsertAccountDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAccountsHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new InsertAccountDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
        String action = request.getParameter("action");
        String Id = request.getParameter("distname");        
       if(!((Id)== null) && action.equalsIgnoreCase("insert"))
       {
               
    	   AccountsBean user = new  AccountsBean();
    	 
    	   System.out.println("hi" +Id);
    	   user.setDistName(Id);
               user.setDate(request.getParameter("date"));
               user.setTermtype(Integer.parseInt(request.getParameter("termtype")));
               user.setTermname(request.getParameter("termname"));
               user.setAmount(Integer.parseInt(request.getParameter("amount")));
           /*    user.setVoucherNo(Integer.parseInt(request.getParameter("voucherNo")));*/
               user.setNarration(request.getParameter("narration"));
          
           
               try {
					dao.insertAccount(user);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              //redirect =  Record;
               System.out.println("accounts Added Successfully");
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