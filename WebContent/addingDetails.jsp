<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection conn = ConnectionProvider.getConnection();  
 Statement st1 = conn.createStatement();
%>
<div class="dropdownwrap">
			<h2 align="center">Details Adding</h2>

			<!-- Buttons class for adding new elements-->
			<class id=buttons_add>
			<button id="my-button">ADD STATE</button>
			<button id="my-button0">ADD DISTRICT</button>
			<button id="my-button2">ADD CENTERS</button>
			<button id="my-button3">ADD THEATER</button>
			<button id="my-button4">ADD MOVIE</button>
			<button id="my-button5">ADD TERM</button>
			<!--  <button id="my-button6">ADD DISTRIBUTOR</button>--> </class>
		</div>

<div id="collect">
			<div id="myModal" class="stylemyModal">
				<h1>Add New State</h1>
				<form id="addstate" name="addstate" method="POST"
					action='./InsertStateHandler' onsubmit="return stateValidateForm()">
					<input type="hidden" name="action" value="INSERTSTATE" /> Enter
					New State: <input class="field" type="text" name="stateName"
						id="stateName" value="" size="23" /><br>
					<p align="center">
						<input class="submit" type="submit" value="SUBMIT" />
					</p>
				</form>

				<a class="close-reveal-modal"></a>
			</div>
			<div id="myModal0" class="stylemyModal">
				<table>
					<h1>Add New District</h1>
					<form method="POST" action='./InsertDistrictHandler' name="adddistrict" onsubmit="return selectStateValidate()">
						<input type="hidden" name="action" value="INSERTDISTRICT" />
						Select State Name:<select name="dstateName1" id="dstateName1"
							class="input1">
							<option>--Select state--</option>
							<%
								ResultSet dsstaters = st1.executeQuery("select * from state");
								while (dsstaters.next()) {
							%>
							<option value="<%=dsstaters.getString("stateId")%>"><%=dsstaters.getString("stateName")%></option>
							<%
								}
							%>
						</select><br> <br> Enter New District: <input type="text"
							name="districtName" class="input" id="districtName" value=""
							size="23" /><br>
						<p align="center">
							<input type="submit" value="SUBMIT"
								onclick="return districtValidateForm()">
						</p>
					</form>
				</table>
				<a class="close-reveal-modal"></a>
			</div>
			<div id="myModal1" class="stylemyModal">
				<h1>Add New Center</h1>
				<form method="POST" action='./InsertCenterHandler' name="addcenter"
					onsubmit="return selectDistrictValidate()">
					<input type="hidden" name="action" value="INSERTCENTER" />
					State Name:<select name="cstateId" id="cstateName1" class="input1" onchange="CentershowDistrict(this.value)">
							<option>--Select state--</option>
							<%
								ResultSet Centerstaters = st1.executeQuery("select * from state");
								while (Centerstaters.next()) {
							%>

							<option value="<%=Centerstaters.getString("stateId")%>"><%=Centerstaters.getString("stateName")%></option>
							<%
								}
							%>
						</select><br><br>
					Select District Name:<select name="districtId" id="districtName1"
						class="input1">
						<option>--SelectDistrict--</option>
						<%
							String csdname = "select * from district";
							ResultSet csdnamers = st1.executeQuery(csdname);
							while (csdnamers.next()) {
						%>

						<option value="<%=csdnamers.getString("districtId")%>"><%=csdnamers.getString("districtName")%></option>
	<%
							}
						%>
					</select><br> <br> Enter New Center: <input type="text"
						name="centerName" class="input" id="centerName" value="" size="23" /><br>
					<p align="center">
						<input type="submit" value="SUBMIT"
							onclick="return centerValidateForm()">
					<p align="center">
				</form>
				<a class="close-reveal-modal"></a>
			</div>
			<!-- Adding New Theater Details --> 
			<div id="myModal2" class="stylemyModal">
				<h1 align="center">Add New Theater</h1>
				<form method="POST" action='./InsertTheatorHandler'
					name="addtheatre" onsubmit="return selectCenterValidate()">
					<input type="hidden" name="action" value="INSERTTHEATOR" />

					<div class="block1">
						State Name:<select name="stateId" id="stateName1" class="input1" onchange="tshowDistrict(this.value)">
							<option>--Select state--</option>
							<%
								String sstate = "select * from state";
								ResultSet sstaters = st1.executeQuery(sstate);
								while (sstaters.next()) {
							%>

							<option value="<%=sstaters.getString("stateId")%>"><%=sstaters.getString("stateName")%></option>
							<%
								}
							%>
						</select><br> District Name:<!-- <input name="tdistrictId"
							id="tdistrictName" class="input1"> -->
						 <select name="tdistrictId"
							id="tdistrictName" class="input1" onchange="tshowCenter(this.value)">
							<option>--SelectDistrict--</option>
							
						</select><br>
						<p>
							Center Name:<!-- <input  name="centerId" id="centerName1"
								class="input5"> -->
							<select name="centerId" id="centerName1"
								class="input5">
								<option>--Select Center--</option>
															</select>
						</p>
						<p>
							Theater Name:<input type="text" name="theatorName"
								id="theatorName7" class="input4" />
						</p>
						<p>
							Capacity Of Theater(Amount):<input type="text" name="housefulCapacity"
								id="housefulCapacity" class="input4" />
						</p>
						<p>
							Theater Information:
							<textarea name="theatreDescription" id="theatredescription7"
								style="width: 150px; height: 30px;" class="input4"></textarea>

						</p>
					</div>
					<div class="block1">
						<p>
							OwnerName:<input type="text" name="ownerName" id="ownerName7"
								class="input" />
						<p>
							OwnerContact:
							<textarea name="contactNumber" id="contactNumber7"
								style="width: 150px; height: 30px; margin: 0 10px;"
								class="input1"></textarea>
						</p>
						<p>
							Theater Rent:<input type="text" name="theatreRent"
								id="theatreRent7" class="input" />
						<p>
							Distributor Share:<input type="text" name="distributorShare"
								id="distributorShare7" class="input" />
						</p>

					</div>

					<div class="block1">
						<p>
							Rent/SqFt :<input type="text" name="slab" id="slab7"
								class="input3" value="0" />
						</p>
						<p>
							Show Tax:<input type="text" name="showTax" id="showTax7"
								class="input3" value="0" />
						</p>
						<p>
							Batta(Bonus):<input type="text" name="batta" id="batta7"
								class="input3" value="0" />
						</p>
						<p>
							Other Deductions:<input type="text" name="inr" id="inr7" class="input3"
								value="0" />
						</p>
						<p>
							Fixed Labor Cost:<input type="text" name="mc" id="mc7"
								class="input3" value="0" />
						</p>
					</div>
					<br>
					<p align="center">
						<input type="submit" value="SUBMIT">
					</p>
				</form>

				<a class="close-reveal-modal"></a>
			</div>
			<div id="myModal3" class="stylemyModal">
				<h1>Add New Movie</h1>
				<form method="POST" action='./MovieInsertController' name="addmovie"
					onsubmit="return selectTheatorValidate()">
					<input type="hidden" name="action" value="INSERTMOVIE" /> <br>Movie
					Name<input type="text" name="mname" id="mname1" class="input"><br>
					<p align="center">
						<input type="submit" value="SUBMIT"
							onclick="return movieValidateForm()">
					</p>
				</form>
				<a class="close-reveal-modal"></a>
			</div>
		</div>
		<div id="myModal5" class="stylemyModal">
			<h1>Add New Term</h1>
			<form method="POST" action='./TermInsertController' name="addterm"
				onsubmit="return termValidateForm()">
				<input type="hidden" name="action" value="INSERTTERM" /> Term Type:<input
					type="text" name="termname" value="" class="input"><br>
				<p align="center">
					<input type="submit" value="SUBMIT"
						onclick="return termValidateForm()">
				</p>
			</form>
			<a class="close-reveal-modal"></a>
		</div>
								</div>		