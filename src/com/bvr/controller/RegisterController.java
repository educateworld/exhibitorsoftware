package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.RegisterDAO;
import com.bvr.insertbean.InsertUserBean;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTUSER= "/hom.jsp"; 
	private static String UserRecord = "/hom.jsp";
	 private RegisterDAO dao;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
        dao = new RegisterDAO();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        /**
         * @code
         * checks the username if it is not null it will insert a record in register table
         * @action: INSERTUSER
         */
        String uId = request.getParameter("username");        
        String action = request.getParameter("action");
		if(!((uId)== null) && action.equalsIgnoreCase("INSERTUSER"))
        {
              InsertUserBean user = new InsertUserBean();
              user.setRandom(request.getParameter("random"));
              user.setUserName(uId);
            user.setPassword(request.getParameter("password"));
            user.setEmailId(request.getParameter("emailed"));
            user.setMobileNo(request.getParameter("mobileno"));
            user.setAddress(request.getParameter("address"));
            user.setStatus(request.getParameter("status"));
                try {
					dao.insertUser(user);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                redirect = UserRecord;
                System.out.println("Record Added Successfully");
        } RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
		//response.sendRedirect("Register.jsp");
	}
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }

	

}
