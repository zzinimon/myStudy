package myPackage;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendingEmail {
	public static void main(String[] args) {
		//MainOnly.java
	}
	static void send(String adress) {
		final String TO=adress;
		final String FROM="";
		final String FROMNAME="TATEMATE";
		final String SMTP_USERNAME="";
		final String SMTP_PASSWORD="";
		final String HOST="smtp.gmail.com";
		final int PORT=587;
		final String SUBJECT="****TEST(TITLE)****";
		final String BODY="test용 메일입니다.";
		
		Properties props=System.getProperties();
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.port",PORT);
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth","true");
		
		Authenticator auth=new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SMTP_USERNAME,SMTP_PASSWORD);
			}
		};
		
		Session session=Session.getInstance(props,auth);
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(FROM,FROMNAME));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
		msg.setSubject(SUBJECT);
		msg.setContent(BODY,"text/html;charset=utf-8");
		
		Transport transport=session.getTransport();
		try {
			System.out.println("Sending...");
			transport.connect(HOST, SMTP_USERNAME,SMTP_PASSWORD);
			transport.sendMessage(msg, msg.getAllRecipients());
			System.out.println("Email sent!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			transport.close();
		}
	}
	
}

}
