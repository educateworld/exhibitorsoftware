package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bvr.dao.DeleteDistributorDAO;

/**
 * Servlet implementation class DeleteDistributorHandler
 */
public class DeleteDistributorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static String deleteDistributor = "/ListDistributor.jsp";
	    private static String DistributorRecord = "/Distributor.jsp"; 
	    private DeleteDistributorDAO dao;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDistributorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new DeleteDistributorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
	if (action.equalsIgnoreCase("deleteDistributor")){
 String distributorName = request.getParameter("distributorId");

 try {
	 System.out.println("distributorName" +distributorName);
		dao.removeDistributor(distributorName);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 //redirect = DistributorRecord;
 try {
	request.setAttribute("users", dao.getAllDistributors());
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
