<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String totGross="";
String totNet="";
String totShows="";
String totAudience="";
String totExhibitorShare="";
String totDistributorShare="";
String dat="";
String da="";
String collectionId="";
//String date="";
String c="";
String movie=request.getParameter("movie");  
String date=request.getParameter("date");
System.out.println(date);
String buffer="<select name='tname' onchange='showCenter(this.value);'><option value='-1'>Select Theatre</option>";  
 try{
 //Class.forName("com.mysql.jdbc.Driver").newInstance();  
 Connection con = ConnectionProvider.getConnection();
 Statement stmt = con.createStatement(); 
 ResultSet rs = stmt.executeQuery("Select * from collection where mname='"+movie+"'AND da='"+date+"' ");  
 
//ResultSet rs = stmt.executeQuery("Select * from collection where mname='"+movie+"' AND da=""; ");  
 while(rs.next()){
	 collectionId=rs.getString(1);
	   totGross=rs.getString(9);
	   totNet=rs.getString(11);
	   totShows=rs.getString(13);
	   totAudience=rs.getString(7);
	   totExhibitorShare=rs.getString(15);
	   totDistributorShare=rs.getString(17);
	   da=rs.getString("startingdate");
	   dat=rs.getString("endingdate");
   buffer=buffer+"<option value='"+rs.getString("collectionId")+"_"+rs.getString("tname")+"_"+rs.getString("mname")+"_"+rs.getString("slab")+"_"+rs.getString("showTax")+"_"+rs.getString("batta")+"_"+rs.getString("exhibitorShare")+"_"+rs.getString("distributorShare")+"_"+rs.getString("od")+"_"+totGross+"_"+totNet+"_"+totShows+"_"+totAudience+"_"+totExhibitorShare+"_"+totDistributorShare+"_"+da+"_"+dat+"_"+rs.getString("mc")+"'>"+rs.getString("tname")+"</option>";
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
 