package com.example.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

@Component
@Slf4j
public class MailProvider {

    @Value("${mail.smtp.port}")
    private Integer port;

    @Value("${mail.smtp.host}")
    private String host;

    @Value("${mail.smtp.username}")
    private String username;

    @Value("${mail.smtp.password}")
    private String password;

    @Value("${mail.smtp.sender}")
    private String sender;

    @Async
    public void sendMail(String title, String content, String receiver) {
        try {
            log.info("========== START SEND MAIL =========");
            log.info("Host: " + host);
            log.info("Port: " + port);
            log.info("User: " + username);
            log.info("Subject: " + title);
            log.info("Sender: " + sender);
            log.info("Receives: " + String.join(";", receiver));
            Properties props = new Properties();
            props.put("mail.smtp.host", host); //SMTP Host
            props.put("mail.smtp.port", port); //TLS Port
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

            //create Authenticator object to pass in Session.getInstance argument
            Authenticator auth = new Authenticator() {
                //override the getPasswordAuthentication method
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            };
            Session session = Session.getInstance(props, auth);
            MimeMessage msg = new MimeMessage(session);
            //set message headers
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));

            msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));

            msg.setSubject(title, "UTF-8");

            msg.setText(content, "UTF-8");

            msg.setSentDate(new Date());

            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver, false));
            Transport.send(msg);

            log.info("========== END SEND MAIL =========");
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
