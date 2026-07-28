package com.example.springcore;

public class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Email sent successfully.");
    }

}