<%@include file="header.jsp"%>
						
				<!-- Navigation menu-->
	<!--Display Details-->
	<h1 align="center">Contact Us</h1>
	<div id="display_details">
	 <!--  <div class="sub_details">-->
		<form method="POST" action='./RegisterController' name="frmAddUser" onsubmit="return formValidation()">
		<h2>Register Here, TO Buy Exhibitor Software</h2>
		<input type="hidden" name="action" value="INSERTUSER" />
					<label class="grey" for="signup">FirstName:</label>
					<input class="field" type="text" name="username" id="username" value="" size="23" />	<br>				
					<label class="grey" for="signup">Last Name:</label>
					<input class="field" type="password" name="password" id="password" value="" size="23" /><br>
					<label class="grey" for="email">EmailID:</label>
					<input class="field" type="text" name="emailed" id="email" size="23" /><br>
					<label class="grey" for="signup">Mobile No:</label>
					<input class="field" type="text" name="mobileno" id="mobileno" value="" size="23" /><br>
					<label class="grey" for="email">Address:</label>
					<textarea rows="1" cols="50" name="address" id="address" ></textarea><br>
					<label>Our Marketing Manager will call back you soon.</label><br>
					<input type="submit" name="submit" value="Register" class="bt_register"/>
							</form>
	 </div>
			<!--Navigation Menu ends-->
		<!--Footer begins-->
	<%@include file="footer.jsp"%>