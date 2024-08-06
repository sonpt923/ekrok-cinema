package com.example.maildelivery.service;

import com.example.maildelivery.dto.request.MailRequest;

public interface MailService {

    void sendOTP(MailRequest request);

    void sendBookingMail(MailRequest request);

}
