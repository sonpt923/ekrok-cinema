package com.example.notificationservice.service.impl;

import com.example.exception.ValidationException;
import com.example.notificationservice.dto.request.MailRequest;
import com.example.notificationservice.model.MailTemplate;
import com.example.notificationservice.repository.MailTemplateRepository;
import com.example.notificationservice.repository.customize.MailTemplateRepositoryCustom;
import com.example.notificationservice.service.MailService;
import com.example.service.MydictionaryService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailTemplateRepository mailTemplateRepository;

    @Autowired
    private MailTemplateRepositoryCustom mailTemplateRepositoryCustom;

    @Autowired
    private MydictionaryService dictionaryService;

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
        String code = request.getCode();
        if (StringUtil.stringIsNullOrEmty(code)) {
            code = StringUtil.generateString(9); // TODO: them ham gen code tu template
        }
        validateCreate(request);
        request.setCode(code);
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

    private void validateCreate(MailTemplate template) {
        if (StringUtil.stringIsNullOrEmty(template.getSubject())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, dictionaryService.get("ERROR_NOT_NULL"));
        }

        if (StringUtil.stringIsNullOrEmty(template.getContent())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, dictionaryService.get("ERROR_NOT_NULL"));
        }

        if (StringUtil.stringIsNullOrEmty(template.getSendType()) ||
                template.getSendType() > 2 || template.getSendType() < -1) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, dictionaryService.get("ERROR_NOT_NULL"));
        }

        if (StringUtil.stringIsNullOrEmty(template.getDescription())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, dictionaryService.get("ERROR_NOT_NULL"));
        }

        if (StringUtil.stringIsNullOrEmty(template.getActive())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, dictionaryService.get("ERROR_NOT_NULL"));
        }
    }
}
