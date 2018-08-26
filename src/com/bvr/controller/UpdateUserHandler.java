package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.RegisterBean;
import com.bvr.dao.UpdateUserDAO;

/**
 * Servlet implementation class UpdateUserHandler
 */
public class UpdateUserHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateUser = "/Edituser.jsp";
    private static String userRecord = "/Distributor.jsp";
    private UpdateUserDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateUserDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateUser")){
			
			int u = Integer.parseInt(request.getParameter("userid"));
			String stateName = request.getParameter("username");
      RegisterBean state = new RegisterBean();
      
        state.setUserId(u);
        state.setRandom(request.getParameter("random"));
        state.setUserName(request.getParameter("username"));
        state.setPassword(request.getParameter("password"));
        state.setEmailId(request.getParameter("emailed"));
        state.setMobileNo(Long.parseLong(request.getParameter("mobileno")));
        state.setAddress(request.getParameter("address"));
        state.setStatus(request.getParameter("status"));
        
        
        dao.editUser(state);
        //redirect = userRecord;
        request.setAttribute("UserId", userRecord);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
       
        try {
			request.setAttribute("state", dao.getAllUsers());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
		
		RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
		//response.sendRedirect("allinone.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
