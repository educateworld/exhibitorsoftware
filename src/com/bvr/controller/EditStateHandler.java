package com.bvr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.StateBean;
import com.bvr.dao.EditStateDAO;

/**
 * Servlet implementation class EditStateHandler
 */
public class EditStateHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String Edit = "/EditState.jsp";
    private static String StateRecord = "/listState.jsp";
    private EditStateDAO dao; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStateHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao = new EditStateDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String redirect="";
        String Id = request.getParameter("stateName");        
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("editform")){         
            redirect = Edit;            
    } 

else if (action.equalsIgnoreCase("edit")){
    	String sname = request.getParameter("stateName");
        StateBean state = new StateBean();
        state.setStateName(request.getParameter("stateName"));
        try {
			dao.editState(state);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.setAttribute("state", state);
        //redirect = StateRecord;
        System.out.println("Record updated Successfully");
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
