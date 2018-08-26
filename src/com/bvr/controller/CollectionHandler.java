package com.bvr.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.tagplugins.jstl.core.Redirect;

import com.bvr.bean.CollectionBean;
import com.bvr.dao.CollectionDao;
import com.bvr.driverconnection.ConnectionProvider;

/**
 * Servlet implementation class CollectionHandler
 */
public class CollectionHandler extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String UserRecord = "/TheaterManager.jsp";
	 @SuppressWarnings("unused")
	private static String INSERT = "/TheaterManager.jsp";
	 private static CollectionDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
    public CollectionHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new CollectionDao();
        //System.out.println("collection handler");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {
    	System.out.println("entered in to collection handler");
         String cnme=request.getParameter("cname");
        String tnme=request.getParameter("tname");
        String mnme=request.getParameter("mname");
        String date=request.getParameter("date");
      int theatoridshow=Integer.parseInt(request.getParameter("theatoridshow"));
        String[] ss = cnme.split("_");
        String[] ss1 = tnme.split("_");
        String[] ss2 = mnme.split("_");
        String[] daydate = date.split("_");
        String name=ss[1];
        String tnme1=ss1[1];
        String mnme1=ss2[0];
        //int cid=Integer.parseInt(theatoridshow);
        System.out.println("cid:"+theatoridshow+"date:"+daydate[1]);
        String action = request.getParameter("action");
        String redirect="";
  		
        		if(!((name)== null) && action.equalsIgnoreCase("INSERT"))
       
        {
        	
              CollectionBean collection = new CollectionBean();
              collection.setCollectionId(theatoridshow);
              //collection.setDa(request.getParameter("date"));
           collection.setTname(tnme1);
           collection.setCname(name);
           collection.setMname(mnme1);
          // collection.setTheatorid(theatorid);
           collection.setDa(daydate[1]);
           collection.setTotaldays(Integer.parseInt(request.getParameter("totaldays")));
           collection.setTodayaudiance(Integer.parseInt(request.getParameter("todayaudiance")));
           collection.setTotalaudiance(Integer.parseInt(request.getParameter("totalaudiance")));
            collection.setTodaygross(Float.parseFloat(request.getParameter("todaygross")));
           collection.setTotalgross(Float.parseFloat(request.getParameter("totalgross")));
           collection.setTodaynet(Float.parseFloat(request.getParameter("todaynet")));
           collection.setTotalnet(Float.parseFloat(request.getParameter("totalnet")));
           collection.setTodayshows(Float.parseFloat(request.getParameter("todayshows")));
           collection.setTotalshows(Float.parseFloat(request.getParameter("totalshows")));
           collection.setTodayexhibitorshare(Float.parseFloat(request.getParameter("todayexhibitorshare")));
           collection.setTotalexhibitorshare(Float.parseFloat(request.getParameter("totExhibitorShare")));
           collection.setTodaydistributorshare(Float.parseFloat(request.getParameter("todaydistributorshare")));
           collection.setTotaldistributorshare(Float.parseFloat(request.getParameter("totDistributorShare")));
           collection.setCollectionmorning(Float.parseFloat(request.getParameter("collectionmorning")));
           collection.setCollectionmatinee(Float.parseFloat(request.getParameter("collectionsecond")));
           collection.setCollectionfirst(Float.parseFloat(request.getParameter("collectionmatinee")));
           collection.setCollectionsecond(Float.parseFloat(request.getParameter("collectionfirst")));
           collection.setCollectionbenifit(Float.parseFloat(request.getParameter("collectionbenifit")));
           collection.setCollectiospecial(Float.parseFloat(request.getParameter("collectiospecial")));
            collection.setAudiencemorning(Integer.parseInt(request.getParameter("audiencemorning")));
           collection.setAudiencematinee(Integer.parseInt(request.getParameter("audiencematinee")));
           collection.setAudiencefirst(Integer.parseInt(request.getParameter("audiencefirst")));
           collection.setAudiencesecond(Integer.parseInt(request.getParameter("audiencesecond")));
           collection.setAudiencebenifit(Integer.parseInt(request.getParameter("audiencebenifit")));
           collection.setAudiencespecial(Integer.parseInt(request.getParameter("audiencespecial")));
           collection.setSlab(Float.parseFloat(request.getParameter("slab")));
           collection.setShowTax(Float.parseFloat(request.getParameter("showTax")));
           collection.setBatta(Float.parseFloat(request.getParameter("batta")));
           collection.setOd(Float.parseFloat(request.getParameter("od")));
           collection.setMc(Float.parseFloat(request.getParameter("mc")));
           
           
                try {
					dao.collection(collection);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                //redirect = UserRecord;
                System.out.println("Record Added Successfully");
        }/*RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);*/
        		response.sendRedirect("TheaterManager.jsp");
        }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
