package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.AddDAO;
import com.bvr.dao.RegisterDAO;
import com.bvr.insertbean.AddBean;
import com.bvr.insertbean.InsertUserBean;

/**
 * Servlet implementation class InsertAdd
 */
public class InsertAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERTAdd= "/allinone.jsp"; 
	private static String UserRecord = "/allinone.jsp";
	 private AddDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAdd() {
        super();
        // TODO Auto-generated constructor stub
        dao=new AddDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uId1 = request.getParameter("stateName"); 
		System.out.println(uId1);
	    String[] ss = uId1.split("_");
String name=ss[1];
String districtname = request.getParameter("districtName"); 
System.out.println(districtname);
String[] districtname1 = districtname.split("_");
String name1=districtname1[1];

String centerName = request.getParameter("centerName"); 
System.out.println(districtname);
String[] centerName1 = centerName.split("_");
String name2=centerName1[1];

String theatorName = request.getParameter("theatorName"); 
System.out.println(districtname);
String[] theatorName1 = theatorName.split("_");
String name3=theatorName1[1];

String mname = request.getParameter("mname"); 
System.out.println(mname);
String[] mname1 = mname.split("_");
String name4=mname1[1];

    String action = request.getParameter("action");
		String redirect="";
		if(!((name)== null) && action.equalsIgnoreCase("INSERTAdd"))
        {
    
		 
	              AddBean user = new AddBean();
	              System.out.println("ok4");
	              user.setState(name);
	            user.setDistrict(name1);
	            user.setCenter(name2);
	            user.setTheator(name3);
	            user.setMovie(name4);
	            user.setTerm(Integer.parseInt(request.getParameter("percentage")));
	            user.setDistributor(request.getParameter("distname"));
	                try {
						dao.insertAdd(user);
						redirect = UserRecord;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	      
	            //request.setAttribute("users", dao.getAllUsers());    
	                System.out.println("Record Added Successfully");
	        } /*RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);*/
		response.sendRedirect("TheaterManager.jsp");
		}
	       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            doGet(request, response);
	        }
}