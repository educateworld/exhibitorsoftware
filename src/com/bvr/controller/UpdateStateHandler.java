package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.StateBean;
import com.bvr.dao.DeleteStateDAO;
import com.bvr.dao.UpdateStateDAO;

/**
 * Servlet implementation class UpdateStateHandler
 */
public class UpdateStateHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateState = "/EditState.jsp";
    private static String StateRecord = "/Distributor.jsp";
    private UpdateStateDAO dao;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStateHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateStateDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateState")){
			
			int stateId = Integer.parseInt(request.getParameter("stateId"));
			String stateName = request.getParameter("stateName");
        StateBean state = new StateBean();
        state.setStateId(Integer.parseInt(request.getParameter("stateId")));
        state.setStateName(request.getParameter("stateName"));
        
        dao.editState(state);
       
        request.setAttribute("stateId", stateId);
        
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
        //redirect = StateRecord;
        try {
			request.setAttribute("states", dao.getAllStates());
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
