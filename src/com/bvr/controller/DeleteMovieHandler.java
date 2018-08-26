package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bvr.dao.DeleteMovieDAO;

/**
 * Servlet implementation class DeleteMovieHandler
 */
public class DeleteMovieHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UserRecord = "/Distributor.jsp";
	 private static String deleteMovie = "/viewMovie.jsp";
	 	    private DeleteMovieDAO dao; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteMovieDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteMovie")){
      String userId = request.getParameter("movieId");
      int uid = Integer.parseInt(userId);
      dao.removeMovie(uid);
      //redirect = UserRecord;
      try {
		request.setAttribute("users", dao.getAllMovies());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Record Deleted Successfully");
	     }
			/*RequestDispatcher rd = request.getRequestDispatcher(redirect);
	        rd.forward(request, response);*/
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
