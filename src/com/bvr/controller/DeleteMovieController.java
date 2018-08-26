package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteAllMoviesDao;
import com.bvr.dao.DeleteTermDao;

/**
 * Servlet implementation class DeleteMovieController
 */
public class DeleteMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static String deleteMovie = "/viewAllMovies.jsp";
	    private static String UserRecord = "/Distributor.jsp";
	    private DeleteAllMoviesDao dao;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteAllMoviesDao();
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
        request.setAttribute("users", dao.getAllMovies());
        System.out.println("Record Deleted Successfully");
    }
		/*RequestDispatcher rd = request.getRequestDispatcher(redirect);
       rd.forward(request, response);*/
		response.sendRedirect("Distributor.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
