package com.bvr.controller;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bvr.bean.MappingBean;
import com.bvr.dao.MappingDao;
import com.bvr.controller.Days;
/**
 * Servlet implementation class MappingHandler
 */
public class MappingHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UserRecord = "/Distributor.jsp";
	@SuppressWarnings("unused")
	private static String INSERT = "/Distributor.jsp";
	private static MappingDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MappingHandler() {
        super();
        // TODO Auto-generated constructor stub
        dao=new MappingDao();
        
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
			
		    String cnme=request.getParameter("centerId");
	        String tnme=request.getParameter("tname");
	        String mnme=request.getParameter("mname");
	        String[] ss = cnme.split("_");
	        String[] ss1 = tnme.split("_");
	        String[] ss2 = mnme.split("_");
	        String name=ss[1];
	        String tnme1=ss1[4];
	        String mnme1=ss2[0];
	        String action = request.getParameter("action");
	        String redirect="";
    	        String startdate=request.getParameter("startdate");
    	        String enddate=request.getParameter("enddate");
    	        String[] startday=startdate.split("-");
    	        String[] endday=enddate.split("-");
    	        int startingyear=Integer.parseInt(startday[0]);
    	        int startingmonth=Integer.parseInt(startday[1]);
    	        int startingday=Integer.parseInt(startday[2])-1;
    	        int endingyear=Integer.parseInt(endday[0]);
    	        int endingmonth=Integer.parseInt(endday[1]);
    	        int endingday=Integer.parseInt(endday[2]);
    	        Calendar calendar1 = Calendar.getInstance();
    	        Calendar calendar2 = Calendar.getInstance();
    	        calendar1.set(startingyear, startingmonth, startingday);
    	        calendar2.set(endingyear, endingmonth, endingday);
    	        long milis1 = calendar1.getTimeInMillis();
    	        long milis2 = calendar2.getTimeInMillis();
    	        long day1 = milis2 - milis1;
    	        long diffSeconds = day1 / 1000;
    	        long diffMinutes = day1/ (60 * 1000);
    	        long diffHours = day1 / (60 * 60 * 1000);
    	        long diffDays = day1 / (24 * 60 * 60 * 1000);
    	       	Days today = new Days(startingmonth,startingday,startingyear);
	    		for (long i = 0; i < diffDays; i++) {
	    			today = today.next();
	    			String date=String.valueOf(today);
	    			//System.out.println(today);
	    	if(!((name)== null) && action.equalsIgnoreCase("INSERT")){
	       MappingBean mapping = new MappingBean();
	       mapping.setTname(tnme1);
           mapping.setCname(name);
           mapping.setMname(mnme1);
           mapping.setDat(request.getParameter("startdate"));
           mapping.setDa(request.getParameter("enddate"));
           mapping.setExhibitorshare(Float.parseFloat(request.getParameter("exhibitorshare")));
           mapping.setDistributorshare(Float.parseFloat(request.getParameter("distributorshare")));
           mapping.setTermname(request.getParameter("termname"));
           mapping.setTermtype(Integer.parseInt(request.getParameter("termtype")));
           mapping.setAmount(Float.parseFloat(request.getParameter("amount")));
           mapping.setNarration(request.getParameter("narration"));
           mapping.setSlab(Float.parseFloat(request.getParameter("slab")));
           mapping.setShowTax(Float.parseFloat(request.getParameter("stax")));
           mapping.setBatta(Float.parseFloat(request.getParameter("batta")));
           mapping.setOd(Float.parseFloat(request.getParameter("od")));
           mapping.setMc(Float.parseFloat(request.getParameter("mc")));
           mapping.setDaydate(date);
                  try {
                		dao.mapping(mapping);
                		  		
             			} 
             		           
                 
                  catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                redirect = UserRecord;
                System.out.println("Record Added Successfully");
        
	                }
	       }
	        		RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
	     
		}
     
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

}
