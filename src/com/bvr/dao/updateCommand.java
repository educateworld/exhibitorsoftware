package com.bvr.dao;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvr.bean.RegisterBean;

public class updateCommand implements Command{

	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if ("update".equalsIgnoreCase(request.getParameter("action"))) {
			 System.out.println("con2");
			this.updateUser(request,response);
			 System.out.println("con3");
		}
		}

	private void updateUser(HttpServletRequest request,
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
			 System.out.println("consuccess");
			HttpSession session = request.getSession();
			session.setAttribute("RegisterBean",rb);
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
