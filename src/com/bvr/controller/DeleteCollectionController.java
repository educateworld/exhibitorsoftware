package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteCollectionsDao;
import com.bvr.dao.DeleteTermDao;

/**
 * Servlet implementation class DeleteCollectionController
 */
public class DeleteCollectionController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private static String deleteCollection = "/collectionview.jsp";
	    private static String UserRecord =  "/collectionview.jsp";
	    private DeleteCollectionsDao dao;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCollectionController() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteCollectionsDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String redirect="";     
	        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("deleteCollection")){
      String userId = request.getParameter("collectionId");
      int uid = Integer.parseInt(userId);
      dao.removeCollection(uid);
      //redirect = UserRecord;
      request.setAttribute("users", dao.getAllCollections());
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