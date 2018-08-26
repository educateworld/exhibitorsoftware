<%@page import="java.sql.*"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%
String center=request.getParameter("center");
System.out.println("theater:"+center);
 String buffer="<select name='tname' onchange='showMoviemapping(this.value);'><option value='-1'>Select Theatre</option>";  
 try{
	  Connection conn=ConnectionProvider.getConnection();
	 Statement stmt = conn.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from theator where centerId='"+center+"' ");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"_"+rs.getString(10)+"_"+rs.getString(11)+"_"+rs.getString(12)+"_"+rs.getString(5)+"_"+rs.getString(10)+"_"+rs.getString(11)+"_"+rs.getString("theatreRent")+"_"+rs.getString("distributorShare")+"_"+rs.getString("mc")+"_"+rs.getString("inr")+"'>"+rs.getString("theatorName")+"</option>";  
  // System.out.println("theater names:"+buffer);
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
 