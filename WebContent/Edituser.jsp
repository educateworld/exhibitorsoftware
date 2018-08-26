<!DOCTYPE html>
<%@page import="com.bvr.dao.UpdateUserDAO"%>
<%@page import="com.bvr.bean.RegisterBean"%>
<%@page import="com.bvr.dao.UpdateTermDAO"%>
<%@page import="com.bvr.bean.TermBean"%>
<html>
<head>
<script type="text/javascript" src="/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="jquery.reveal.js"></script>

<style>
html,body{
	width:100%;
	padding:0;
	margin:0;
}
		/*Header Style-sheet*/
		
		
				/*Logo Style-sheet*/
				
	#logo{
			margin:0px 0px 40px 0px;
			width:25px;
			line-height:12px;
			text-shadow: 0px 2px 0px rgba(0, 0, 0, 0.3);
			font-size: 22px;
			height: 150px;
			width: 250px;
			overflow: hidden;
			display: block;
			text-align: center;
			line-height: 70px;
  		}
		
		
		/*design bar under logo*/
		
		
	#bar{
		  margin:-30px 20px 20px;
		  }
	#bar2{
		  margin:-35px 20px 20px;
		  }
	#bar3{
		  margin:-20px 20px 20px;
		  }	
		  
		  
		  /*this area contains empty white space*/
		  
	div.space{
			margin:150px;
			display:block;
			}
			
	#head{
		height:325px;
		position:relative;
		margin:10px;
		}
		/*Sliding Window Besides Logo Styling Sheet*/
		
	.dropdownwrap0{
			width:650px;
			position:absolute;
			
			margin:-198px 252px 20px;
			text-align:center;
			font-family: 'Patrick Hand SC', cursive;
			font-size:36px;
			color:#ffffff;;
			border:2px solid #000000;
			height:150px;
			background-image:url('./Images/footer2.png');
			background-repeat:x-x;
			background-attachment:fixed;
			background-position:center;
			display:block;
			overflow:hidden;
			-webkit-border-radius: 15px;
			line-height:1px;
			}


	.container p{
			font-family: 'Open Sans', sans-serif;
			font-size:10pt;
			color:#B7B7B7;
			text-align:center;
			padding-bottom:50px;
		}

	.container a,
	.container a:visited{
		padding:8px 14px;
		font-size:12pt;
		border:1px solid #CCCCCC;
		background-color:#DDDDDD;
		text-decoration:none;
		text-transform:uppercase;
		color:#424242;
		border-radius:3px;
	}

	.container a:hover{
		padding:8px 14px;
		font-size:12pt;
		border:1px solid #F2F2F2;
		background-color:white;
		color:#CCCCCC;
	}
	
	
	/*End of Header*/
	
			/*Body Starts*/
				/*Drop-down Page Style-sheet. */
				
	#content1{
			height:10px;
			margin:0px;
			}
	body{
			background-image:url('./Images/back2.jpg');
			background-repeat:none;
			background-attachment:fixed;
			background-position:center;
			}
	.dropdownwrap{
			height:370px;
			width:1390px;
			float:left;
			margin: -152px 30px 0px 3px;
			background-color:#434343;
			line-height:50px;
			padding:0px 02px;
			position:relative;
			display:none;
			border:2px solid #000000;
	
	
			}
			.dropdownwrap1{
			height:370px;
			width:1390px;
			float:left;
			margin: -152px 30px 0px 3px;
			background-color:#434343;
			line-height:50px;
			padding:0px 02px;
			position:relative;
			display:none;
			border:2px solid #000000;
	
	
			}
			.dropdownwrap2{
			height:370px;
			width:1390px;
			float:left;
			margin: -152px 30px 0px 3px;
			background-color:#434343;
			line-height:50px;
			padding:0px 02px;
			position:relative;
			display:none;
			border:2px solid #000000;
	
	
			}
			.dropdownwrap3{
			height:370px;
			width:1390px;
			float:left;
			margin: -152px 30px 0px 3px;
			background-color:#434343;
			line-height:50px;
			padding:0px 02px;
			position:relative;
			display:none;
			border:2px solid #000000;
	
	
			}

	.container{
			width:100%;
			float:left;
			}

	.container h2{
			width:100%;
			float:left;
			padding:40px 0px;
			margin:0;
			text-align:center;
			font-family: 'Patrick Hand SC', cursive;
			font-size:36px;
			color:#434343;
			}
		/*Dropdown-Menu Stylesheet Ends */
		
		
		
		
	
	
		/*Navigation Menu Style-sheet*/

	div.buttons{
						
		position:relative;						
		text-shadow: 0px 2px 0px rgba(0, 0, 0, 0.3);
		font-size: 22px;
		height: 99.2px;
		width: 145px;
		margin: 0px -0px 0px 40px;
		overflow: hidden;
		text-align: center;
		line-height: 18px;
		float:left;
		padding:0px px px 0px;
		display:none;
				}
				
				/*Hover Effect in Menu*/
				
	div.buttons:hover{
		margin-top: -15px;
 
  
		  /*Rounded Corners*/
		-webkit-border-radius: 50px;
		-moz-border-radius: 4px;
		border-radius: 2px;
		 
		/*Shadow*/
		-webkit-box-shadow: 0px 6px 0px rgba(0, 0, 0, 0.8);
		-moz-box-shadow: 0px 6px 0px rgba(0, 0, 0, 0.8);
		box-shadow: 0px 6px 0px rgba(0, 0, 0, 0.8);
		 
		/*Gradient*/
		background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.2));
		background-image: -moz-linear-gradient(top, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.2));
		background-image: -o-linear-gradient(top, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.2));
		background-image: -ms-linear-gradient(top, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.2));
		background-image: linear-gradient(top, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.2));
		  
		   
		 /*Shadow*/
		  -webkit-box-shadow: 0px 4px 0px rgba(0, 0, 0, 0.8);
		  -moz-box-shadow: 0px 4px 0px rgba(0, 0, 0, 0.8);
		  box-shadow: 20px 20px 10px rgba(0, 0, 0, 0.8);
		   
		 /*Gradient*/
		  background-image: -webkit-linear-gradient(bottom, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.4));
		  background-image: -moz-linear-gradient(bottom, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.4));
		  background-image: -o-linear-gradient(bottom, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.4));
		  background-image: -ms-linear-gradient(bottom, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.4));
		  background-image: linear-gradient(bottom, rgba(0, 0, 0, 0), rgba(0, 0, 0, 0.4));
		}
							
		}
		
		
		
		/*Buttons ("+") Style-sheet*/
		
		
	button{
			margin:27px -25px;
			width:50px;
			height:25px;
			
			}
	#buttons_add{
			margin:-330px 270px;
			line-height:55px;
			width:1px;
			position:absolute;
			;
			padding:0 0 0 0;
			
			
			}
		
		/*End oF Body*/
			
	
		/*footer Style-Sheet*/
		
	#footer{
			
			 margin:-210px 920px;
			 height:5px;
			 line-height:5px;
			 width:300px;
			 }
			
	.foot{
			color:#ffffff;
			margin:0px 4px;
			font-size:18px;
			background-image:url('./Images/footer.png');
			background-repeat:x-x;
			background-attachment:fixed;
			background-position:center;
			-webkit-border-radius: 6px;
			border:1px solid #000000;
			}
		
		/* Style-sheet for the popup window*/
	.stylemyModal{ 
		
    background-color:#fff;
    border-radius:15px;
    color:#000;
    display:none; 
    padding:20px;
    min-width:300px;
    min-height: 50px;
	
}
.b-close{
    cursor:pointer;
    position:absolute;
    right:10px;
    top:5px;
}
 /* style-sheet for the content to be displayed below the sliding window. The content has been set to hidden till its complete*/
 #display_details{
 
	background-image:url('./Images/display_sample2.jpg');
			background-repeat:X-x;
			background-attachment:fixed;
			background-position:center;
  border:2px solid #000000;
  margin:10px 300px;
  width:950px;
  line-height:30px;
  height:400px;
  float:left;
  
	
  
  }
  
  .sub_details{
   border:2px solid #000000;
   height:350px;
   width:260px;
   float:left;
   padding:10px 10px 10px 10px;
   margin:10px 15px;
   
   }
   #collect{
   display:none;
   }
   
		/*End oF Style-Sheet*/
			
	</style>
	<script src="./jquery/jquery.min.js"></script>
	<script>
	//Function For Drop-down Content //
	
	$(document).ready(function(e){
		   $('#dropdown').on('click',function(){
			  $('.dropdownwrap0').animate({width: 'toggle'},("slow"))
			  $('.dropdownwrap').slideToggle("slow");
			
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap2').css('display','none');
			  $('.dropdownwrap3').css('display','none');
		   });
		    $('#dropdown1').on('click',function(){
			  $('.dropdownwrap0').animate({width: 'toggle'},("slow"))
			  $('.dropdownwrap1').slideToggle("slow");
			 
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap2').css('display','none');
			  $('.dropdownwrap3').css('display','none');

		   });
		   $('#dropdown2').on('click',function(){
			  $('.dropdownwrap0').animate({width: 'toggle'},("slow"))
			  $('.dropdownwrap2').slideToggle("slow");
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap3').css('display','none');

			  });  
			 $('#dropdown3').on('click',function(){
			  $('.dropdownwrap0').animate({width: 'toggle'},("slow"))
			  $('.dropdownwrap3').slideToggle("slow");
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap3').css('display','none');

			}); 


		})
		
		//Function FOr Hover Function to display content//
		
	$(document).ready(function(e){
		   $('#dropside').on('mouseover',function(){

			  $('.dropdownwrap0').animate({width: 'toggle'},("slow"));

		   });
   
		})
	</script>
	<!--Function For Selection Box in drop-page-->
	<link href=".\jquery\select2-3.4.3\select2.css" rel="stylesheet"/>
    <script src=".\jquery\select2-3.4.3\select2.js"></script>
    <script>
			$(document).ready(function() { $(".e1").select2(); });
    </script>
	
	<!--Function  for Popup-->
	<script src="./jquery/jquery.bpopup.min.js"></script>
	<script>
  // Semicolon (;) to ensure closing of earlier scripting
    // Encapsulation
    // $ is assigned to jQuery
    ;(function($) {

         // DOM Ready
        $(function() {

            // Binding a click event
            // From jQuery v.1.7.0 use .on() instead of .bind()
			$('#my-button').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal').bPopup();

            });
            $('#my-button0').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal0').bPopup();

            });
			$('#my-button1').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal4').bPopup();

            });
			$('#my-button2').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal1').bPopup();

            });
			$('#my-button3').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal2').bPopup();

            });
			$('#my-button4').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal3').bPopup();

            });
            

        });

    })(jQuery);
	 </script>
  	<meta name="description" content="Demo of a Sliding Login Panel using jQuery 1.3.2" />
  	<meta name="keywords" content="jquery, sliding, toggle, slideUp, slideDown, login, login form, register" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />	

	<!-- stylesheets -->
  	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
  	<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
	
  	<!-- PNG FIX for IE6 -->
	<!--[if lte IE 6]>
		<script type="text/javascript" src="js/pngfix/supersleight-min.js"></script>
	<![endif]-->
	 

	<!-- Sliding effect -->
	<script src="js/slide.js" type="text/javascript"></script>
	
	</head>
<body>

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
			<!--Drop-down page, display:none-->
	<div id=content1>
	<form action="#" method="get()">
		<div class="dropdownwrap">
			<select class="e1" name="State">

			<option>Select State</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			
			<select class="e1" name="district">
			<option>Select District</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			<select class="e1" name="city">
			<option>Select City</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			<select class="e1" name="center">
			<option>Select Center</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			<select class="e1" name="theater">
			<option>Select Theater</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			<select class="e1" name="movie_name">
			<option>Select Movie</option>
			<option>abcd</option>
			<option>acbd</option>
			<option>adcb</option>
			<option>adbc</option>
			</select><br>
			<input type="submit" value="submit">
			<input type="reset" value="reset">
			</form>
			<!-- Buttons class for adding new elements-->
			<class id=buttons_add>
			 <button id="my-button">+</button>
			 <button id="my-button0">+</button>
			 <button id="my-button1">+</button>
			 <button id="my-button2">+</button>
			 <button id="my-button3">+</button>
			 <button id="my-button4">+</button>
			 
	 
	</class>
			</div>
			<div class="dropdownwrap1">
		
		<p>We Design Your Thoughts</p>
			</div>
			<div class="dropdownwrap2">
		
		<p>We Design Your Thoughts</p>
			</div>
			<div class="dropdownwrap3">
		
		<p>We Design Your Thoughts</p>
			</div>
			<div id="collect">
			<div id="myModal" class="stylemyModal">
			<h1>Add New State</h1>
			<form action="#" method="get()">
				Enter New State: <input type="text" name="up_state"><br>
				<input type="submit" value="submit">
				</form>
				
			<a class="close-reveal-modal"></a>
		</div>
				<div id="myModal0" class="stylemyModal">
			<h1>Add New District</h1>
			<form action="#" method="get()">
				Enter New District: <input type="text" name="up_district"><br>
				<input type="submit" value="submit">
				</form>
				
			<a class="close-reveal-modal"></a>
		</div>
		<div id="myModal1" class="stylemyModal">
		<h1>Add New Center</h1>
			<form action="#" method="get()">
				Enter New Center: <input type="text" name="up_center"><br>
				<input type="submit" value="submit">
				</form>
				<a class="close-reveal-modal"></a>
		</div>
		<div id="myModal2" class="stylemyModal">
		<h1>Add New Theater</h1>
			<form action="#" method="get()">
				Enter New Theater: <input type="text" name="up_theater"><br>
				<input type="submit" value="submit">
				</form>
				<a class="close-reveal-modal"></a>
		</div>
		<div id="myModal3" class="stylemyModal">
		<h1>Add New Movie</h1>
			<form action="#" method="get()">
				Enter New Movie: <input type="text" name="up_movie"><br>
				<input type="submit" value="submit">
				</form>
				<a class="close-reveal-modal"></a>
		</div>
		<div id="myModal4"class="stylemyModal">
		<h1>Add New City</h1>
			<form action="#" method="get()">
				Enter New City: <input type="text" name="up_city"><br>
				<input type="submit" value="submit">
				</form>
				<a class="close-reveal-modal"></a>
		</div>
		
		
	</div>
			
			<!-- Navigation menu-->
<div class=buttons><a id="dropdown" href="#" ><img src="./Images/add_button1.jpg" height="100" width="150"></a></a></div>
<div class=buttons><a id="dropdown1" href="#" ><img src="./Images/collection_button.png" height="100" width="150"></a></a></div>
<div class=buttons><a id="dropdown2" href="#"><img src="./Images/report_button1.jpg" height="100" width="150"></a></a></div>
<div class=buttons><a id="dropdown3" href="#"><img src="./Images/button1.jpg" height="100" width="150"></a></a></div>


	</div>
	</div>
	<!--Display Details-->
	<div id="display_details">
	
	
	

<%
RegisterBean state = new RegisterBean();
%>
<%
UpdateUserDAO dao = new UpdateUserDAO();
%>
<form method="POST" action='UpdateUserHandler' name="editUser">
<input type="hidden" name="action" value="updateUser" /> <%
String uid = request.getParameter("userId");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
state = dao.getStateByUserId(id);
%>
<table align="center">
<h3 align="center">Registered Users</h3>
<tr>
<td>UserId</td>
<td><input type="text" name="userid" readonly="readonly"
value="<%=state.getUserId()%>"></td>
</tr>
<tr>
<td>Random</td>
<td><input type="text" name="random" readonly="readonly" value="<%=state.getRandom()%>"/></td>
</tr>
<tr>
<td>username</td>
<td><input type="text" name="username"  value="<%=state.getUserName()%>"/></td>
</tr>
<tr>
<tr>
<td>password</td>
<td><input type="text" name="password" value="<%=state.getPassword()%>"/></td>
</tr>
<td></td>
<tr>
<td>Emailid</td>
<td><input type="text" name="emailed"  value="<%=state.getEmailId()%>"/></td>
</tr>
<tr>
<td>mobileno</td>
<td><input type="text" name="mobileno"  value="<%=state.getMobileNo()%>"/></td>
</tr>
<tr>
<td>address</td>
<td><input type="text" name="address" value="<%=state.getAddress()%>"/></td>
</tr>
<tr>
<td>status</td>
<td><input type="text" name="status" readonly="readonly" value="<%=state.getStatus()%>"/></td>
</tr>
<td><input type="submit" value="Update" /></td>
<td><a href="allinone.jsp"><input type="button" value="cancel"></a></td>

</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
	 </div>
	
	
			<!--Navigation Menu ends-->
			<!--Footer begins-->
<div id=footer>
	
		<a href="Home.jsp" class="foot" style="text-decoration:none;">Home</a>
		<a href="Aboutus.jsp" class="foot" style="text-decoration:none;">About Us</a>
		<a href="Contactus.jsp" class="foot" style="text-decoration:none;">Contact Us</a>
	</ul>
</div>
		<!--Footer ends-->

</body>
</html>