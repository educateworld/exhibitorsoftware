package com.bvr.controller;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.dao.Command;
import com.bvr.dao.updateCommand;

import java.util.Map;
import java.util.HashMap;

/**
 * Servlet implementation class controller
 */

public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map commands = new HashMap();
    /**
     * Default constructor. 
     */
    public controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 this.commands.put("UPDATEUSER", new updateCommand());
		 this.commands.put("login", new LoginCommand());
		 System.out.println("con1");
		
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		 return "Short description";
	}

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException
    	    {
    	      processCommand(request, response);
    	    }
    public void processCommand(HttpServletRequest  request,
            HttpServletResponse response)
        throws ServletException, IOException
        {

			// formAction is set null from fileUpload.jsp for upload
			String formAction = request.getParameter("form_action");
			System.out.println(formAction);
			if(null == formAction){
			formAction = "upload";
		}

			// Retrieve the command object with the key as formAction

				Command command = (Command)commands.get(formAction);

				if(null == command)	
				{
					throw new IllegalArgumentException(
							"No command for form action: " + formAction);
				}

				// Calling the command class execute method

				command.execute(request, response);
    	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		 processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		 processRequest(request, response);
	}
	

}
