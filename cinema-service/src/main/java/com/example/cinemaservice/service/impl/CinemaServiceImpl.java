package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.dto.request.CinemaRequest;
import com.example.cinemaservice.entity.Cinema;
import com.example.cinemaservice.repository.CinemaRepository;
import com.example.cinemaservice.service.CinemaService;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MydictionaryService dictionary;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    @Transactional
    public Object createCinema(CinemaRequest request) {
        validateCreateCinema(request);
        return null;
    }

    @Override
    @Transactional
    public Object updateCinema(CinemaRequest request) {
        validateUpdateCinema(request);
        return null;
    }

    private void validateCreateCinema(CinemaRequest request) {

        if (StringUtil.stringIsNullOrEmty(request.getAddress())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "address")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "name")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getPronvice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "name")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getPrice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "price")));
        }
    }

    private void validateUpdateCinema(CinemaRequest request) {

    }
}
