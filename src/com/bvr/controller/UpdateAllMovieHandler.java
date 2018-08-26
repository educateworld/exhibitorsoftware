package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.MoviesBean;
import com.bvr.bean.TermBean;
import com.bvr.dao.UpdateAllMovieDAO;
import com.bvr.dao.UpdateTermDAO;

/**
 * Servlet implementation class UpdateAllMovieHandler
 */
public class UpdateAllMovieHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String update = "/EditAllMovie.jsp";
    private static String userRecord = "/Distributor.jsp";
    private UpdateAllMovieDAO dao;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAllMovieHandler() {
        super();
        // TODO Auto-generated constructor stub
    dao=new UpdateAllMovieDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("update")){
			
			int u = Integer.parseInt(request.getParameter("mid"));
			//String stateName = request.getParameter("Term");
      MoviesBean state = new MoviesBean();
      
        state.setMovieId(u);

        //state.setTheatorName(request.getParameter("theatorId"));
        state.setMovieName(request.getParameter("mname"));
          dao.editMovie(state);
       
        request.setAttribute("TermId", userRecord);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
       // redirect = userRecord;
        try {
			request.setAttribute("states", dao.getAllMovies());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		doGet(request, response);
	}

}
