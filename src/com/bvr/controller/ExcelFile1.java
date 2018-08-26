package com.bvr.controller;





import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.bvr.driverconnection.ConnectionProvider;



/**
 * Servlet implementation class ExcelFile1
 */
public class ExcelFile1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private static String StateRecord = "/allinone.jsp";  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcelFile1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result="allinone.jsp";
		try{
			//mailing code
			final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
			Properties props = System.getProperties();
		     props.setProperty("mail.smtp.host", "smtp.gmail.com");
		     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		     props.setProperty("mail.smtp.socketFactory.fallback", "false");
		     props.setProperty("mail.smtp.port", "465");
		     props.setProperty("mail.smtp.socketFactory.port", "465");
		     props.put("mail.smtp.auth", "true");
		     props.put("mail.debug", "true");
		     props.put("mail.store.protocol", "pop3");
		     props.put("mail.transport.protocol", "smtp");
		     final String username = "ramu.d513@gmail.com";//
		     final String password = "917756739";
			//mail code closed
			String redirect="";   
			Connection con = ConnectionProvider.getConnection(); 
			 String bb=request.getParameter("da");
			 System.out.println(bb);
			 String bb1=request.getParameter("theator");
			 System.out.println(bb1);
			 String[] ss = bb.split("-");
			 String name=ss[1];
			 
			 PreparedStatement pstmt;
			 ResultSet rs;
			 pstmt = con.prepareStatement(
			   "SELECT * FROM collection WHERE month(da)=? and tname=?"); 
			 pstmt.setString(1,name);
			 pstmt.setString(2,bb1);

			 rs = pstmt.executeQuery();;

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("Excel Sheet");
			HSSFRow rowhead = sheet.createRow((short)0);
			rowhead.createCell((short) 0).setCellValue("collectionId");
			rowhead.createCell((short) 1).setCellValue("mname");
			rowhead.createCell((short) 2).setCellValue("totalaudiance");
			rowhead.createCell((short) 3).setCellValue("totalgross");
			rowhead.createCell((short) 4).setCellValue("collectionmorning");
			rowhead.createCell((short) 5).setCellValue("collectionmatinee");
			rowhead.createCell((short) 6).setCellValue("collectionfirst");
			rowhead.createCell((short) 7).setCellValue("collectionsecond");
			rowhead.createCell((short) 8).setCellValue("collectionspecial");
			
			
			
			int index=1;
			while(rs.next()){

			HSSFRow row = sheet.createRow((short)index);
			row.createCell((short)0).setCellValue(rs.getString("collectionId"));
			row.createCell((short)1).setCellValue(rs.getString("mname"));
			row.createCell((short)2).setCellValue(rs.getInt("totalaudiance"));
			row.createCell((short)3).setCellValue(rs.getFloat("totalgross"));
			row.createCell((short)4).setCellValue(rs.getFloat("collectionmorning"));
			row.createCell((short)5).setCellValue(rs.getFloat("collectionmatinee"));
			row.createCell((short)6).setCellValue(rs.getFloat("collectionfirst"));
			row.createCell((short)7).setCellValue(rs.getFloat("collectionsecond"));
			row.createCell((short)8).setCellValue(rs.getFloat("collectionspecial"));
			index++;
				
			}
			Random randomGenerator = new Random();
		      int randomInt = randomGenerator.nextInt();
	
			FileOutputStream fileOut = new FileOutputStream("F:\\"+request.getParameter("theator")+"TheatorMonthlyReport"+randomInt+".xls");
			wb.write(fileOut);
			try{
			     Session session = Session.getDefaultInstance(props, 
			                          new Authenticator(){
			                             protected PasswordAuthentication getPasswordAuthentication() {
			                                return new PasswordAuthentication(username, password);
			                             }});

			   // -- Create a new message --
			     Message msg = new MimeMessage(session);
			  // -- Set the FROM and TO fields --
			     msg.setFrom(new InternetAddress("ramu.d513@gmail.com"));
			     msg.setRecipients(Message.RecipientType.TO, 
			                      InternetAddress.parse("ramu.d513@gmail.com",false));
			     msg.setSubject("Please Check Your Movie Accounts");
			     DataSource source =  new FileDataSource("F:\\"+request.getParameter("theator")+"TheatorMonthlyReport"+randomInt+".xls"); // your file
			     msg.setDataHandler( new DataHandler(source));
			     msg.setFileName("F:\\"+request.getParameter("theator")+"TheatorMonthlyReport"+randomInt+".xls");
               msg.setSentDate(new Date());
			     Transport.send(msg);
			     System.out.println("Message sent.");
			  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
		
			fileOut.close();
			response.sendRedirect("./Distributor.jsp");  
			rs.close();
			con.close();
			
			}
			catch(Exception e){}
			
			
			
		}

			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
