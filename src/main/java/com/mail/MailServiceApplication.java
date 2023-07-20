package com.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mail.util.MailUtil;

@SpringBootApplication
public class MailServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MailServiceApplication.class, args);
		MailUtil mailUtil = ctx.getBean(MailUtil.class);
		String to="dhanurjayaj15@gamil.com";
		String sub="Test mail";
		String body="This mail is sent from Springboot application ";
		
		Boolean isSent = mailUtil.sentMail(to, sub, body);
		System.out.println("Email Sent :: -> "+isSent);
		
	}

}
