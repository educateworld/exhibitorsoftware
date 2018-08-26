package com.bvr.bean;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Test {  
	public static void main(String[] args)throws Exception
	{
	 /*String dateReceivedFromUser = "12/13/2012";  
    DateFormat userDateFormat = new SimpleDateFormat("MM/dd/yyyy");  
     DateFormat dateFormatNeeded = new SimpleDateFormat("yyyy-mm-dd");  
    Date date = userDateFormat.parse(dateReceivedFromUser);  
     String convertedDate = dateFormatNeeded.format(date);
     System.out.println(convertedDate);*/
     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
     Date convertedCurrentDate = sdf.parse("2013-09-18");
     String date=sdf.format(convertedCurrentDate );
     System.out.println(date);


   // String convertedCurrentDate =sdf.format(sdf.parse("2013-09-18"));
	}
}
