package com.bvr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.ViewMovieDAO;

public class ViewMovieHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String MovieRecord = "/admin.jsp"; 
	private ViewMovieDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMovieHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new ViewMovieDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("ListMovies")){
            //redirect = MovieRecord;
            try {
				request.setAttribute("movie", dao.getAllMovies());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		response.sendRedirect("Distributor.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
