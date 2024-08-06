package com.example.maildelivery.service.impl;

import com.example.maildelivery.dto.request.MailRequest;
import com.example.maildelivery.provider.MailProvider;
import com.example.maildelivery.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailProvider provider;

    @Override
    public void sendOTP(MailRequest request) {
        provider.sendMail(request.getTitle(), request.getContent(), request.getReciever());
    }

    @Override
    public void sendBookingMail(MailRequest request) {
        provider.sendMail(request.getTitle(), request.getContent(), request.getReciever());
    }


}
