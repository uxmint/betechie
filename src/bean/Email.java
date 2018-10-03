package bean;

import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {

	public  int email(String E_Email_ID) {
		int status=0; 
		
		
		String to=E_Email_ID;
		String from = "sushmitha@uxmint.in";//change accordingly  
	    String host = "localhost";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	    	  MimeMessage message = new MimeMessage(session);  
	    	    message.setFrom(new InternetAddress(to));  
	    	    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	    	    message.setSubject("Message Aleart");  
	    	      
	    	    //3) create MimeBodyPart object and set your message text     
	    	    BodyPart messageBodyPart1 = new MimeBodyPart();  
	    	    messageBodyPart1.setText("This is message body");  
	    	      
	    	    //4) create new MimeBodyPart object and set DataHandler object to this object      
	    	    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
	    	  
	    	    String filename = "SendAttachment.java";//change accordingly  
	    	    DataSource source = new FileDataSource(filename);  
	    	    messageBodyPart2.setDataHandler(new DataHandler(source));  
	    	    messageBodyPart2.setFileName(filename);  
	    	     
	    	     
	    	    //5) create Multipart object and add MimeBodyPart objects to this object      
	    	    Multipart multipart = new MimeMultipart();  
	    	    multipart.addBodyPart(messageBodyPart1);  
	    	    multipart.addBodyPart(messageBodyPart2);  
	    	  
	    	    //6) set the multiplart object to the message object  
	    	    message.setContent(multipart );  
	    	     
	    	    //7) send message  
	    	    Transport.send(message);  
	    	   
	    	   System.out.println("message sent....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   
	return 0;
   }
}