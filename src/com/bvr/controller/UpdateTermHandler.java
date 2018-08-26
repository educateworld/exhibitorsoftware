package com.bvr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.RegisterBean;
import com.bvr.bean.TermBean;
import com.bvr.dao.UpdateTermDAO;
import com.bvr.dao.UpdateUserDAO;

/**
 * Servlet implementation class UpdateTermHandler
 */
public class UpdateTermHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String updateTerm = "/index.jsp";
    private static String userRecord = "/Distributor.jsp";
    private UpdateTermDAO dao;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTermHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new UpdateTermDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirect="";     
        String action = request.getParameter("action");
		if (action.equalsIgnoreCase("updateTerm")){
			
			int u = Integer.parseInt(request.getParameter("termid"));
			//String stateName = request.getParameter("Term");
      TermBean state = new TermBean();
      
        state.setTermId(u);

        state.setPercentage(Integer.parseInt(request.getParameter("percentage")));
        state.setAdvance(Integer.parseInt(request.getParameter("advance")));
        state.setMarginProfit(Integer.parseInt(request.getParameter("mg")));
       
        
        
        dao.editTerm(state);
        redirect = userRecord;
        request.setAttribute("TermId", userRecord);
       
        System.out.println("Record updated Successfully");
     } else if (action.equalsIgnoreCase("ListState")){
        
        try {
			request.setAttribute("states", dao.getAllTerms());
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
