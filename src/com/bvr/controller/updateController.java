package com.bvr.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvr.bean.RegisterBean;
import com.bvr.dao.Command;
import com.bvr.dao.DeleteTermDao;
import com.bvr.dao.UpdateDao;

/**
 * Servlet implementation class updateController
 */
public class updateController extends HttpServlet implements Command {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateController() {
        super();
        // TODO Auto-generated constructor stub
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void execute(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

		if ("update".equalsIgnoreCase(request.getParameter("action"))) {

			this.updateEmployee(request,response);
		}
		}

	private void updateEmployee(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterBean rb = new RegisterBean();
		mapToRegisterDetailsBean(request, rb);
		String result = null;

		
		try {
			result = new UpdateDao().updateUser(rb);
		} catch (Exception e) {
			//log.error("Error in updating emploee details");
			e.printStackTrace();
		}

		if ("success".equalsIgnoreCase(result)){

			HttpSession session = request.getSession();
			session.setAttribute("rb",rb);
			ServletContext context = request.getSession().getServletContext();
			context.getRequestDispatcher("/Register.jsp").forward(request, response);
		}

		else
		{
			ServletContext context = request.getSession().getServletContext();
			context.getRequestDispatcher("/updateuser.jsp").forward(request, response);	
		}
		
	}

	private void mapToRegisterDetailsBean(HttpServletRequest request,
			RegisterBean rb) {
		// TODO Auto-generated method stub
		 rb.setUserId(Integer.parseInt(request.getParameter("userid")));
		 rb.setRandom(request.getParameter("random"));
		 rb.setUserName(request.getParameter("username"));
		 rb.setPassword(request.getParameter("password"));
		 rb.setEmailId(request.getParameter("emailed"));
		
		 rb.setMobileNo(Long.parseLong(request.getParameter("mobileno")));
		 rb.setAddress(request.getParameter("address"));
		 rb.setStatus(request.getParameter("status"));
	}

}
