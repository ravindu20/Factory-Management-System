/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Nishlanka
 */
public class SendMail {
     private String user = "nishlankaperera@gmail.com";
    private String password = "62319400";

    
    

    public SendMail(String to, String title, String msg){
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
	p.put("mail.smtp.starttls.enable", "true");
	p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");

    
        Session session = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(user, password);
            }
        });
        try{
            Message messge = new MimeMessage(session);
            messge.setFrom(new InternetAddress("noreply@gmail.com"));
            messge.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            messge.setSubject(title);
            messge.setText(msg);
            Transport.send(messge);
            System.out.println("Success");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
   }
}

    

