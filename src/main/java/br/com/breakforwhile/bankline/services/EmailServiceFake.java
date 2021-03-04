package br.com.breakforwhile.bankline.services;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceFake implements EmailService{

    @Override
    public boolean send(String email, String message) {
        System.out.println(email);
        System.out.println(message);
        return true;
    }
}
