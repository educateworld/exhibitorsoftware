<%@include file="adminHeader.jsp"%>
<body>
	<div id="container"></div>
	<!-- / container -->
	<!-- Header-->
	<div id=head>
		<div id=logo>
			<a id="dropside" href="#"><img src="./Images/logo2.png"
				height="160" width="200"></a>
		</div>
		<div class="dropdownwrap0">
			<p>Welcome To Exhibitor Web site</p>
			<img src="./Images/download.jpg" height="140" width="150">
		</div>
		<div id=bar>
			<img src="./Images/bar1.png" height="5" width="1300">
		</div>
		<div id=bar2>
			<img src="./Images/bar1.png" height="4" width="1100">
			<h1>Welcome to Theater Manager Screen</h1>
		</div>
		<div class="space"></div>
	</div>
	<!--End of Header-->
<!--Drop-down page, display:none-->
	<!-- Add Module Starts Here -->
						<!--collection_daily details   -->
				<%@include file="CollectionDailyEntryForm.jsp"%>
		<!-- collection daily entry form close -->
					<%@include file="addingDetails.jsp"%>
		<!-- Navigation menu-->
		<div class=buttons>
			<a id="dropdown" href="#"><img src="./Images/add_button1.jpg"
				height="100" width="150"></a>
		</div>
		<div class=buttons>
			<a id="dropdown2" href="#"><img src="./Images/daily entry.jpg"
				height="100" width="150"></a>
		</div>
		<!--Navigation Menu ends-->
		<!--Footer begins-->
		<div id=footer>
			<a href="TheaterManager.jsp" class="foot"
				style="text-decoration: none;">Home</a> <a href="hom.jsp"
				class="foot" style="text-decoration: none;">LogOut</a>
		</div>
		<!--Footer ends-->
</body>
</html>