<!DOCTYPE html>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.bvr.bean.*"%>
<%@page import="com.bvr.dao.*"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
	session.getAttribute("username");
	if (!(session.getAttribute("username") != null)) {
		response.sendRedirect("hom.jsp");
	}
%>
<html>
<head>
<script type="text/javascript" src="/jquery/jquery.min.js"></script>
<script type="text/javascript" src="jquery.reveal.js"></script>
<link href="./css/layout.css" rel="stylesheet" />
<link href="./css/dropdown.css" rel="stylesheet" />
<link href="./css/allinone.css" rel="stylesheet" />
<link href="jquery/select2-3.4.3/select2.css" rel="stylesheet" />
<script src="jquery/select2-3.4.3/select2.js"></script>
<script src="./jquery/jquery.min.js"></script>
<!--collections Script close  -->
<meta name="description"
	content="Demo of a Sliding Login Panel using jQuery 1.3.2" />
<meta name="keywords"
	content="jquery, sliding, toggle, slideUp, slideDown, login, login form, register" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<!-- stylesheets -->
<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/slide.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/Header.css" type="text/css"
	media="screen" />
<!-- Sliding effect -->
<script src="js/slide.js" type="text/javascript"></script>
<%@include file="Validate.jsp"%>
<%
Connection con = ConnectionProvider.getConnection();
Statement st = con.createStatement();
%>

</head>
