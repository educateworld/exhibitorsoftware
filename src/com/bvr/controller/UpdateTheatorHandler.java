package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.CenterBean;
import com.bvr.bean.TheatorBean;
import com.bvr.dao.UpdateCenterDAO;
import com.bvr.dao.UpdateTheatorDAO;

/**
 * Servlet implementation class UpdateStateHandler
 */
public class UpdateTheatorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateTheator = "/EditTheator.jsp";
    private static String TheatorRecord = "/Distributor.jsp";
    private UpdateTheatorDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTheatorHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateTheatorDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateTheator")){
			
			int theatorId = Integer.parseInt(request.getParameter("theatorId"));
			/*int centerId = Integer.parseInt(request.getParameter("centerId"));
			String  theatorName= request.getParameter("theatorName");
			Float showTax = Float.parseFloat(request.getParameter("showTax"));
			Float rent = Float.parseFloat(request.getParameter("rent"));
			Float batta = Float.parseFloat(request.getParameter("batta"));
			Float slab = Float.parseFloat(request.getParameter("slab"));
			String ownerName = request.getParameter("ownerName");
			int contactNumber = Integer.parseInt(request.getParameter("contactNumber"));
			Float distributorShare = Float.parseFloat(request.getParameter("distributorShare"));
			Float exhibitorShare = Float.parseFloat(request.getParameter("exhibitorShare"));
		*/	
			TheatorBean theator = new TheatorBean();
			theator.setTheatorId(Integer.parseInt(request.getParameter("theatorId")));
			theator.setCenterName(request.getParameter("centerId"));
			theator.setTheatorName(request.getParameter("theatorName"));
			theator.setHousefulCapacity(Integer.parseInt(request.getParameter("housefulCapacity")));
			theator.setTheatreDescription(request.getParameter("theatreDescription"));
			theator.setOwnerName(request.getParameter("ownerName"));
			theator.setContactNumber(request.getParameter("contactNumber"));
            theator.setTheatreRent(Float.parseFloat(request.getParameter("theatreRent")));
            theator.setDistributorShare(Float.parseFloat(request.getParameter("distributorShare")));
            theator.setSlab(Float.parseFloat(request.getParameter("slab")));
            theator.setShowTax(Float.parseFloat(request.getParameter("showTax")));
            theator.setBatta(Float.parseFloat(request.getParameter("batta")));
            theator.setInr(Float.parseFloat(request.getParameter("inr")));
            theator.setMc(Float.parseFloat(request.getParameter("mc")));
			
        dao.editTheator(theator);
       
        request.setAttribute("theatorId", theatorId);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListTheator")){
       // redirect = TheatorRecord;
        try {
			request.setAttribute("theators", dao.getAllTheators());
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
