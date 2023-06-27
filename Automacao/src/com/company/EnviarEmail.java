package com.company;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.security.MessageDigest;
import java.util.Properties;

public class EnviarEmail {

    public static void main (String[] args) {

        Properties props = new Properties();

        //Parametros de conexão com o servidor
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication("seuemail@gmail.com",
                                "suasenha123");
                    }
                });

        session.setDebug(true);



    try {


        Message message = new MimeMessage(session);


    }catch (MessagingException e){
        throw new RuntimeException(e);

    }

//        SimpleEmail email = new SimpleEmail();
//        email.setHostName("smtp.gmail.com");
//        email.setSmtpPort(465);
//        email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhasSenha));
//        email.setSSLOnConnect(true);
//
//        System.out.println("conectado com sucesso");
//
//        try {
//            email.setFrom(meuEmail);
//            email.setSubject("Teste para meu email");
//            email.setMsg("Olá seu codigo foi enviado com sucesso");
//            email.addTo(meuEmail);
//            email.send();
//            System.out.println("E-mail enviado com sucesso");
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }


}
