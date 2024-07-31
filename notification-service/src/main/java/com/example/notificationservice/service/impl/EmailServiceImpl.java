package com.example.notificationservice.service.impl;

import com.example.notificationservice.dto.request.EmailRequest;
import com.example.notificationservice.model.EmailTemplate;
import com.example.notificationservice.repository.EmailTemplateRepository;
import com.example.notificationservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailTemplateRepository emailRepository;

    @Override
    public Object getTemplate(EmailRequest request) {
        return emailRepository.findByCode(request.getCode());
    }

    @Override
    public Object getTemplates(EmailRequest request) {
        return null;
    }

    @Override
    public Object createTemplate(EmailTemplate request) {
        return emailRepository.save(request);
    }

    @Override
    public Object updateTemplate(EmailRequest request) {
        return null;
    }

    @Override
    public Object deleteTemplate(EmailRequest request) {
        return null;
    }
}
