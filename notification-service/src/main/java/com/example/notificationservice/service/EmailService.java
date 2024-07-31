package com.example.notificationservice.service;

import com.example.notificationservice.dto.request.EmailRequest;
import com.example.notificationservice.model.EmailTemplate;

public interface EmailService {

    Object getTemplate(EmailRequest request);

    Object getTemplates(EmailRequest request);

    Object createTemplate(EmailTemplate request);

    Object updateTemplate(EmailRequest request);

    Object deleteTemplate(EmailRequest request);

}
