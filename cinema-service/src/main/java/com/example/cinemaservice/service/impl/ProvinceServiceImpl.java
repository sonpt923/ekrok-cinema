package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.Province;
import com.example.cinemaservice.repository.ProvinceRepository;
import com.example.cinemaservice.service.ProvinceService;
import com.example.exception.ValidationException;
import com.example.service.MyDictionary;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private MyDictionary dictionary;


    @Override
    public Object createProvice(Province province) {
        validateProvice(province);
        return provinceRepository.save(province);
    }

    @Override
    public Object updateProvice(Province province) {
        validateProvice(province);
        return null;
    }

    private void validateProvice(Province province) {

        if (StringUtil.stringIsNullOrEmty(province.getCode())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "code")));
        }

        if (StringUtil.stringIsNullOrEmty(province.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "name")));
        }

    }
}
