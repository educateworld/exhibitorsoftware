<script language="javascript" type="text/javascript">
function submitenterfun(myfield,e){

	var keycode;
	if (window.event)
	keycode = window.event.keyCode;
	else if (e)
	keycode = e.which;
	else
	return true;

	if (keycode == 13){

	document.forms.loginForm.submit();
	return false;
	}
	else
	return true;
	}
	function loginValidtaion()
{
	var uname = document.forms["loginForm"]["username"].value;
	var password = document.forms["loginForm"]["password"].value;
	if (uname == null || uname == "") {
        alert("UName must be filled out");
        return false;
	}
	if (password == null || password == "") {
        alert("password must be filled out");
        return false;
	}
	return true;

	}
function formValidation()  
{  
	//alert('reg val')
	var uname = document.forms["frmAddUser"]["username"].value;
	var password = document.forms["frmAddUser"]["password"].value;
	var email = document.forms["frmAddUser"]["email"].value;
	var address = document.forms["frmAddUser"]["address"].value;
	var mobileno = document.forms["frmAddUser"]["mobileno"].value;
	
	if (uname == null || uname == "") {
        alert("UName must be filled out");
        return false;
	}
	if (password == null || password == "") {
        alert("password must be filled out");
        return false;
	}
	if (email == null || email == "") {
        alert("email must be filled out");
        return false;
	}
	 var atpos = email.indexOf("@");
	    var dotpos = email.lastIndexOf(".");
	    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
	        alert("Not a valid e-mail address");
	        return false;
	    }
	    if (mobileno == null || mobileno == "") {
	        alert("mobileno must be filled out");
	        return false;
		}
	   
	if (address == null || address == "") {
        alert("address must be filled out");
        return false;
	}
	 /* var phoneno = /^\d{10}$/;  
	    if(mobileno.value.match(phoneno))  
	    {  
	        return true;  
	    }  
	    else  
	    {  
	       alert("Not a valid Phone Number");  
	       return false;  
	    }  
	 */
	return true;
} 
 
</script>
<!-- validation for Registration Page Ends -->
<script>
	//Function For Drop-down Content //
	
	$(document).ready(function(e){
			 $('#dropdown').on('click',function(){
			  $('.dropdownwrap').slideToggle("slow");
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap2').css('display','none');
			  $('.dropdownwrap3').css('display','none');
			  $('.dropdownwrap4').css('display','none');
			  $('.dropdownwrap5').css('display','none');
		   });
		    $('#dropdown1').on('click',function(){
			  $('.dropdownwrap1').slideToggle("slow");
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap2').css('display','none');
			  $('.dropdownwrap3').css('display','none');
			  $('.dropdownwrap4').css('display','none');
			  $('.dropdownwrap5').css('display','none');
		   });
		   $('#dropdown2').on('click',function(){
			  $('.dropdownwrap2').slideToggle("slow");
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap3').css('display','none');
			  $('.dropdownwrap4').css('display','none');
			  $('.dropdownwrap5').css('display','none');
	  });  
			 $('#dropdown3').on('click',function(){
			  $('.dropdownwrap3').slideToggle("slow");
			  $('.dropdownwrap').css('display','none');
			  $('.dropdownwrap1').css('display','none');
			  $('.dropdownwrap2').css('display','none');
			  $('.dropdownwrap4').css('display','none');
			  $('.dropdownwrap5').css('display','none');
	}); 
			 $('#dropdown4').on('click',function(){
					
				  $('.dropdownwrap4').slideToggle("slow");
				  $('.dropdownwrap').css('display','none');
				  $('.dropdownwrap1').css('display','none');
				  $('.dropdownwrap2').css('display','none');
				  $('.dropdownwrap3').css('display','none');
				  $('.dropdownwrap5').css('display','none');

				});
			 $('#dropdown5').on('click',function(){
					
				  $('.dropdownwrap5').slideToggle("slow");
				  $('.dropdownwrap').css('display','none');
				  $('.dropdownwrap1').css('display','none');
				  $('.dropdownwrap2').css('display','none');
				  $('.dropdownwrap3').css('display','none');
				  $('.dropdownwrap4').css('display','none');

				}); 
	});
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
			$('#my-button5').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal5').bPopup();

            });
			$('#my-button6').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal6').bPopup();
            });
        });

    })(jQuery);
	</script>


<script type="text/javascript">
  	//Function For Admin Drop-down Selection Content //
		$(document).ready(function(e){
			 $('#select_state').on('click',function(){
			  $('#state5').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_district').on('click',function(){
			  $('#district5').slideToggle("slow");
			
			  $('#state5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_center').on('click',function(){
			  $('#center').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#state5').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_theater').on('click',function(){
			  $('#theater').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#state5').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_movie').on('click',function(){
			  $('#movie').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#state5').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_term').on('click',function(){
			  $('#term').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#state5').css('display','none');
			  $('#distributor').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_distributor').on('click',function(){
			  $('#distributor').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#state5').css('display','none');
			  $('#registered').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_registered').on('click',function(){
			  $('#registered').slideToggle("slow");
			
			  $('#district5').css('display','none');
			  $('#center').css('display','none');
			  $('#theater').css('display','none');
			  $('#movie').css('display','none');
			  $('#term').css('display','none');
			  $('#distributor').css('display','none');
			  $('#state5').css('display','none');
			  $('#collection').css('display','none');
		   });
		    $('#select_collection').on('click',function(){
				  $('#collection').slideToggle("slow");
				
				  $('#district5').css('display','none');
				  $('#center').css('display','none');
				  $('#theater').css('display','none');
				  $('#movie').css('display','none');
				  $('#term').css('display','none');
				  $('#distributor').css('display','none');
				  $('#state5').css('display','none');
				  $('#registered').css('display','none');
			   });
		});
	</script>
<script>
  // Semicolon (;) to ensure closing of earlier scripting
    // Encapsulation
    // $ is assigned to jQuery
    ;(function($) {

         // DOM Ready
        $(function() {

            // Binding a click event
            // From jQuery v.1.7.0 use .on() instead of .bind()
			$('#state').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModalstate').bPopup();

            });
            $('#district').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModaldistrict').bPopup();

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
			$('#my-button5').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal5').bPopup();

            });
			$('#my-button6').bind('click', function(e) {

                // Prevents the default action to be triggered. 
                e.preventDefault();

                // Triggering bPopup when click event is fired
                $('#myModal6').bPopup();
            });
        });

    })(jQuery);
	//Reports//
		$(document).ready(function(e){
			 $('#movie_select').on('click',function(){
			  $('.movie_drop').slideToggle("slow");
			
			  $('.theatre_drop').css('display','none');
			  $('.movie1_drop').css('display','none');
			  $('.theatre1_drop').css('display','none');
			
		   });
		    $('#theatre_select').on('click',function(){
			  
			  $('.theatre_drop').slideToggle("slow");
			 
			  $('.movie_drop').css('display','none');
			  $('.movie1_drop').css('display','none');
			  $('.theatre1_drop').css('display','none');
		   });
		    
		    $('#movie1_select').on('click',function(){
				  $('.movie1_drop').slideToggle("slow");
				
				  $('.theatre_drop').css('display','none');
				  $('.theatre1_drop').css('display','none');
				  $('.movie_drop').css('display','none');
			   });

		    $('#theatre1_select').on('click',function(){
		    	
		    	$('.theatre1_drop').slideToggle("slow");
				  $('.movie_drop').css('display','none');
				  $('.theatre_drop').css('display','none');
				  $('.movie1_drop').css('display','none');
			   });
 $('#movie2_select').on('click',function(){
		    	
		    	$('.movie2_drop').slideToggle("slow");
				  $('.theatre2_drop').css('display','none');
				  $('.movie3_drop').css('display','none');
				  $('.theatre3_drop').css('display','none');
			   });
 $('#theatre2_select').on('click',function(){
 	
 	$('.theatre2_drop').slideToggle("slow");
 	$('.movie3_drop').css('display','none');
	  $('.theatre3_drop').css('display','none');
		  $('.movie2_drop').css('display','none');
	   });
 $('#movie3_select').on('click',function(){
	 $('.movie3_drop').slideToggle("slow");
	 $('.theatre3_drop').css('display','none');
	 $('.movie2_drop').css('display','none');
	 $('.theatre2_drop').css('display','none');
 });
 $('#theatre3_select').on('click',function(){
	 $('.theatre3_drop').slideToggle("slow");
	 $('.movie2_drop').css('display','none');
	 $('.theatre2_drop').css('display','none');
	 $('.movie3_drop').css('display','none');
 });
		});
	</script>
<link rel="stylesheet" href="./css/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<script>
  $(function(){
      $("#datestart").datepicker({ dateFormat: 'yy-mm-dd' });
      $("#dateend").datepicker({ dateFormat: 'yy-mm-dd' });
      $("#date1").datepicker({ dateFormat: 'yy-mm-dd' });
      $("#date11").datepicker({ dateFormat: 'yy-mm-dd' });
     
          var minValue = $(this).val();
          minValue = $.datepicker.parseDate("yy-mm-dd", minValue);
          minValue.setDate(minValue.getDate()+1);
          $("#to").datepicker( "option", "minDate", minValue );
      
  });
</script>
<!-- <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/themes/base/jquery-ui.css" type="text/css" media="all">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.11/jquery-ui.min.js"></script>

<script>
$(function(){
        $("#to").datepicker({ dateFormat: 'yy-mm-dd' });
        $("#from").datepicker({ dateFormat: 'yy-mm-dd' }).bind("change",function(){
            var minValue = $(this).val();
            minValue = $.datepicker.parseDate("yy-mm-dd", minValue);
            minValue.setDate(minValue.getDate()+1);
            $("#to").datepicker( "option", "minDate", minValue );
        })
    });

</script> -->
<script type="text/javascript">
function stateValidateForm()
{
var x=document.forms["addstate"]["stateName"].value;
var a = /^[a-zA-Z0-9\s]+$/; 
if (x==null || x=="")
  {
  alert("State name must be filled out");
  return false;
  } 
else if(!(x.match(a)))  
		  {  
	alert("enter state name alphabets only");   
	   return false;
		  }  
  return true;
}

function isNumberKey(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode
   if (charCode > 31 && (charCode < 48 || charCode > 57))
      return false;

   return true;
}

function movieValidateForm()
{
	var a = /^[a-zA-Z0-9\s]+$/; 
var y=document.forms["addmovie"]["mname1"].value;
if ( y==null || y=="" )
  {
  alert("movie name must be filled out");
  return false;
  }
else if(!(y.match(a)))  
{  
alert("enter movie name alphabets only");   
return false;
}  
  return true;
}

function termValidateForm()
{
var x=document.forms["addterm"]["termname8"].value;
var a = /^[a-zA-Z0-9\s]+$/; 
  if(x==null || x=="")
	  {
	  alert("enter termname ");   
	  return false;
	  
	  }
else if(x.match(a))  
{  
alert("incorrect termname");   
return false;
}  

  return true;
}

function distributorValidateForm()
{
var x=document.forms["adddistributor"]["distributorName1"].value;
var y=document.forms["adddistributor"]["mobileNumber1"].value;
var z=document.forms["adddistributor"]["address1"].value;
var a = /^[a-zA-Z0-9\s]+$/; 

  if(x==null || x=="")
	  {
	  alert("distributor name must be filled out");
	  return false;
	  }
else if(!(x.match(a)))  
{  
alert("enter distributor name alphabets only");   
return false;
}  
else if(y==null || y=="" )
{
alert("mobile number must be filled out");
return false;
}
else if(y<10)
	{
	alert("not a valid number");
	return false;
	}
else if(z==null || z=="" )
  {
  alert("address must be filled out");
  return false;
  }
else if(!(z.match(a)))  
{  
alert("enter address alphabets only");   
return false;
}  
  return true;
}

            function selectStateValidate()
            {
            	var y=document.forms["adddistrict"]["districtName"].value;
            	var a = /^[a-zA-Z0-9\s]+$/; 
            	alert(document.getElementById('dstateName1').selectedIndex);
            	if(document.getElementById('dstateName1').selectedIndex ==0)
            	 {
            	 alert("Please select state");
            	 return false;
            	 }
            	
            	else if (y==null || y=="" )
            	  {
            	  alert("district name must be filled out");
            	  return false;
            	  }
            	else if(!(y.match(a)))  
            	{  
            	alert("enter district name alphabets only");   
            	return false;
            	}  
                return true;
            }
       
            function selectDistrictValidate()
            {
            	var a = /^[a-zA-Z0-9\s]+$/; 
            	var y=document.forms["addcenter"]["centerName"].value;
            	if(document.getElementById('districtName1').selectedIndex ==0)
            	 {
            	 alert("Please select district");
            	 return false;
            	 }
            	
            	else if ( y==null || y=="" )
            	  {
            	  alert("center name must be filled out");
            	  return false;
            	  }
            	else if(!(y.match(a)))  
            	{  
            	alert("enter center name alphabets only");   
            	return false;
            	}  
                return true;
            }
        
            function selectCenterValidate()
            {
            	if(document.getElementById('centerName1').selectedIndex ==0)
            	 {
            	 alert("Please select center");
            	 return false;
            	 }
            	var b=document.forms["addtheatre"]["stateId"].value;
            	var b=document.forms["addtheatre"]["tdistrictId"].value;
            	var m=document.forms["addtheatre"]["housefulCapacity"].value;
            	var l=document.forms["addtheatre"]["theatredescription7"].value;
            	var n=document.forms["addtheatre"]["ownerName7"].value;
            	var c=document.forms["addtheatre"]["contactNumber7"].value;
            	var d=document.forms["addtheatre"]["theatreRent7"].value;
            	var e=document.forms["addtheatre"]["distributorShare7"].value;
            	var f=document.forms["addtheatre"]["slab7"].value;
            	var g=document.forms["addtheatre"]["showTax7"].value;
            	var h=document.forms["addtheatre"]["batta7"].value;
            	var i=document.forms["addtheatre"]["inr7"].value;
            	var j=document.forms["addtheatre"]["mc7"].value;
            	var k = /^[a-zA-Z0-9\s\,\:\.]+$/; 
            	var t=/^[0-9\.]+$/; 
            	var decimal=  /^[-+]?[0-9]+\.[0-9]+$/;   
            	if(b==null || b=="")
            		{
            		alert("enter theatorname");
            		 return false;
            		}
            	else if(!(b.match(k)))  
            	{  
            	alert("incorrect theator name");   
            	return false;
            	}  
            	else if(m==null || m=="")
        		{
        		alert("enter houseful capacity");
        		 return false;
        		}
        	else if(!(m.match(t)))  
        	{  
        	alert("incorrect houseful capacity");   
        	return false;
        	}  
        	else if(l==null || l=="")
        		{
        		alert("enter theatre description");
        		 return false;
        		}
        	else if(!(l.match(k)))  
        	{  
        	alert("incorrect theatre description");   
        	return false;
        	}  
        	else if(n==null || n=="")
    		{
    		alert("enter owner name");
    		 return false;
    		}
    	else if(!(n.match(k)))  
    	{  
    	alert("incorrect owner name");   
    	return false;
    	} 
    	else if(c==null || c=="")
        		{
        		alert("enter owner contact");
        		 return false;
        		}
        	else if(!(c.match(k)))  
        	{  
        	alert("incorrect owner contact");   
        	return false;
        	}  
        	else if(d==null || d=="")
    		{
    		alert("enter theatre rent");
    		 return false;
    		}
    	else if(!(d.match(t)))  
    	{  
    	alert("incorrect theatre rent");   
    	return false;
    	}  
    	else if(e==null || e=="")
    		{
    		alert("enter distributor share");
    		 return false;
    		}
    	else if(!(e.match(t)))  
    	{  
    	alert("incorrect distributor share");   
    	return false;
    	}  
    	else if(f==null || f=="")
		{
		alert("enter slab");
		 return false;
		}
	else if(!(f.match(t)))  
	{  
	alert("incorrect slab");   
	return false;
	} 
	else if(g==null || g=="")
	{
	alert("enter show tax");
	 return false;
	}
else if(!(g.match(t)))  
{  
alert("incorrect show tax");   
return false;
}  
else if(h==null || h=="")
{
alert("enter batta");
 return false;
}
else if(!(h.match(t)))  
{  
alert("incorrect batta");   
return false;
} 
else if(i==null || i=="")
	{
	alert("enter inr");
	 return false;
	}
else if(!(i.match(t)))  
{  
alert("incorrect inr");   
return false;
}  
else if(j==null || j=="")
{
alert("enter mc");
 return false;
}
else if(!(j.match(t)))  
{  
alert("incorrect mc");   
return false;
}  
            	 return true;
            }
       
            function selectTheatorValidate()
            {
            	if(document.getElementById('theatorName1').selectedIndex ==0)
            	 {
            	 alert("Please select theator");
            	 return false;
            	 }
            }
            </script>
<!-- insert add ends -->

<!-- add starts-->
<script>
 function validateForm()
 {
 if(document.getElementById('selectstate').selectedIndex ==0)
 {
 alert("Please select state");
 return false;
 }
 if(document.getElementById('selectdistrict').selectedIndex ==0)
 {
 alert("Please select district");
 return false;
 }
 if(document.getElementById('selectcenter').selectedIndex ==0)
 {
 alert("Please select center");
 return false;
 }
 if(document.getElementById('selecttheator').selectedIndex ==0)
 {
 alert("Please select theator");
 return false;
 }
 if(document.getElementById('selectmovie').selectedIndex ==0)
 {
 alert("Please select movie");
 return false;
 }
 if(document.getElementById('percentage').selectedIndex ==0)
 {
 alert("Please select term");
 return false;
 }
 if(document.getElementById('distname').selectedIndex ==0)
 {
 alert("Please select distributor");
 return false;
 }
 return true;
 }
 </script>
<!-- add ends-->

<!-- collection start -->
<script>
function collections()
{
	
	
	if(document.getElementById('movie12345').selectedIndex ==0)
	{
	alert("Please select movie");
	return false;
	}
	else if(document.getElementById('date12345').selectedIndex ==0)
	{
	alert("Please select date");
	return false;
	}
	else if(document.getElementById('theator12345').selectedIndex ==0)
	{
	alert("Please select theatre");
	return false;
	}
	else if(document.getElementById('center12345').selectedIndex ==0)
	{
	alert("Please select center");
	return false;
	}
	
	return true;
}
function dateValidation(date_val)
{
var matches = /(\d{4})[-\/](\d{2})[-\/](\d{2})/.exec(date_val);

if (matches == null)
 {
    alert("Enter Date in YYYY-MM-DD format")
 }
    }
</script>

<!-- collection end -->

<!-- mapping start -->
<script>
function map(){

var a=document.forms["mapping"]["datestart"].value;
var b=document.forms["mapping"]["dateend"].value;
var k = /^[a-zA-Z]+$/; 
if(document.getElementById('mname9').selectedIndex ==0)
{
alert("Please select movie");
return false;
}
else if(document.getElementById('centermapping').selectedIndex ==0)
{
alert("Please select center");
return false;
}
else if(document.getElementById('theatormapping').selectedIndex ==0)
{
alert("Please select theatre");
return false;
}
else if(document.getElementById('classnId').selectedIndex ==0)
{
alert("Please select term");
return false;
}
else if(a==null || a=="" )
{
alert("enter start date");
 return false;
}

else if(b==null || b=="")
{
alert("enter end date");
 return false;
}
  return true;
}
</script>

<!-- mapping end -->
<script>
function dateValidation(date_val)
        {
        var matches = /(\d{4})[-\/](\d{2})[-\/](\d{2})/.exec(date_val);

        if (matches == null)
         {
            alert("Enter Date in YYYY-MM-DD format")
         }
            }
</script>


</script>
<!-- Script code for all onchange buttons open -->

<script type="text/javascript">  
      var xmlHttp;  
      var xmlHttp;
      function showDistrict(str){
      if (typeof XMLHttpRequest != "undefined"){
      xmlHttp= new XMLHttpRequest();
      }
      else if (window.ActiveXObject){
      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
      }
      if (xmlHttp==null){
      alert("Browser does not support XMLHTTP Request")
      return;
      } 
       var url="district1.jsp";
      var res = str.split("_");
      var str1=res[0];
      alert("show district:"+str1);
      url +="?state=" +str1;
      xmlHttp.onreadystatechange = stateChange;
      xmlHttp.open("GET", url, true);
      xmlHttp.send(null);
      }

      function stateChange(){   
    	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){    
      document.getElementById("selectdistrict").innerHTML=xmlHttp.responseText   
      }   
      }

      function showCenter(str){
          if (typeof XMLHttpRequest != "undefined"){
            xmlHttp= new XMLHttpRequest();
            }
          else if (window.ActiveXObject){
            xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
            }
          if (xmlHttp==null){
          alert("Browser does not support XMLHTTP Request")
          return;
          } 
          var url="center2.jsp";
          var res = str.split("_");
          var str1=res[0];
          url +="?state=" +str1;
          xmlHttp.onreadystatechange = stateChange1;
          xmlHttp.open("GET", url, true);
          xmlHttp.send(null);
          }
          function stateChange1(){   
        	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
          document.getElementById("selectcenter").innerHTML=xmlHttp.responseText   
          }   
          }
          
          function showTheator(str){
              if (typeof XMLHttpRequest != "undefined"){
                xmlHttp= new XMLHttpRequest();
                }
              else if (window.ActiveXObject){
                xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                }
              if (xmlHttp==null){
              alert("Browser does not support XMLHTTP Request")
              return;
              } 
              var url="theator.jsp";
              var res = str.split("_");
              var str1=res[0];
             
              url +="?state=" +str1;
              xmlHttp.onreadystatechange = stateChange2;
              xmlHttp.open("GET", url, true);
              xmlHttp.send(null);
              }
              function stateChange2(){   
            	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
              document.getElementById("selecttheator").innerHTML=xmlHttp.responseText   
              }   
              }
              
              function showMovie(str){
                  if (typeof XMLHttpRequest != "undefined"){
                    xmlHttp= new XMLHttpRequest();
                    }
                  else if (window.ActiveXObject){
                    xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                    }
                  if (xmlHttp==null){
                  alert("Browser does not support XMLHTTP Request")
                  return;
                  } 
                  var url="movie.jsp";
                
                  var res = str.split("_");
                  var str1=res[0];
                  url +="?state=" +str1;
                  xmlHttp.onreadystatechange = stateChange3;
                  xmlHttp.open("GET", url, true);
                  xmlHttp.send(null);
                  }
                  function stateChange3(){   
                	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
                  document.getElementById("selectmovie").innerHTML=xmlHttp.responseText   
                  }   
                  }
/*  Collection movie mapping Script */
                  
                  function showTheatormapping(str){
                      if (typeof XMLHttpRequest != "undefined"){
                      xmlHttp= new XMLHttpRequest();
                      }
                      else if (window.ActiveXObject){
                      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                      }
                      if (xmlHttp==null){
                      alert("Browser does not support XMLHTTP Request")
                      return;
                      } 
                      var url="theatormapping.jsp";
                      var res = str.split("_");
                      var str1=res[0];
                          url +="?center=" +str1;
                      xmlHttp.onreadystatechange = stateChange4;
                      xmlHttp.open("GET", url, true);
                      xmlHttp.send(null);
                       }

                      function stateChange4(){   
                      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
                      document.getElementById("theatormapping").innerHTML=xmlHttp.responseText   
                      }   
                      }
                      function showMoviemapping(str){
                          if (typeof XMLHttpRequest != "undefined"){
                            xmlHttp= new XMLHttpRequest();
                            }
                          else if (window.ActiveXObject){
                            xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                            }
                          if (xmlHttp==null){
                          alert("Browser does not support XMLHTTP Request")
                          return;
                          } 
                          var url="moviemapping.jsp";
                          var res = str.split("_");
                          var str1=res[0];
                          // document.getElementById("theatorid").value =str1;
                          var slab1=res[1];
                          var stax1=res[2];
                         var batta1=res[3];
                         var exhibitorshare1=res[7];
                         var distributorshare1=res[8];
                         //alert("slab1"+slab1);
                         var mc1=res[9];
                         var inr=res[10];
                           document.getElementById("slab1").value =slab1;
                           document.getElementById("stax1").value =stax1;
                           document.getElementById("batta1").value =batta1;
                           document.getElementById("exhibitorshare1").value =exhibitorshare1;
                           document.getElementById("distributorshare1").value =distributorshare1;
                          document.getElementById("mc1").value =mc1;
                            url +="?center=" +str1;
                          xmlHttp.onreadystatechange = stateChange5;
                          xmlHttp.open("GET", url, true);
                          xmlHttp.send(null);
                           }
                          function stateChange5(){   
                          if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){  
                        	 
                         // document.getElementById("moviemapping").innerHTML=xmlHttp.responseText   
                          }   
                          }
                             // Collection movie mapping  Script close //
                             
                                      function totalgrassval()
                                      {
                                 		 
                                 		var totDetails=document.getElementById("allvalues").value.split("_");
                                 		//salert("totalgrassval"+totDetails);
                                 		var totGross=totDetails[9];
                                 	    var totNet=totDetails[10];
                                 	    var totShows=totDetails[11];
                                 	    var totAudience=totDetails[12];
                                 	    var totExhibitorShare=totDetails[13];
                                 	    var totDistributorShare=totDetails[14];
                                 	   var otherdeductions=totDetails[8];
                                 	   
                                 	    var todaygross=document.getElementById("todaygross").value;
                                 	     var todayshows=document.getElementById("todayshows").value;
                                 	    var todayaudiance=document.getElementById("todayaudiance").value;
                                 	    var todayexhibitorshare=document.getElementById("todayexhibitorshare").value;
                                 	    var todaydistributorshare=document.getElementById("todaydistributorshare").value;
                                 	   var todaynet=document.getElementById("alldeductions").value;
                                 	   
                                 	  	  
                                 	    if (todaygross==null ||todaygross==""||document.getElementById("todaygross").value.trim()== "")
                                  	  {
                                  	 
                                 			todaygross=0;  
                                  	  }
                                 		 //alert("tdygrass if"+todaygross);
                                    	  document.getElementById("slab").value =totDetails[3];
                                    	 // alert("totgrass"+totgross);
                                    	  if (totGross=="null" ||totGross=="" ||totGross.trim()== "")
                                    		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                    	  {
                                    		  totGross=0;  
                                    	  }
                                    	 // alert("ramu if"+totgross);
                                    	  var totgrosssum=parseFloat(todaygross) + parseFloat(totGross);
                                    	    document.getElementById("totGross").value =totgrosssum; 
                                    	    
                                    	    if (otherdeductions=="null" ||otherdeductions=="")
                                        	  {
                                        	 
                                       		  otherdeductions=0;  
                                        	  }
                                       	   document.getElementById("od").value =((parseFloat(todaygross)-(parseFloat(document.getElementById("slab").value) + parseFloat(document.getElementById("showTax").value)))*(0.2))/100;
                                       	  
                                    	    
                                    	    if (todaynet==null ||todaynet==""||document.getElementById("todaynet").value.trim()== "")
                                      	  {
                                      	 
                                     			todaynet=0;  
                                      	  }
                                    	    //var deduct=document.getElementById("alldeductions").value;
                                    	    //alert("todaynet"+todaynet);
                                    	    var Net=parseFloat(todaygross)-parseFloat(todaynet);
                                    	    //alert("todaynet afetr deduct"+Net);
                                    	    document.getElementById("todaynet").value =Net;
                                    	   
                                   		 //alert("tdygrass if"+todaygross);
                                      	  
                                      	 // alert("totgrass"+totgross);
                                      	  if (totNet=="null" ||totNet=="" ||totNet.trim()== "")
                                      		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                      	  {
                                      		totNet=0;  
                                      	  }
                                      	 // alert("ramu if"+totgross);
                                      	  var totNetsum=parseFloat(document.getElementById("todaynet").value) + parseFloat(totNet);
                                      	 
                                      	  //alert("ramu"+sum);
                                      	  document.getElementById("totNet").value =totNetsum; 
                                      	//alert("tdygrass"+todaygross);
                                   		if (todayshows==null ||todayshows==""||document.getElementById("todayshows").value.trim()== "")
                                    	  {
                                    	 
                                   			todayshows=0;  
                                    	  }
                                   		 //alert("tdygrass if"+todaygross);
                                      	  
                                      	 // alert("totgrass"+totgross);
                                      	  if (totShows=="null" ||totShows=="" ||totShows.trim()== "")
                                      		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                      	  {
                                      		totShows=0;  
                                      	  }
                                      	 // alert("ramu if"+totgross);
                                      	  var totShowssum=parseFloat(todayshows) + parseFloat(totShows);
                                      	 
                                      	  //alert("ramu"+sum);
                                      	  document.getElementById("totShows").value =totShowssum; 
                                      	//alert("tdygrass"+todaygross);
                                   		if (todayaudiance==null ||todayaudiance==""||document.getElementById("todayaudiance").value.trim()== "")
                                    	  {
                                    	 
                                   			todayaudiance=0;  
                                    	  }
                                   		 //alert("tdygrass if"+todaygross);
                                      	  
                                      	  //alert("totAudience"+totAudience);
                                      	  if (totAudience=="null" ||totAudience=="" ||totAudience.trim()== "")
                                      		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                      	  {
                                      		totAudience=0;  
                                      	  }
                                      	  //alert("totAudience if"+totAudience);
                                      	  var todayaudiancesum=parseFloat(todayaudiance) + parseFloat(totAudience);
                                      	 
                                      	  //alert("ramu"+sum);
                                      	  document.getElementById("totAudience").value =todayaudiancesum; 
                                      	//alert("tdygrass"+todaygross);
                                   		if (todayexhibitorshare==null ||todayexhibitorshare==""||document.getElementById("todayexhibitorshare").value.trim()== "")
                                    	  {
                                    	 
                                   			todayexhibitorshare=0;  
                                    	  }
                                   		 //alert("tdygrass if"+todaygross);
                                      	  
                                      	 // alert("totgrass"+totgross);
                                      	  if (totExhibitorShare=="null" ||totExhibitorShare=="" ||totExhibitorShare.trim()== "")
                                      		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                      	  {
                                      		totExhibitorShare=0;  
                                      	  }
                                      	 // alert("ramu if"+totgross);
                                      	  var totExhibitorSharesum=parseFloat(todayexhibitorshare) + parseFloat(totExhibitorShare);
                                      	 
                                      	  //alert("ramu"+sum);
                                      	  document.getElementById("totExhibitorShare").value =totExhibitorSharesum; 
                                      	//alert("tdygrass"+todaygross);
                                   		if (todaydistributorshare==null ||todaydistributorshare==""||document.getElementById("todaydistributorshare").value.trim()== "")
                                    	  {
                                    	 
                                   			todaydistributorshare=0;  
                                    	  }
                                   		 //alert("tdygrass if"+todaygross);
                                      	  
                                      	 // alert("totgrass"+totgross);
                                      	  if (totDistributorShare=="null" ||totDistributorShare=="" ||totDistributorShare.trim()== "")
                                      		 // if ((document.getElementById("hiddenvalue").value).length == 0)
                                      	  {
                                      		totDistributorShare=0;  
                                      	  }
                                      	 // alert("ramu if"+totgross);
                                      	  var totDistributorSharesum=parseFloat(todaydistributorshare) + parseFloat(totDistributorShare);
                                      	 
                                      	  //alert("ramu"+sum);
                                      	  document.getElementById("totDistributorShare").value =totDistributorSharesum; 
                                      	  
                                      	
                                      	var date=document.getElementById("date12345").value.split("_");
                                      	//alert("date:"+document.getElementById("date12345").value);
                                      	  var da=totDetails[15];
                                     	 var dat=date[1];
                                     	//alert("date:"+dat);
                                     	 //alert("startdate:"+da);
                                     	

                                        if(da!= '' && dat != '')
                                        {
                                            var one_day=1000*60*60*24;

                                            var x = da.split("-");
                                            var y = dat.split("-");
                                            var date1=new Date(x[0],(x[1]-1),x[2]);
                                            var date2=new Date(y[0],(y[1]-1),y[2]);

                                            var dDays = (date2.getTime()-date1.getTime())/one_day;
                                            var dMonths = Math.ceil(dDays / 30);

                                            var dYears = Math.floor(dMonths /12) + "." + dMonths+ "." + dDays;
                                            document.getElementById("totDays").value = dDays;
                                      };
                                        }
                                    
                                      function showMovie104(str){
                                          
                                      if (typeof XMLHttpRequest != "undefined"){
                                      xmlHttp= new XMLHttpRequest();
                                      }
                                      else if (window.ActiveXObject){
                                      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                                      }
                                      if (xmlHttp==null){
                                      alert("Browser does not support XMLHTTP Request");
                                      return;
                                      } 
                                      var url="movie1.jsp";
                                      url +="?date=" +str;
                                      //alert(url);
                                      xmlHttp.onreadystatechange = stateChange104;
                                      xmlHttp.open("GET", url, true);
                                      xmlHttp.send(null);
                                      }

                                     function stateChange104(){   
                                      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
                                      document.getElementById("theator").innerHTML=xmlHttp.responseText ; 
                                      
                                      }   
                                      }
                                      function showMovie125(str){
                                          
                                      if (typeof XMLHttpRequest != "undefined"){
                                      xmlHttp= new XMLHttpRequest();
                                      }
                                      else if (window.ActiveXObject){
                                      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                                      }
                                      if (xmlHttp==null){
                                      alert("Browser does not support XMLHTTP Request")
                                      return;
                                      } 
                                      var url="movie2.jsp";
                                      url +="?date=" +str;
                                      //alert(url);
                                      xmlHttp.onreadystatechange = stateChange420;
                                      xmlHttp.open("GET", url, true);
                                      xmlHttp.send(null);
                                      }

                                     function stateChange420(){   
                                      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
                                      document.getElementById("movie125").innerHTML=xmlHttp.responseText;
                                      }   
                                      }
                                       function showMovie105(str){
                                      if (typeof XMLHttpRequest != "undefined"){
                                      xmlHttp= new XMLHttpRequest();
                                      }
                                      else if (window.ActiveXObject){
                                      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                                      }
                                      if (xmlHttp==null){
                                      alert("Browser does not support XMLHTTP Request");
                                      return;
                                      } 
                                      var url="report3.jsp";
                                      url +="?report1="+str;
                                      //alert(url);
                                      xmlHttp.onreadystatechange = stateChange105;
                                      xmlHttp.open("GET", url, true);
                                      xmlHttp.send(null);
                                      }

                                      function stateChange105(){   
                                      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
                                      document.getElementById("movie104").innerHTML=xmlHttp.responseText; 
                                      }   
                                      }
   
      </script>
<!-- Script code for all onchange buttons close -->
<!--collections Script starts -->
<script language="javascript">
               
   function sum(){
	      var a = document.getElementById('txt1').value;
	      var b = document.getElementById('txt2').value;
	      var c = document.getElementById('txt3').value;
	      var d = document.getElementById('txt4').value;
	      var e = document.getElementById('txt5').value;
	      var f = document.getElementById('txt6').value;
	      var audiencemorning = document.getElementById('txt11').value;
	      var audiencematinee = document.getElementById('txt12').value;
	      var audiencefirst = document.getElementById('txt13').value;
	      var audiencesecond = document.getElementById('txt14').value;
	      var audiencebenifit = document.getElementById('txt15').value;
	      var audiencespecial = document.getElementById('txt16').value;
	      var todayshows=0;
	      if ((a!="" &a!=""&document.getElementById("txt1").value.trim()!= "")||(audiencemorning!=""&audiencemorning!="0" &document.getElementById("txt11").value.trim()!= ""))
          {
	    	  todayshows++;  
          }
	      if ((b!="" &b!="0"&document.getElementById('txt2').value.trim()!= "")||(audiencematinee!="" &audiencematinee!="0"&document.getElementById('txt12').value.trim()!= ""))
          {
	    	  todayshows++;  
          } 
	        if ((c!=""&c!="0" &document.getElementById('txt3').value.trim()!= "")||(audiencefirst!="" &audiencefirst!="0"&document.getElementById('txt13').value.trim()!= ""))
          {
	    	  todayshows++;  
          }  
	          if ((d!="" &d!="0" &document.getElementById('txt4').value.trim()!= "")||(audiencesecond!=""&audiencesecond!="0"&document.getElementById('txt14').value.trim()!= ""))
	          {
		    	  todayshows++;  
	          }  
	         if ((e!=""&e!="0"  &document.getElementById('txt5').value.trim()!= "")||(audiencebenifit!="" &audiencebenifit!="0"&document.getElementById('txt15').value.trim()!= ""))
	          {
		    	  todayshows++;  
	          }   
	        if ((f!=""&f!="0" &document.getElementById('txt6').value.trim()!= "")||(audiencespecial!=""&audiencespecial!="0" &document.getElementById('txt16').value.trim()!= ""))
	          {
		    	  todayshows++;  
	          }   
	  //alert(todayshows);
	  if (!isNaN(todayshows)) {

	         document.getElementById('todayshows').value = todayshows;
	          }
	  
     	if (a=="")
			a=0;
		if (b=="")
			b=0;
		if (c=="")
			c=0;
		if (d=="")
			d=0;
		if (e=="")
			e=0;
		if (f=="")
			f=0;
     
        if (audiencemorning=="")
	    	  audiencemorning=0;
			if (audiencematinee=="")
				audiencematinee=0;
			if (audiencefirst=="")
				audiencefirst=0;
			if (audiencesecond=="")
				audiencesecond=0;
			if (audiencebenifit=="")
				audiencebenifit=0;
			if (audiencespecial=="")
				audiencespecial=0;
	      var result = parseInt(audiencemorning) + parseInt(audiencematinee) + parseInt(audiencefirst) + parseInt(audiencesecond) + parseInt(audiencebenifit) + parseInt(audiencespecial);

	      if (!isNaN(result)) {

	         document.getElementById('todayaudiance').value = result;
	          }
	      var result = parseFloat(a) + parseFloat(b)+ parseFloat(c)+ parseFloat(d)+ parseFloat(e)+ parseFloat(f);

	      if (!isNaN(result)) {

	         document.getElementById('todaygross').value = result;
	          }
	      }

        </script>
<script>
   function assingText()
    {
     var className = document.getElementById("classnId").value;
     if(className != "select")//check if it is not the select
     {
        document.getElementById("rollNoId").innerHTML = className;
     }
     else
     {
        document.getElementById("rollNoId").innerHTML = ""; //it clears the value if present
     }
    }  
   function assingText1()
   {
    var className = document.getElementById("classnId1").value;
    if(className != "select")//check if it is not the select
    {
       document.getElementById("rollNoId1").innerHTML = className;
    }
    else
    {
       document.getElementById("rollNoId1").innerHTML = ""; //it clears the value if present
    }
   }  
   function assingText2()
   {
    var className = document.getElementById("classnId2").value;
    if(className != "select")//check if it is not the select
    {
       document.getElementById("rollNoId2").innerHTML = className;
    }
    else
    {
       document.getElementById("rollNoId2").innerHTML = ""; //it clears the value if present
    }
   }  
</script>

<script type="text/javascript">
	function date(){
		//alert(document.getElementById('date1').value);
		var Date1=document.getElementById('date1').value;
		//alert(document.getElementById('date1').value);
		var Date2=document.getElementById('date2').value;
		//alert(document.getElementById('date2').value);
		var d = new Date(date);
		  return [d.getDate(), d.getMonth()+1, d.getFullYear()].join('/');
		var Days = Date1.split(" ");
		alert(document.getElementById('date1').value);
			//var Date1 = new Date (2008, 7, 25);
		//var Date2 = new Date (2009, 0, 12);
		var Days = Math.floor((Date2.getTime() - Date1.getTime())/(1000*60*60*24));
		if (!isNaN(Days)) {

	         document.getElementById('Days').value =Days ;
	          }		
	}
	window.onload=date;
	
        </script>
<script language="javascript" type="text/javascript">  
     var xmlHttp;  
     var xmlHttp;
     function showDate12345(str){
     if (typeof XMLHttpRequest != "undefined"){
     xmlHttp= new XMLHttpRequest();
     }
     else if (window.ActiveXObject){
     xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
     }
     if (xmlHttp==null){
     alert("Browser does not support XMLHTTP Request");
     return;
     } 
    
    
     var url="collectiondate.jsp";
     var res = str.split("_");
     var str1=res[0];
     url +="?movie=" +str1;
     //alert("date"+url);
     xmlHttp.onreadystatechange = stateChange;
     xmlHttp.open("GET", url, true);
     xmlHttp.send(null);
     }

     function stateChange(){   
   	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){    
     document.getElementById("date12345").innerHTML=xmlHttp.responseText;   
     }   
     }

     function showTheator12345(str){
         if (typeof XMLHttpRequest != "undefined"){
           xmlHttp= new XMLHttpRequest();
           }
         else if (window.ActiveXObject){
           xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
           }
         if (xmlHttp==null){
         alert("Browser does not support XMLHTTP Request")
         return;
         } 
         
         
         var url="collectiontheator.jsp";
         var res = str.split("_");
         var str1=res[0];
         //document.getElementById("theatoridshow").value =slab;
        // alert("date"+res[1]);
         url +="?movie=" +str1+"&date="+res[1];
         
         xmlHttp.onreadystatechange = stateChange1;
         xmlHttp.open("GET", url, true);
         xmlHttp.send(null);
         }
         function stateChange1(){   
       	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
         document.getElementById("theator12345").innerHTML=xmlHttp.responseText   
         }   
         }
         
         function showCenter12345(str){
             if (typeof XMLHttpRequest != "undefined"){
               xmlHttp= new XMLHttpRequest();
               }
             else if (window.ActiveXObject){
               xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
               }
             if (xmlHttp==null){
             alert("Browser does not support XMLHTTP Request")
             return;
             } 
             var url="collectioncenter.jsp";
             var res = str.split("_");
             var str1=res[0];
             var tname=res[1];
             /* deductions start */
             document.getElementById("theatoridshow").value =str1;
             var slab=res[3];
            var showTax=res[4];
           var batta=res[5];
           var od=res[8];
           var fc=res[17];
             document.getElementById("slab").value =slab;
             document.getElementById("showTax").value =showTax;
             document.getElementById("batta").value =batta;
            document.getElementById("mc").value =fc;
            document.getElementById("od").value =od;
            document.getElementById("alldeductions").value =parseFloat(fc)+parseFloat(batta)+parseFloat(showTax)+parseFloat(slab);
            document.getElementById("todayexhibitorshare").value=res[6];
            document.getElementById("todaydistributorshare").value=res[7];
            document.getElementById("allvalues").value =str;
            /* deductions end */
          
             url +="?movie=" +str1;
            // alert("theatre"+url);
             xmlHttp.onreadystatechange = stateChange2;
             xmlHttp.open("GET", url, true);
             xmlHttp.send(null);
             }
             function stateChange2(){   
           	  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
             document.getElementById("center12345").innerHTML=xmlHttp.responseText;   
             }   
             }  
             function CentershowDistrict(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="CentershowDistrict.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changeCentershowDistrict;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changeCentershowDistrict(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("districtName1").innerHTML=xmlHttp.responseText;
                 }   
                 }
             
             
             function tshowDistrict(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="tshowDistrict.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changetShowDistrict;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changetShowDistrict(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("tdistrictName").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function tshowCenter(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="tshowCenter.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changetshowCenter;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changetshowCenter(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("centerName1").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function mapshowDistrict(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="tshowDistrict.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changemapShowDistrict;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changemapShowDistrict(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("maptdistrictName").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function mapshowCenter(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="tshowCenter.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changemapshowCenter;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changemapshowCenter(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("mapcenterName1").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function mappingTheator(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="mappingTheator.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changetshowCenter;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changemappingTheator(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("mappingcenterName1").innerHTML=xmlHttp.responseText;
                 }   
                 }
             
             function showMovieSdate(str){
                 
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="showMovieSdate.jsp";
                 url +="?mname=" +str;
                 //alert(url);
                 xmlHttp.onreadystatechange = stateChangeMovieStart;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function stateChangeMovieStart(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("sdate").innerHTML=xmlHttp.responseText;
                 }   
                 }
function showMovieEdate(str){
                 
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="showMovieEdate.jsp";
                 url +="?mname=" +str;
                 //alert(url);
                 xmlHttp.onreadystatechange = ChangeshowMovieEdate;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function ChangeshowMovieEdate(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("edate").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function showTheaterSdate(str){
                 
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="showTheaterSdate.jsp";
                 url +="?mname=" +str;
                 //alert(url);
                 xmlHttp.onreadystatechange = stateChangeTheaterStart;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function stateChangeTheaterStart(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("da1").innerHTML=xmlHttp.responseText;
                 }   
                 }
function showTheaterEdate(str){
                 
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="showTheaterEdate.jsp";
                 url +="?mname=" +str;
                 //alert(url);
                 xmlHttp.onreadystatechange = ChangeshowTheaterEdate;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function ChangeshowTheaterEdate(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("dat1").innerHTML=xmlHttp.responseText;
                 }   
                 }
//reports selection

 function dtdrshowDistrict(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="dtdrShowDistrict.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changedtdrShowDistrict;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changedtdrShowDistrict(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("dtdrtdistrictName").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function dtdrshowCenter(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="dtdrShowCenter.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changedtdrshowCenter;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changedtdrshowCenter(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("dtdrcenterName1").innerHTML=xmlHttp.responseText;
                 }   
                 }
             function dtdrShowTheator(str){
                 if (typeof XMLHttpRequest != "undefined"){
                 xmlHttp= new XMLHttpRequest();
                 }
                 else if (window.ActiveXObject){
                 xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
                 }
                 if (xmlHttp==null){
                 alert("Browser does not support XMLHTTP Request");
                 return;
                 } 
                 var url="dtdrShowTheator.jsp";
                 url +="?mname=" +str;
                 xmlHttp.onreadystatechange = changedtdrTheator;
                 xmlHttp.open("GET", url, true);
                 xmlHttp.send(null);
                 }
             function changedtdrTheator(){   
                 if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
               	  document.getElementById("dtdrtid").innerHTML=xmlHttp.responseText;
                 }   
                 }
             
        </script>