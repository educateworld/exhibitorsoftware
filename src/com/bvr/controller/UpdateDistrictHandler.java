package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.DistrictBean;
import com.bvr.dao.UpdateDistrictDAO;

/**
 * Servlet implementation class UpdateStateHandler
 */
public class UpdateDistrictHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateDistrict = "/EditDistrict.jsp";
    private static String DistrictRecord = "/Distributor.jsp";
    private UpdateDistrictDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDistrictHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateDistrictDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateDistrict")){
			
			int districtId = Integer.parseInt(request.getParameter("districtId"));
			String stateName = request.getParameter("stateId");
			String districtName = request.getParameter("districtName");
        DistrictBean district = new DistrictBean();
        district.setDistrictId(Integer.parseInt(request.getParameter("districtId")));
        district.setStateId(Integer.parseInt(request.getParameter("stateId")));
        district.setDistrictName(request.getParameter("districtName"));
        
        dao.editDistrict(district);
       
        request.setAttribute("districtId", districtId);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListDistrict")){
       // redirect = DistrictRecord;
        try {
			request.setAttribute("districts", dao.getAllDistrict());
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
