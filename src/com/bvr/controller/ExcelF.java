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
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import com.bvr.driverconnection.ConnectionProvider;

/**
 * Servlet implementation class ExcelFile1
 */
public class ExcelF extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcelF() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			 Connection con = ConnectionProvider.getConnection(); 
			  String bb=request.getParameter("sdate");
			String bb1=request.getParameter("edate");
			String bb2=request.getParameter("mname");
			 PreparedStatement pstmt;
			 ResultSet rs;
			 pstmt = con.prepareStatement("Select * from collection  WHERE da BETWEEN ? AND ? && mname=?"); 
			pstmt.setString(1,bb);   
			pstmt.setString(2,bb1);
			pstmt.setString(3,bb2);
			//pstmt.setString(4,bb3);
			 rs = pstmt.executeQuery(); 
			HSSFWorkbook wb = new HSSFWorkbook();
			//create a new worksheet  
			HSSFSheet worksheet1 = wb.createSheet("Excel Sheet");  
			//HSSFSheet sheet = wb.createSheet("Excel Sheet"); 
			worksheet1.setColumnWidth((short)0,(short)10000);  
			  
			  
			//create rows .. row index starts at zero  
			//use the sheet object to create a row in that sheet.  
			HSSFRow row1 = worksheet1.createRow(0);  
			  
			row1.setHeight((short)2000);  
			  
			//create cells on those rows.  
			//HSSFCell cell1 = row1.createCell((short)0);  
			  
			//create a cell style  
			HSSFCellStyle style1 = wb.createCellStyle();  
			  
			//set cell width and height  
			  
			//apply background color to the cell  
			style1.setFillBackgroundColor(HSSFColor.YELLOW.index);  
			  
			//apply pattern to the background fill  
			style1.setFillPattern(HSSFCellStyle.DIAMONDS);  
			  
			//apply fore ground color to the cell  
			//style1.setFillForegroundColor(HSSFColor.VIOLET.index);  
			  
			//apply alignment to the cell  
			style1.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
			  
			//create a font  
			HSSFFont font1 = wb.createFont();  
			  
			//apply color to the font  
			font1.setColor(HSSFFont.COLOR_NORMAL);  
			  
			//set font size  
			//font1.setFontHeight((short)76);//not exact point as in excel .. please dont use it  
			font1.setFontHeightInPoints((short)76);  
			//set this font in style  
			style1.setFont(font1);  
			  
			//create cells on those rows.  
			HSSFCell cell1 = row1.createCell((short)5);  
			  
			//set style to the cell  
			cell1.setCellStyle(style1);  
			  
			//POPULATE THE CELL  
			cell1.setCellValue("HAI");  
		
			HSSFRow rowhead =  worksheet1.createRow((short)0);
			rowhead.createCell((short) 0).setCellValue("collectionId");
			rowhead.createCell((short) 1).setCellValue("tname");
			rowhead.createCell((short) 2).setCellValue("cname");
			rowhead.createCell((short) 3).setCellValue("mname");
			rowhead.createCell((short) 4).setCellValue("da");
			rowhead.createCell((short) 5).setCellValue("collectionmorning");
			rowhead.createCell((short) 6).setCellValue("collectionmatinee");
			rowhead.createCell((short) 7).setCellValue("collectionfirst");
			rowhead.createCell((short) 8).setCellValue("collectionsecond");
			rowhead.createCell((short) 9).setCellValue("collectionspecial");
			rowhead.createCell((short)10).setCellValue("totalaudiance");
			rowhead.createCell((short) 11).setCellValue("totalgross");
			rowhead.createCell((short) 12).setCellValue("Total Deductions");
			rowhead.createCell((short) 13).setCellValue("Profit/Loss");
			int index=1;
			while(rs.next()){
			HSSFRow row =  worksheet1.createRow((short)index);
			row.createCell((short)0).setCellValue(rs.getInt("collectionId"));
			row.createCell((short)1).setCellValue(rs.getString("tname"));
			row.createCell((short)2).setCellValue(rs.getString("cname"));
			row.createCell((short)3).setCellValue(rs.getString("mname"));
			row.createCell((short)4).setCellValue(rs.getString("da"));
			row.createCell((short)5).setCellValue(rs.getFloat("collectionmorning"));
			row.createCell((short)6).setCellValue(rs.getFloat("collectionmatinee"));
			row.createCell((short)7).setCellValue(rs.getFloat("collectionfirst"));
			row.createCell((short)8).setCellValue(rs.getFloat("collectionsecond"));
			row.createCell((short) 9).setCellValue(rs.getFloat("collectionspecial"));
			row.createCell((short)10).setCellValue(rs.getFloat("totalaudiance"));
			row.createCell((short)11).setCellValue(rs.getFloat("totalgross"));
			double totalnet=rs.getFloat("totalgross")
					-rs.getFloat("totaldistributorshare")
					-rs.getFloat("totalexhibitorshare")
					-rs.getFloat("slab")
					-rs.getFloat("showTax")
					-rs.getFloat("batta")
					-rs.getFloat("od")
					-rs.getFloat("mc")
					-rs.getFloat("termtype");
			double totaldeductions=rs.getFloat("totaldistributorshare")
					+rs.getFloat("totalexhibitorshare")
					+rs.getFloat("slab")
					+rs.getFloat("showTax")
					+rs.getFloat("batta")
					+rs.getFloat("od")
					+rs.getFloat("mc")
					+rs.getFloat("termtype");
			row.createCell((short) 12).setCellValue(totaldeductions);
			row.createCell((short) 13).setCellValue(totalnet);
			index++;
			}
				 Random randomGenerator = new Random();
			      int randomInt = randomGenerator.nextInt();
			FileOutputStream fileOut = new FileOutputStream("F:\\"+request.getParameter("mname")+"Movie Day To Day Report"+randomInt+".xls");
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
			     DataSource source =  new FileDataSource("F:\\"+request.getParameter("mname")+"Movie Day To Day Report"+randomInt+".xls"); // your file
			     msg.setDataHandler( new DataHandler(source));
			     msg.setFileName("F:\\"+request.getParameter("mname")+"Movie Day To Day Report"+randomInt+".xls");
                 msg.setSentDate(new Date());
			     Transport.send(msg);
			     System.out.println("Message sent.");
			  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
			fileOut.close();
			rs.close();
			con.close();
			/*request.setAttribute("bb", bb);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/report.jsp");
			dispatcher.forward( request, response );
			*/
			response.sendRedirect("report.jsp?bb="+bb+","+bb1+","+bb2);
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
