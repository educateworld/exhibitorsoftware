package com.bvr.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.driverconnection.ConnectionProvider;

/**
 * Servlet implementation class TermDataServlet
 */
public class TermDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ServletConfig config;
	  //Setting JSP page
	  String page="selectboxTerm.jsp";

	  public void init(ServletConfig config)
	  throws ServletException{
	 this.config=config;
	 }
	  public void doGet(HttpServletRequest request, 
	HttpServletResponse response) 
	  throws ServletException, IOException {
	  
	  PrintWriter out = response.getWriter();
	  //Establish connection to MySQL database
	  String connectionURL = "jdbc:mysql://192.168.10.59/ramita";
	  Connection connection=null;
	  ResultSet rs;
	  response.setContentType("text/html");
	  List dataList=new ArrayList(); 
	  try {
	 // Load the database driver
	  Class.forName("com.mysql.jdbc.Driver");
	  // Get a Connection to the database
	  connection = 
	  DriverManager.getConnection(connectionURL, "root", ""); 
	  //Select the data from the database
	  String sql = "select message from message";
	  Statement s = connection.createStatement();
	  s.executeQuery (sql);
	  rs = s.getResultSet();
	  while (rs.next ()){
	  //Add records into data list
	  dataList.add(rs.getString("message"));
	  }
	  rs.close ();
	  s.close ();
	  }catch(Exception e){
	  System.out.println("Exception is ;"+e);
	  }
	  request.setAttribute("data",dataList);
	  //Disptching request
	  RequestDispatcher dispatcher = request.getRequestDispatcher(page);
	  if (dispatcher != null){
	  dispatcher.forward(request, response);
	  } 
	  }
}
