package com.bvr.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bvr.dao.MovieInsertDao;
import com.bvr.insertbean.InsertMovieBean;

/**
 * Servlet implementation class MovieInsertController
 */
public class MovieInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static String INSERTMOVIE= "/allinone.jsp";
	 private static String UserRecord = "/allinone.jsp";
	 private MovieInsertDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieInsertController() {
        super();
        // TODO Auto-generated constructor stub
        dao = new MovieInsertDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("INSERTMOVIE")){
           	String mname = request.getParameter("mname");        
           	 
               if(!((mname)== null) && action.equalsIgnoreCase("INSERTMOVIE"))
               {
                       
                      InsertMovieBean user = new  InsertMovieBean();
                      //int pid=Integer.parseInt(Id);
                      // user.setTheatorName(Id);
                       System.out.println("movie"+request.getParameter("mname"));
                       user.setMovieName(request.getParameter("mname"));
                  
                   
                       try {
   						dao.insertMovie(user);
   					} catch (Exception e) {
   						// TODO Auto-generated catch block
   						e.printStackTrace();
   					} 
                      // redirect = UserRecord;
                 // request.setAttribute("users", dao.getAllUsers());    
                      
               }
               System.out.println("movie Added Successfully");
		}
        /*RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);*/
		response.sendRedirect("TheaterManager.jsp");
	}
	       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request, response);
       }
}
