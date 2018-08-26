package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.MoviesBean;
import com.bvr.bean.TermBean;
import com.bvr.dao.UpdateMovieDAO;
import com.bvr.dao.UpdateTermDAO;

/**
 * Servlet implementation class UpdateMovieHandler
 */
public class UpdateMovieHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateMovie = "/editMovie.jsp";
    private static String userRecord = "/Distributor.jsp";
    private UpdateMovieDAO dao;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMovieHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateMovieDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateMovie")){
			System.out.println("hand1");
			int u = Integer.parseInt(request.getParameter("mid"));
			
     MoviesBean state = new MoviesBean();
      
        state.setMovieId(u);

        state.setMovieName(request.getParameter("mname"));
       // state.setTheatorName(request.getParameter("theatorId"));
       
        
        
        dao.editMovie(state);
        redirect = userRecord;

        request.setAttribute("state",state);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
                try {
                	  // redirect = userRecord;

			request.setAttribute("state", dao.getAllMovies());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

