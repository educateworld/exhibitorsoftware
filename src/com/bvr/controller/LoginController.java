package com.bvr.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvr.dao.LoginDao;
import com.bvr.dao.ViewAllAddDao;
import com.bvr.driverconnection.ConnectionProvider;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn=ConnectionProvider.getConnection();
		String result="hom.jsp";
		try {
			PreparedStatement ps=conn.prepareStatement("select * from register where username=? and password=?");
			 ps.setString(1, request.getParameter("username").trim());
			ps.setString(2, request.getParameter("password").trim());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				HttpSession hs=request.getSession();
				hs.setAttribute("username", request.getParameter("username").trim());
				String uname=request.getParameter("username");
				String password=request.getParameter("password");
					if(uname.equals(rs.getString("username"))&&password.equals(rs.getString("password")))
						result="TheaterManager.jsp";
						if(uname.equals("distributor")&&password.equals("distributor"))
					result="Distributor.jsp";
					}
				
			
			conn.close();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher(result);
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
