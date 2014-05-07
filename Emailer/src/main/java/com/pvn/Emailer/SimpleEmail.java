package com.pvn.Emailer;

import java.util.Properties;

import javax.mail.Session;
 
public class SimpleEmail {
     
    public static void main(String[] args) {
         
        System.out.println("SimpleEmail Start");
         
        String smtpHostServer = "openrelay.com"; //Some Open Relay you know which doesn't require any authentication
        String toEmail = "praveen.akinapally@emc.com";
         
        Properties props = System.getProperties();
 
        props.put("mail.smtp.host", smtpHostServer);
 
        Session session = Session.getInstance(props, null);
         
        EmailUtil.sendEmail(session, toEmail,"Hi Praveen", "SimpleEmail Testing Body");
    }
 
}