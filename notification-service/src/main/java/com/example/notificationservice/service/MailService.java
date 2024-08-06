package com.example.notificationservice.service;

import com.example.notificationservice.dto.request.MailRequest;
import com.example.notificationservice.model.MailTemplate;

public interface MailService {

    Object getTemplate(Long id);

    Object getTemplates(MailRequest request);

    Object createTemplate(MailTemplate request);

    Object updateTemplate(MailRequest request);

    Object deleteTemplate(MailRequest request);

    Object sendOTP(MailRequest request);

}
