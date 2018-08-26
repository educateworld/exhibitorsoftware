package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.DeleteCollectionDao;
import com.bvr.dao.DeleteDistrictDAO;

/**
 * Servlet implementation class DeleteCollection
 */
public class DeleteCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String deleteCollection = "/listCollection.jsp";
   // private static String districtRecord = "/allinone.jsp";
    private DeleteCollectionDao dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCollection() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteCollectionDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
	if (action.equalsIgnoreCase("deleteCollection")){
 String date =request.getParameter("date");
//int collection=Integer.parseInt(collectionId);
 try {
		dao.removeCollection(date);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
// redirect = districtRecord;
 request.setAttribute("users", dao.getAllCollection());
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
	doGet(request, response);
}

}
