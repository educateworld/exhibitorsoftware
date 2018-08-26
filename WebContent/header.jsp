<!DOCTYPE html>
<%@include file="Validate.jsp"%>
<html>
<head>
<script type="text/javascript" src="/jquery/jquery.min.js"></script>
<script type="text/javascript" src="jquery.reveal.js"></script>
<script src="./jquery/jquery.min.js"></script>
	<!--Function For Selection Box in drop-page-->
	<script src=".\jquery\select2-3.4.3\select2.js"></script>
    <script>
			$(document).ready(function() { $(".e1").select2(); });
    </script>
	<!--Function  for Pop up-->
	<script src="./jquery/jquery.bpopup.min.js"></script>
  	<!-- style sheets -->
<link href=".\jquery\select2-3.4.3\select2.css" rel="stylesheet"/>
<link href="./css/layout.css" rel="stylesheet" />
<link href="./css/dropdown.css" rel="stylesheet" />
<link href="./css/hom.css" rel="stylesheet" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
	<!-- Sliding effect -->
<script src="js/slide.js" type="text/javascript"></script>
	</head>
<body>
<!-- Panel -->
<div id="toppanel">
	<div id="panel">
		<div class="content clearfix">
			
			<div class="left">
				<!-- Login Form -->
				<form class="clearfix" name="loginForm" action="./LoginController" method="get" onsubmit="return loginValidtaion()">
					<h1>Member Login</h1>
					<label class="grey" for="log">User Name:</label>
					<input class="field" type="text" name="username" id="log" value="" size="23" />
					<label class="grey" for="pwd">Password:</label>
					<input class="field" type="password" name="password" id="pwd" size="23" />
	            	<label><input name="rememberme" id="rememberme" type="checkbox" checked="checked" value="forever" /> &nbsp;Remember me</label>
        			<div class="clear"></div>
					<input type="submit" name="submit" value="Login" class="bt_login" />
					<a class="lost-pwd" href="#">Lost your password?</a>
				</form>
			</div>
			<div class="left right">			
				<!-- Register Form -->
				<form method="POST" action='./RegisterController' name="frmAddUser" onsubmit="return formValidation()">
				<input type="hidden" name="action" value="INSERTUSER" />
					<h1>Sign Up! To buy this software</h1>
					<label class="grey" for="signup">FirstName:</label>
					<input class="field" type="text" name="username" id="username" value="" size="23" />					
					<label class="grey" for="signup">Last Name:</label>
					<input class="field" type="password" name="password" id="password" value="" size="23" />
					<label class="grey" for="email">EmailID:</label>
					<input class="field" type="text" name="emailed" id="email" size="23" />
					<label class="grey" for="signup" >Mobile No:</label>
					<input class="field" type="text" name="mobileno" id="mobileno" onkeypress="return isNumberKey(event)" value="" size="23" />
					<label class="grey" for="email">Address:</label>
					<textarea rows="1" cols="50" name="address" id="address" ></textarea>
					<!-- <input class="field" type="text" name="address" id="address" size="23" />
					 --><label>Our Marketing Manager will call back you soon.</label>
					<input type="submit" name="submit" value="Register" class="bt_register"/>
				</form>
			</div>
		</div>
</div> <!-- /login -->	

	<!-- The tab on top -->	
	<div class="tab">
		<ul class="login">
			<li class="left">&nbsp;</li>
			<li>Hello Guest!</li>
			<li class="sep">|</li>
			<li id="toggle">
				<a id="open" class="open" href="#">Log In | Register</a>
				<a id="close" style="display: none;" class="close" href="#">Close Panel</a>			
			</li>
			<li class="right">&nbsp;</li>
		</ul> 
	</div> <!-- / top -->
	
</div> <!--panel -->

    <div id="container">
			
	</div><!-- / container -->
						<!-- Header-->
	<div id=head>
		<div id=logo>
		<a id="dropside" href="#"><img src="./Images/logo2.png" height="160" width="200"></a>
		</div>
		<div class="dropdownwrap0">
		
		<p>We Design Your Thoughts</p>
		<img src="./Images/download.jpg" height="140" width="150"></div>
		<div id=bar>
		<img src="./Images/bar1.png" height="5" width="1300">
		</div>
		<div id=bar2>
		<img src="./Images/bar1.png" height="4" width="1100">
		</div>
		<div class="space">
			 
		</div>
	</div>
			<!--End of Header-->