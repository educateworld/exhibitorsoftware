<%@page import="java.sql.DriverManager"%>
<%@page import="com.bvr.bean.*"%>
<%@page import="com.bvr.dao.*"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<div class="dropdownwrap2" style="display:">

		<div id="collection_daily">

				<h4>Daily Collection Entry Form</h4>
			<form method="POST" action='./CollectionHandler' name="addcollection" onsubmit="return collections()">
				<input type="hidden" name="action" value="INSERT" />

				<h7> <select class="e1" name='mname' onchange="showDate12345(this.value)" id='movie12345' >  
       <option value="none">--Select Movie--</option>  
    <%

 Connection con12345= ConnectionProvider.getConnection();
 Statement stmt12345 = con12345.createStatement();  
 ResultSet rs12345 = stmt12345.executeQuery("Select * from movie");
 while(rs12345.next()){
     %>
      <option value="<%=rs12345.getString("mname")%>_<%=rs12345.getString("mid")%>"><%=rs12345.getString("mname")%></option>  
      <%
 }
     %>
      </select></h7>
      
				<div id="top">
				
					<select class="e1" name='date' onchange="showTheator12345(this.value)" id='date12345' style="margin: 0 -450px;" >  
      <option value='-1'>--Select Date--</option>  
      
      </select>
        
					
					<select class="e1" name='tname' onchange="showCenter12345(this.value)" id='theator12345' style="margin: 0 490px;">  
      <option value='-1'>--Select Theater--</option>  
      </select>
      <select  class="e1" name='cname'  id='center12345'style="margin: 0 -450px;">  
      <option value='-1'>--Select Center--</option>  
      </select> 
				</div>
				<!-- show details enter close -->
						<div class="data_join">
		
		<div class="data">
		<p1>Morning Show</p1>
		<div class="subdata">
		<input type="hidden" name="theatoridshow" id="theatoridshow" value="0">
		<p2>Total Audience:<input type="text" id="txt11"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencemorning" value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt1"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectionmorning"value="0"/></p2>
		</div>
		</div>
		</div>
			<div class="data_join">
		
		<div class="data">
		<p1>Matinee Show</p1>
		<div class="subdata">
		<p2>Total Audience:<input type="text" id="txt12"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencematinee"value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt2"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectionmatinee"value="0" /></p2>
		</div>
		</div></div>
			<div class="data_join">
		
		<div class="data">
		<p1>First Show</p1>
		<div class="subdata">
		<p2>Total Audience:<input type="text" id="txt13"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencefirst" value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt3"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectionfirst" value="0"/></p2>
		</div>
		</div></div>
			<div class="data_join">
		
		<div class="data">
		<p1>Second Show</p1>
		<div class="subdata">
		<p2>Total Audience:<input type="text" id="txt14"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencesecond" value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt4"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectionsecond" value="0"/></p2>
		</div>
		</div>
		</div>
			<div class="data_join">
			<div class="data">
		<p1>Benefit Show</p1>
		<div class="subdata">
		<p2>Total Audience:<input type="text" id="txt15"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencebenifit" value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt5"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectionbenifit" value="0"/></p2>
		</div>
		</div></div>
			<div class="data_join">
		
		<div class="data">
		<p1>Special Show</p1>
		<div class="subdata">
		<p2>Total Audience:<input type="text" id="txt16"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="audiencespecial" value="0"/></p2>
		<p2>Total Collection:<input type="text" id="txt6"  onkeyup="sum(),totalgrassval();" onkeypress="return isNumberKey(event)" name="collectiospecial" value="0"/></p2>
		</div>
		</div>	
	</div>
	<!-- show details enter close -->
				<!-- collection total gross starts-->
 <div class="display1">
		<div id="block1" class="block">
		<input type="hidden" id="allvalues" name="values" value="0">
		<input type="hidden" id="alldeductions" name="alldeductions" value="">
		<p>Today's Gross:<input class="inpu" type="text" name="todaygross" id="todaygross" value="" ></p>
		<p>Today's Net:<input class="inpu" type="text" name="todaynet"  onkeyup="totalgrassval();"  id="todaynet" value="" ></p>
		<p>Today's Shows:<input class="inpu" type="text" name="todayshows" onkeyup="totalgrassval();"  id="todayshows" value="" ></p>
		<p>Today's Audience:<input class="inpu" type="text" name="todayaudiance" onkeyup="totalgrassval();" id="todayaudiance" value="" ></p>
		<p>Today's Theater Rent:<input class="inpu" type="text" name="todayexhibitorshare" onkeyup="totalgrassval();"  id="todayexhibitorshare"value="" ></p>
		<p>Today's Distributor Share:<input class="inpu" type="text" name="todaydistributorshare" onkeyup="totalgrassval();"  id="todaydistributorshare" value="" ></p>
		</div>
		<div id="block2" class="block">
		<p>Total Gross:<input class="inpu" type="text" name="totalgross" id="totGross" value=""></p>
		<p>Total Net:<input class="inpu" type="text" name="totalnet" id="totNet" value=""  ></p>
		<p>Total Shows:<input class="inpu" type="text" name="totalshows" id="totShows" value=""></p>
		<p>Total Audience:<input class="inpu" type="text" name="totalaudiance" id="totAudience" value=""></p>
		<p>Total Days:<input class="inpu" type="text" name="totaldays" id="totDays" value=""></p>
		<p>Total Theater Rent:<input class="inpu" type="text" name="totExhibitorShare" id="totExhibitorShare" value=""></p>
		<p>Total Distributor Share:<input class="inpu" type="text" name="totDistributorShare" id="totDistributorShare" value=""></p>
		</div>
		</div> 
		<!-- collection total gross close-->
		<div id="block3" class="block">
		<h2>Today's Deductions</h2>
		<p>Rent/SqFt :<input class="inpu" type="text" name="slab" id="slab" value=""></p>
		<p>Show Tax:<input class="inpu" type="text" name="showTax" id="showTax" value=""></p>
		<p>Batta(Bonus):<input class="inpu" type="text" name="batta" id="batta" value="" ></p>
		<p>OtherDeductions:<input class="inpu" type="text" name="od" id="od" value=""></p>
		<p>Fixed Labor Cost:<input class="inpu" type="text" name="mc" id="mc" value=""></p>
		
		</div>
		
				<div id=submit>
				<input type="onKeyUp event submitenterfun(this,event)" value="Save" readonly="readonly" style="width: 40px"/>
					<input type="submit" value="SUBMIT">
					<input type="reset"	value="RESET">
						
				</div>
				</form>
		</div>
	</div>
