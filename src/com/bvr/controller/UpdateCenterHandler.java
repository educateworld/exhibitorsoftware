package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.CenterBean;
import com.bvr.dao.UpdateCenterDAO;

/**
 * Servlet implementation class UpdateStateHandler
 */
public class UpdateCenterHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateCenter = "/EditCenter.jsp";
    private static String CenterRecord = "/Distributor.jsp";
    private UpdateCenterDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCenterHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateCenterDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateCenter")){
			
			int centerId = Integer.parseInt(request.getParameter("centerId"));
			String districtName = request.getParameter("districtName");
			String  centerName= request.getParameter("centerName");
			CenterBean center = new CenterBean();
			center.setCenterId(Integer.parseInt(request.getParameter("centerId")));
			center.setDistrictName(request.getParameter("districtName"));
			center.setCenterName(request.getParameter("centerName"));
        dao.editCenter(center);
       
        request.setAttribute("centerId", centerId);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListCenter")){
       // redirect = CenterRecord;
        try {
			request.setAttribute("centers", dao.getAllCenters());
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
