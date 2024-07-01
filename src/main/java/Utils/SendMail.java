package Utils;

import Entity.Mail;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void sendMail(Mail mail)  {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("cuden20101998@gmail.com","mazymdjlmeuafsub");
            }
        });
        Message m = new MimeMessage(session);
        try {
            m.setFrom(new InternetAddress(mail.getFrom()));
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(mail.getRecipient()));
            m.setSubject(mail.getSubject());
            m.setContent(mail.getContent(), mail.getType());
            Transport.send(m);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
