<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Theater Reports</title>
</head> 
<%-- <%@include file="adminHeader.jsp"%> --%>
<body bgcolor="./Images/back2.png">
<!--Footer begins-->
	<div id=footer>
		<a href="Distributor.jsp" class="foot" style="text-decoration: none;">Home</a>
		<a href="hom.jsp" class="foot" style="text-decoration: none;">LogOut</a>
	</div>
	<!--Footer ends-->
	<h1>Theater Day To Day Report</h1>
		<table border="1">
			<tr>
			<td><h4>S.NO</h4></td>
			<td><h4>Theater</h4></td>
			<td><h4>Movie</h4></td>
			<td><h4>Date</h4></td>
			<td><h4>MOR SHOW</h4></td>
			<td><h4>MAT SHOW</h4></td>
			<td><h4>FIRST SHOW</h4></td>
			<td><h4>SECOND SHOW</h4></td>
			<td><h4>SPECIALL SHOW</h4></td>
			<td><h4>Total Audience</h4></td>
			<td><h4>Total Deductions</h4></td>
			<td><h4>Total Collection</h4></td>
			<td><h4>Profit/Loss</h4></td>
		</tr>
		<%
 Class.forName("com.mysql.jdbc.Driver").newInstance();  
 Connection c1 = ConnectionProvider.getConnection(); 
 String bb=request.getParameter("bb");
 String[] ss = bb.split(",");
/* String bb1=request.getParameter("bb1");
String bb2=request.getParameter("bb2");
System.out.println("bb value:"+bb);
 */ PreparedStatement pstmt;
 ResultSet rs;
 pstmt = c1.prepareStatement("Select * from collection  WHERE da BETWEEN ? AND ? && tname=?"); 
pstmt.setString(1,ss[0]);   
pstmt.setString(2,ss[1]);
pstmt.setString(3,ss[2]);
System.out.println(pstmt); 
rs = pstmt.executeQuery(); 
  while(rs.next()){
     %>
			<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString("mname")%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString("collectionmorning")%></td>
			<td><%=rs.getString(20)%></td>
			<td><%=rs.getString(21)%></td>
			<td><%=rs.getString(22)%></td>
			<td><%=rs.getString(24)%></td>
			<td><%=rs.getString("totalaudiance")%></td>
			<% double totaldeductions=rs.getFloat("totaldistributorshare")
						+rs.getFloat("totalexhibitorshare")
						+rs.getFloat("slab")
						+rs.getFloat("showTax")
						+rs.getFloat("batta")
						+rs.getFloat("od")
						+rs.getFloat("mc")
						+rs.getFloat("termtype");
				 %>
			<td><%=totaldeductions%></td>
			<td><%=rs.getString("totalgross")%></td>

			<% double totalnet=rs.getFloat("totalgross")
						-rs.getFloat("totaldistributorshare")
						-rs.getFloat("totalexhibitorshare")
						-rs.getFloat("slab")
						-rs.getFloat("showTax")
						-rs.getFloat("batta")
						-rs.getFloat("od")
						-rs.getFloat("mc")
						-rs.getFloat("termtype");
				 %>
			<td><%=totalnet%></td>
		</tr>


			<%
 }
     %>
		</table>
		
</body>
</html>