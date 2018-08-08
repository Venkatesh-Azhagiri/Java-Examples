package mailVelocity;

import java.io.StringWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Email {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		String  server = "";
		int port = 0;
		final String usr = "";
		final String pwd = "";
		String from = "";
	
			 Properties props = new Properties();
			props.put("mail.smtp.host", "");
			props.put("mail.smtp.socketFactory.port", "");
			props.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "");
			

			Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(usr,pwd);
					}
				});
			try {
				JavaMailSenderImpl mail = new JavaMailSenderImpl();
				mail.setHost("smtp.gmail.com");
				mail.setPort(0);
				mail.setUsername(usr);
				mail.setPassword(pwd);
				 
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(""));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(""));
				message.setSubject("Testing Subject");
				VelocityEngine ve = new VelocityEngine();
				ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
				ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		        ve.init();
		        /*  next, get the Template  */
		        Template t = ve.getTemplate( "helloworld.vm" );
		        /*  create a context and add data */
		        VelocityContext context = new VelocityContext();
		        context.put("name", "");
		        /* now render the template into a StringWriter */
		        StringWriter writer = new StringWriter();
		        t.merge( context, writer );
				message.setText(writer.toString());

				Transport.send(message);

				System.out.println("Done");

			} catch (MessagingException e) {
				System.out.println("run time exception******");
				throw new RuntimeException(e);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

	

}
