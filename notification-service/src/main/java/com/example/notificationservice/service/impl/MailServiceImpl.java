package com.example.notificationservice.service.impl;

import com.example.notificationservice.dto.request.MailRequest;
import com.example.notificationservice.model.MailTemplate;
import com.example.notificationservice.repository.MailTemplateRepository;
import com.example.notificationservice.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailTemplateRepository mailTemplateRepository;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public Object getTemplate(Long id) {
        return mailTemplateRepository.findById(id);
    }

    @Override
    public Object getTemplates(MailRequest request) {
        return null;
    }

    @Override
    public Object createTemplate(MailTemplate request) {
        return mailTemplateRepository.save(request);
    }

    @Override
    public Object updateTemplate(MailRequest request) {
        return null;
    }

    @Override
    public Object deleteTemplate(MailRequest request) {
        return null;
    }

    @Override
    public Object sendOTP(MailRequest request) {
        kafkaTemplate.send("", "", "");
        return null;
    }
}
