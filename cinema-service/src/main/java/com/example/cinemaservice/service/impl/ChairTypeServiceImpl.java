package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.ChairType;
import com.example.cinemaservice.repository.ChairTypeRepository;
import com.example.cinemaservice.service.ChairTypeService;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChairTypeServiceImpl implements ChairTypeService {

    @Autowired
    private ChairTypeRepository chairTypeRepository;

    @Autowired
    private MydictionaryService dictionary;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Object createChairType(ChairType chairType) {
        validateChairType(chairType);
        return null;
    }

    @Override
    public Object updatechairType(ChairType chairType) {
        validateChairType(chairType);
        return null;
    }

    public void validateChairType(ChairType chairType) {

        if (StringUtil.stringIsNullOrEmty(chairType.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "name")));
        }

        if (StringUtil.stringIsNullOrEmty(chairType.getPrice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "price")));
        }

        if (StringUtil.stringIsNullOrEmty(chairType.getCode())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "code")));
        }

    }
}
