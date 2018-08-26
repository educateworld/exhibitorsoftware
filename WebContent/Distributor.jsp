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
			<h1>Welcome to Distributor Screen</h1>
		</div>
		<!-- <div class="space"></div> -->
	</div>
	<!--End of Header-->

+	
	<!--Drop-down page, display:none-->
	
		<!-- Collection movie mapping module -->
		<div class="dropdownwrap1">
			<div id="collection_mapping">
				<h3>Movie Mapping Form</h3>
				<form method="post" action='./MappingHandler' name="mapping"
					onsubmit="return map()">
					<input type="hidden" name="action" value="INSERT" />

					<div class="display1">
						<div class="block">
						State Name:<select name="stateId" id="stateName1" class="input1"
							onchange="mapshowDistrict(this.value)">
							<option>--Select state--</option>
							<%
								ResultSet mapstaters = st.executeQuery("select * from state");
								while (mapstaters.next()) {
							%>
							<option value="<%=mapstaters.getString("stateId")%>">
								<%=mapstaters.getString("stateName")%></option>
							<%
								}
							%>
						</select><br> District Name:<select name="tdistrictId"
							id="maptdistrictName" class="input1"
							onchange="mapshowCenter(this.value)">
							<option>--SelectDistrict--</option>
							<%-- <% //Statement s1 = con.createStatement(); String sdist = "select * from district"; ResultSet sdistrs = st.executeQuery(sdist); %> <% while (sdistrs.next()) { %> <option value="<%=sdistrs.getString("districtId")%>"><%=sdistrs.getString("districtName")%></option> <% } %> --%>
						</select><br>
						<p>
							Center Name:<select name="centerId" id="mapcenterName1"
								class="input5" onchange="showTheatormapping(this.value)">
								<option>--Select Center--</option>
								<%-- <% //Connection conn23 = ConnectionProvider.getConnection(); Statement st23 = con.createStatement(); String query23 = "select * from center"; ResultSet rs23 = st23.executeQuery(query23); %> <% while (rs23.next()) { %> <option value="<%=rs23.getString("centerId")%>"><%=rs23.getString("centerName")%></option> <% } %> --%>
							</select>
						</p>
						<p>
							SelectTheater: <select class="input1" name='tname'
								onchange="showMoviemapping(this.value);" id='theatormapping'>

								<!-- SelectTheatre: <select class="input1" name='tname'
									 id='theatormapping'>
								 -->
								<option value='-1'>Select Theatre</option>
							</select>
						</p>
						<p>
							SelectMovie: <select class="input1" name='mname' id="mname9"
								id='moviemapping'>
								<option value='-1'>Select Movie</option>
								<%
									ResultSet moviers1 = st.executeQuery("Select * from movie");
									while (moviers1.next()) {
								%>

								<option
									value="<%=moviers1.getString(2)%>_<%=moviers1.getString(1)%>"><%=moviers1.getString(2)%></option>

								<%
									}
								%>
							</select>
						</p>

						<p>
							TheatreRent: <input type="text" class="input"
								id="exhibitorshare1" name="exhibitorshare">
						</p>

						<p>
							DistributorShare: <input type="text" class="input"
								id="distributorshare1" name="distributorshare">
						</p>
					</div>
					<div class="block">
						<p>
							From:<input type="text" name="startdate" id="datestart" onblur=""
								class="input1">
						</p>
						<p>
							To:<input type="text" name="enddate" id="dateend" onblur=""
								class="input1" />
						</p>
						<p>
						<p>
							Term Type <select class="input1" name='termname' id="classnId"
								onchange="assingText()">
								<option value='select'>Select Term</option>
								<%
									String query2333 = "select * from term";
									ResultSet o = st.executeQuery(query2333);
									while (o.next()) {
								%>

								<option value="<%=o.getString("termname")%>"><%=o.getString("termname")%></option>
								<%
									}
								%>
</select>
						<p>
						<p>

							<label id="rollNoId" style="width: 100px;"></label>:

							<!-- <input  name="rollno" id="rollNoId" readonly="readonly" style="background-color:#808080; color: #000000; font-size: 15px; font-family:Calibri (Body);text-align:left; width: 100px; ">
						 -->
							<input type="text" name="termtype" id="termtype1" value="0"
								style="width: 60px; margin: 0 8%;">
						</p>
						<p>
							Amount:<input type="text" class="input1" name="amount"
								id="amount1" value="0">
						</p>
						<p>
							Narration:
							<textarea value="ramu" class="inpu" name="narration"
								id="narration1"
								style="width: 150px; height: 50px; margin: 0 15px;"
								class="input1"></textarea>
						</p>
					</div>
			</div>
			<div id="block3" class="block">
				<p>
					Rent/SqFt :<input type="text" class="input" name="slab" id="slab1">
				<p>
					ShowTax:<input type="text" class="input" id="stax1" name="stax">
				<p>
					Batta(Bonus):<input type="text" class="input" id="batta1"
						name="batta">
				<p>
					OtherDeductions:<input type="text" id="deduct" class="input"
						name="od" value="0">
				<p>
					Fixed Labor Cost:<input type="text" class="input" id="mc1"
						name="mc">
			</div>

			<div id="bottom">
				<input type="submit" value="SAVE"><input type="reset"
					value="RESET"><input type="button" value="DELETE">
			</div>
			</form>
		</div>
	</div>
<!-- Admin Module to do Modifications Starts --> 
	<div class="dropdownwrap3">
		<h2>Admin Module(To do Modifications)</h2>
		<div id="left">
			<div class="admin_left" id="select_state">State</div>
			<div class="admin_left" id="select_district">District</div>
			<div class="admin_left" id="select_center">Center</div>
			<div class="admin_left" id="select_theater">Theater</div>
		</div>
		<div id="right">
			<div class="admin_right" id="select_movie">Movie</div>
			<div class="admin_right" id="select_term">Term</div>
			<!--<div class="admin_right" id="select_distributor">Distributor</div> -->
			<div class="admin_right" id="select_registered">Registered</div>
			<div class="admin_right" id="select_collection">Collection</div>
		</div>
		<div class="admin_drop" id="state5">
			<form name="myForm" method="POST" action='./ViewStateHandler'>
				<input type="hidden" name="action" value="ListState" />

				<%
					ViewStateDAO dao = new ViewStateDAO();
					List<StateBean> stateList = dao.getAllStates();
				%>
				<h1 align="center">State Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>State name</th>
					</tr>
					<tr>
						<%
							for (StateBean state : stateList) {
						%>
						<td width=20%><%=state.getStateName()%></td>

						<td><a
							href="DeleteStateHandler?action=deleteState&stateName=<%=state.getStateName()%>">Delete</a></td>
						<td><a
							href="EditState.jsp?action=updateState&stateId=<%=state.getStateId()%>">Update</a></td>
					</tr>

					<%
						}
						//}
					%>
				</table>

			</form>
		</div>
		<div class="admin_drop" id="district5">
			<form id="select_district" name="myForm" method="POST"
				action='./ViewDistrictHandler'>
				<input type="hidden" name="action" value="ListDistrict" />
				<%
					ViewDistrictDAO dao1 = new ViewDistrictDAO();
					List<DistrictBean> districtList = dao1.getAllDistrict();
				%>
				<h1 align="center">District Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>

						<th>District name</th>
					</tr>
					<tr>

						<%
							for (DistrictBean district : districtList) {
						%>
						<td><%=district.getDistrictName()%></td>
						<td><a
							href="DeleteDistrictHandler?action=deleteDistrict&stateId=<%=district.getStateId()%>">Delete</a></td>
						<td><a
							href="EditDistrict.jsp?action=updateDistrict&districtId=<%=district.getDistrictId()%>">Update</a></td>
					</tr><%
						}
						//}
					%>
				</table>

			</form>
		</div>
		<div class="admin_drop" id="center">
			<form name="myForm" method="POST" action='./ViewCenterHandler'>
				<input type="hidden" name="action" value="listCenter" />
				<%
					ViewCenterDAO dao3 = new ViewCenterDAO();
					List<CenterBean> centerList = dao3.getAllCenters();
				%>
				<h1 align="center">center Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>

						<th>Center name</th>
					</tr>
					<tr>
						<%
							for (CenterBean center : centerList) {
						%>
						<td><%=center.getCenterName()%></td>
						<td><a
							href="DeleteCenterHandler?action=deleteCenter&districtId=<%=center.getDistrictId()%>">Delete</a></td>
						<td><a
							href="EditCenter.jsp?action=updateCenter&centerId=<%=center.getCenterId()%>">Update</a></td>
					</tr>
					<%
						}
					%>
				</table>

			</form>
		</div>
		<div class="admin_drop" id="theater">
			<form name="myForm" method="POST" action='./ViewTheatorHandler'>
				<input type="hidden" name="action" value="ListCenter" />
				<%
					ViewTheatorDAO dao4 = new ViewTheatorDAO();
					List<TheatorBean> theatorList = dao4.getAllTheators();
				%>
				<h1 align="center">Theator Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>TheatorName</th>
						<th>HousefulCapacity</th>
						<th>Theatre Description</th>
						<th>OwnerName</th>
						<th>OwnerContact</th>
						<th>TheatreRent</th>
						<th>DistributorShare</th>
						<th>Slab</th>
						<th>ShowTax</th>
						<th>Batta</th>
						<th>Inr</th>
						<th>mc</th>
					</tr>
					<tr>
						<%
							for (TheatorBean theator : theatorList) {
						%>
						<td><%=theator.getTheatorName()%></td>
						<td><%=theator.getHousefulCapacity()%></td>
						<td><%=theator.getTheatreDescription()%></td>
						<td><%=theator.getOwnerName()%></td>
						<td><%=theator.getContactNumber()%></td>
						<td><%=theator.getTheatreRent()%></td>
						<td><%=theator.getDistributorShare()%></td>
						<td><%=theator.getSlab()%></td>
						<td><%=theator.getShowTax()%></td>
						<td><%=theator.getBatta()%></td>
						<td><%=theator.getInr()%></td>
						<td><%=theator.getMc()%></td>

						<td><a
							href="DeleteTheatorHandler?action=deleteTheator&centerId=<%=theator.getCenterName()%>">Delete</a></td>
						<td><a
							href="EditTheator.jsp?action=updateTheator&theatorId=<%=theator.getTheatorId()%>">Update</a></td>
					</tr>
					<%
						}
						//}
					%>
				</table>
			</form>
		</div>

		<div class="admin_drop" id="movie">
			<form name="select_movie" method="POST" action='./ViewMovieHandler'>
				<input type="hidden" name="action" value="ListMovies" />
				<%
					ViewAllMovieDao dao5 = new ViewAllMovieDao();
					List<MoviesBean> userList = dao5.viewAllMovies();
				%>
				<h2 align="center">Movie Details</h2>
				<table border="1" align="center" width="90%" cellspacing="0" cellpadding="0">
					<tr>
						<th>Movie Name</th>
					</tr>
					<tr>
						<%
								for (MoviesBean user : userList) {
						%>
						<td><%=user.getMovieName()%></td>

						<td><a
							href="EditAllMovie.jsp?action=editform&movieId=<%=user.getMovieId()%>">Update</a></td>
						<td><a
							href="DeleteMovieController?action=deleteMovie&movieId=<%=user.getMovieId()%>">Delete</a></td>

					</tr>
					<%
						}
						//}
					%>
				</table>
			</form>
		</div>
		<div class="admin_drop" id="term">
			<form name="myForm" method="POST" action='./ViewAllTermController'>
				<input type="hidden" name="action" value="ViewAllTerm" />
				<%
					//UserBean user = new UserBean();
					ViewAllTermDao dao6 = new ViewAllTermDao();
					List<TermBean> userLis2 = dao6.viewAllTerm();
					//Iterator<UserBean> itr = userList.iterator();
				%>
				<h1 align="center">Term Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>TermId</th>
						<th>Percentage</th>
						<th>Margin Profit</th>
						<th>Advance</th>
					</tr>
					<tr>
						<%
							/*while(itr.hasNext())
							{
							System.out.println(user.getId());*/
							for (TermBean user : userLis2) {
						%>
						<td><%=user.getTermId()%></td>
						<td><%=user.getPercentage()%></td>
						<td><%=user.getMarginProfit()%></td>
						<td><%=user.getAdvance()%></td>
						<td><a href="EditTerm.jsp?action=editform&termId=<%=user.getTermId()%>">Update</a></td>
						<td><a href="DeleteTermController?action=deleteTerm&termId=<%=user.getTermId()%>">Delete</a></td>

					</tr>
					<%
						}
					%>
				</table>
			</form>
		</div>


		<div class="admin_drop" id="distributor">
			<form name="myForm" method="POST" action='./ViewDistributorHandler'>
				<input type="hidden" name="action" value="viewDistributor" />
				<%
					ViewDistributorDAO dao7 = new ViewDistributorDAO();
					List<DistributorBean> DistributorList = dao7.getAllDistributors();
				%>
				<h1 align="center">Distributor Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>Distributor Name</th>
						<th>Distributor MobileNumber</th>
						<th>Distributor Address</th>
					</tr>
					<tr>
						<%
							for (DistributorBean distributor : DistributorList) {
						%>
						<td><%=distributor.getDistributorName()%></td>
						<td><%=distributor.getMobileNumber()%></td>
						<td><%=distributor.getAddress()%></td>

						<td><a
							href="editDistributor.jsp?action=editform&distributorId=<%=distributor.getDistributorId()%>">Update</a></td>
						<td><a
							href="DeleteDistributorHandler?action=deleteDistributor&distributorId=<%=distributor.getDistributorId()%>">Delete</a></td>

					</tr>
					<%
						}
						//}
					%>
				</table>
			</form>
		</div>
		<div class="admin_drop" id="registered">
			<form name="myForm" method="POST" action='./ViewAllUsersController'>
				<input type="hidden" name="action" value="ViewAllUsers" />
				<%
					//UserBean user = new UserBean();
					ViewAllUsersDao dao8 = new ViewAllUsersDao();
					List<RegisterBean> userList2 = dao8.viewAllusers();
					//Iterator<UserBean> itr = userList.iterator();
				%>
				<h1 align="center">Theater Managers Details</h1>
				<table border="1" align="center" width="90%" cellspacing="0"
					cellpadding="0">
					<tr>
						<th>UserName</th>
						<th>Password</th>
						<th>EmailId</th>
						<th>MobileNo</th>
						<th>Address</th>
					</tr>
					<tr>
						<%
							/*while(itr.hasNext())
							{
							System.out.println(user.getId());*/
							for (RegisterBean user : userList2) {
						%>
						<td><%=user.getUserName()%></td>
						<td><%=user.getPassword()%></td>
						<td><%=user.getEmailId()%></td>
						<td><%=user.getMobileNo()%></td>
						<td><%=user.getAddress()%></td>
						<td><a
							href="Edituser.jsp?action=updateUser&userId=<%=user.getUserId()%>">Update</a></td>
						<td><a
							href="DeleteUserController?action=deleteUser&userId=<%=user.getUserId()%>">Delete</a></td>

					</tr>
					<%
						}
						//}
					%>
				</table>
			</form>
		</div>
		<div class="admin_drop" id="collection">
			<form name="myForm" method="POST" action='./ViewCollectionController'>
				<input type="hidden" name="action" value="ViewAllUsers" />
				<%
					DeleteCollectionDao dao9 = new DeleteCollectionDao();
					List<CollectionBean> collectionList = dao9.getAllCollection();
				%>

				<table border="1">
					<tr>
						<th>Date</th>
						<th>theater</th>
						<th>center</th>
						<th>movie</th>
						<th>total days</th>
						<th>total audience</th>
						<th>total gross</th>
						<th>Profit/Loss</th>
						<th>Delete</th>
					</tr>
					<tr>
						<%
							for (CollectionBean collection : collectionList) {
						%>
						<td><%=collection.getDa()%></td>
						<td><%=collection.getTname()%></td>
						<td><%=collection.getCname()%></td>
						<td><%=collection.getMname()%></td>
						<td><%=collection.getTotaldays()%></td>
						<td><%=collection.getTotalaudiance()%></td>
						<td><%=collection.getTotalgross()%></td>
						<td><%=collection.getTotalnet()%></td>
						<td><a href="DeleteCollection?action=deleteCollection&date=<%=collection.getDa()%>">Delete</a></td>
					</tr>
					<%
						}
					%>
				</table>
			</form>
		</div>
	</div>
<!-- Admin Module to do Modifications close -->
					<%@include file="addingDetails.jsp"%>
		<!-- Navigation menu-->
	<div class="dropdownwrap4">
		<h2>Reports Page</h2>
		<div id="selection">
			<div id="movie1_select">Movie Day To Day Reports</div>
			<div id="theatre1_select">Theater Day To Day Reports</div>
			<!-- <div id="movie_select">Movie Monthly Reports</div>
				<div id="theatre_select">Theater Monthly Reports</div> -->

		</div>
		<div class="movie_drop">

			<form action="./ExcelServlet">
				<h1>Movie Monthly Report</h1>
				Select Movie:<select name='da' onchange="showMovie125(this.value)"
					id='date125'>
					<option value="none">Select</option>
					<%
							ResultSet rs520 = st.executeQuery("Select distinct mname from collection ");

						while (rs520.next()) {
					%>
					<option value="<%=rs520.getString("mname")%>"><%=rs520.getString("mname")%></option>
					<%
						}
					%>
				</select> Select Month:<select name='mname' id='movie125'>
					<option value='-1'></option>
				</select><br>


				<p align="center">
					<input type="submit" value="EXPORT EXCEL">
				</p>
			</form>

		</div>
		<div class="theatre_drop">
			<form action="./ExcelFie2">
				<h1>Theater Monthly Report</h1>
				<table>
					<tr>
						<th>Select Theater:<select name='da'
							onchange="showMovie104(this.value)" id='date'>
								<option value="none">Select</option>
								<%
									ResultSet rs104 = st.executeQuery("Select distinct tname from collection");
									while (rs104.next()) {
								%>
								<option value="<%=rs104.getString("tname")%>"><%=rs104.getString("tname")%></option>
								<%
									}
								%>
						</select> Select Month:
						<td id='theator'><select name='tname'>
								<option value='-1'></option>
						</select></td>
				</table>
				<p align="center">
					<input type="submit" value="EXCEL REPORT">
				</p>

			</form>
		</div>
		<div class="movie1_drop">
			<form action="./ExcelF" method="get" name="MovieddReport"
				onsubmit="return MovieddReport()">
				<h1>Movie Day To Day Report</h1>
				Select Movie:<select name="mname" id="mname"
					onchange="showMovieSdate(this.value)">

					<option>Select Movie</option>
					<%
						String query2121 = "SELECT DISTINCT mname FROM collection";
						ResultSet rs2121 = st.executeQuery(query2121);
					%>
					<%
						while (rs2121.next()) {
					%>
					<option value="<%=rs2121.getString("mname")%>"><%=rs2121.getString("mname")%></option>
					<%
						}
					%>
				</select> Select Start Date: <select name='sdate' id='sdate' onchange="showMovieEdate(this.value)">
					<option value='-1'>Select Start Date</option>
				</select>
								Select End Date:<select name="edate" id="edate">
					<option value='-1'>Select End Date</option>
				</select>

				<p align="center">
					<input type="submit" value="EXCEL REPORT"
						onsubmit="return MovieddReport()">
				</p>
			</form>
		</div>
		<div class="theatre1_drop">
			<form action="./ExcelFile" method="get">
				<h1>Theater Day To Day Report</h1>
				<p align="left"><select name="stateId" id="dtdrstateName1" 
							onchange="dtdrshowDistrict(this.value)">
							<option>--Select state--</option>
							<%
								ResultSet dtdrrs = st.executeQuery("select * from state");
								while (dtdrrs.next()) {
							%>
							<option value="<%=dtdrrs.getString("stateId")%>">
								<%=dtdrrs.getString("stateName")%></option>
							<%
								}
							%>
						</select></p>
						<select name="dtdrdistrictId"
							id="dtdrtdistrictName" 
							onchange="dtdrshowCenter(this.value)">
							<option>--SelectDistrict--</option>
						</select>
							<select name="dtdrcenterId" id="dtdrcenterName1"
								 onchange="dtdrShowTheator(this.value)">
								<option>--Select Center--</option>
							</select>
				<select name="dtdrtname" id="dtdrtid"
					onchange="showTheaterSdate(this.value)">
					<option value="-1">--Select Theater--</option>
				</select> 
				<select name="da" id="da1" onchange="showTheaterEdate(this.value)">
					<option value="-1">Select Start Date</option>
				</select> 
				<select name="dat" id="dat1">
					<option value='-1'>Select End Date</option>
					</select><br>
					<p align="center">
					<input type="submit" value="EXCEL REPORT"></p>
			</form>
		</div>
	</div>
	<div class="dropdownwrap5">
		<div id="selection">
			<h2>Accounts page</h2>
			<div id="theatre3_select">Theater Accounts</div>
		</div>
		<div class="movie2_drop">
			<form method="post" action='./InsertAccountsHandler' name="myForm10">
				<input type="hidden" name="action" value="insert" />
				<h2>Distributor Accounts Form</h2>
				<div class="block10">
					<p>
						Distributor Name: <select id="distname" name="distname"
							class="input1">
							<option value="--Select distributor--">--Select
								distributor--</option>
								<%
								String query27 = "select * from distributor";
								ResultSet rs27 = st.executeQuery(query27);
							%>
							<%
								while (rs27.next()) {
							%>

							<option value="<%=rs27.getString("distname")%>"><%=rs27.getString("distname")%></option>
							<%
								}
							%>

						</select>
					</p>
					<p>
						Amount:<input type="text" name="amount" id="amount" class="input1" />
					</p>
					<p>
						Date:<input type="text" name="date" id="date1" class="input1" />
					</p>
					<p>
						<!-- voucher No:<input type="text" name="voucherNo" id="voucherNo" class="input1"/> -->
					</p>
					<p>
						Term Type <select name='termname' id="classnId1"
							onchange="assingText1()" class="input1">
							<option value='-1'>Select Term</option>
							<%
								String query233 = "select * from term";
								ResultSet o1 = st.executeQuery(query233);
							%>
							<%
								while (o1.next()) {
							%>

							<option value="<%=o1.getString("termname")%>"><%=o1.getString("termname")%></option>
							<%
								}
							%>



						</select>
					</p>
					<p>
						<label name="rollno" id="rollNoId1" readonly="readonly"></label> <input
							type="text" name="termtype" id="termtype2"
							style="width: 60px; margin: 0 8%;">
					</p>
					<p>
						Narration:<input type="text" name="narration" id="narration"
							class="input1" /><br>
					</p>
					<p align="center">
						<input type="submit" value="SAVE" /> <input type="button"
							value="CANCEL" />
					</p>
				</div>
			</form>
		</div>
		<div class="theatre2_drop">
			<form method="post" action='./InsertAccounts2Handler' name="myForm10">
				<input type="hidden" name="action" value="insert" />
				<h2>Theater Accounts Form</h2>
				<div class="block10">
					<p>
						Theater Name: <select id="theatorName" name="theatorName"
							class="input1">
							<option value="--Select theator--">--Select theator--</option>
							
							<%
								String query021 = "select * from theator";
								ResultSet rs021 = st.executeQuery(query021);
							%>
							<%
								while (rs021.next()) {
							%>

							<option value="<%=rs021.getString("theatorName")%>"><%=rs021.getString("theatorName")%></option>
							<%
								}
							%>

						</select>
					</p>
					<p>
						Amount Given:<input type="text" name="amount" class="input" />
					</p>
					<p>
						Date:<input type="text" name="date" id="date11" class="input" />
					</p>
					<p>
						<!-- voucher No:<input type="text" name="voucherNo"class="input"/> -->
					</p>
					<p>
						Term Type <select name='termname' id="classnId2"
							onchange="assingText2()" class="input1">
							<option value='-1'>Select Term</option>
							<%
								String query203 = "select * from term";
								ResultSet o12 = st.executeQuery(query203);
							%>
							<%
								while (o12.next()) {
							%>

							<option value="<%=o12.getString("termname")%>"><%=o12.getString("termname")%></option>
							<%
								}
							%>



						</select>
					</p>
					<p>
						<label name="rollno" id="rollNoId2" readonly="readonly"></label> <input
							type="text" name="termtype" id="termtype2"
							style="width: 60px; margin: 0 8%;">
					</p>
					<p>
						Narration:<input type="text" name="narration" class="input" /><br>
					</p>
					<p align="center">
						<input type="submit" value="SAVE" /> <input type="reset"
							value="CANCEL" />
					</p>
				</div>
			</form>
		</div>
		<div class="movie3_drop">
			<h2>Distributor Accounts</h2>
			<form name="form" action="./account2.jsp">

				Distributor Name: <select id="distname" name="distname">
					<option value="--Select distributor--">--Select
						distributor--</option>
					<%
						String query271 = "select * from distributor";
						ResultSet rs271 = st.executeQuery(query271);
					%>
					<%
						while (rs271.next()) {
					%>

					<option value="<%=rs271.getString("distname")%>"><%=rs271.getString("distname")%></option>
					<%
						}
					%>

				</select>
				<p align="center">
					<input type="submit" value="SEARCH" onchange="account2.jsp" /><br>
				</p>
			</form>
		</div>
		<div class="theatre3_drop">
			<h2>Theatre Accounts</h2>
			<form name="form" action="./accountsth.jsp">
				Theator Name: <select id="theatorName" name="theatorName">
					<option value="--Select theatre--">--Select theatre--</option>
					<%
						String query2710 = "select * from theator";
						ResultSet rs2710 = st.executeQuery(query2710);
					%>
					<%
						while (rs2710.next()) {
					%>

					<option value="<%=rs2710.getString("theatorName")%>"><%=rs2710.getString("theatorName")%></option>
					<%
						}
					%>

				</select>
				<p align="center">
					<input type="submit" value="SEARCH" onchange="account2.jsp" />
				</p>
			</form>
		</div>
	</div>
	<!-- Navigation menu-->
	<div class=allign>
		<!-- <div class=buttons>
			<a id="dropdown" href="#"><img src="./Images/add_button1.jpg"
				height="100" width="150"></a>
		</div> -->
		<div class=buttons>
			<a id="dropdown1" href="#"><img src="./Images/mapping.jpg"
				height="100" width="150"></a>
		</div>
		 <div class=buttons>
			<a id="dropdown3" href="#"><img src="./Images/admin.jpg"
				height="100" width="150"></a>
		</div>
		<div class=buttons>
			<a id="dropdown4" href="#"><img src="./Images/report_button1.jpg"
				height="100" width="150"></a>
		</div>

		<!-- <div class=buttons>
			<a id="dropdown5" href="#"><img src="./Images/accounts.jpg"
				height="100" width="150"></a>
		</div> -->
	</div>
	<!--Navigation Menu ends-->
	<!--Footer begins-->
	<div id=footer>
		<a href="Distributor.jsp" class="foot" style="text-decoration: none;">Home</a>
		<a href="hom.jsp" class="foot" style="text-decoration: none;">LogOut</a>
	</div>
	<!--Footer ends-->
</body>
</html>