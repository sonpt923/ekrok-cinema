package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.RoomType;
import com.example.cinemaservice.repository.RoomTypeRepository;
import com.example.cinemaservice.service.RoomTypeService;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    private MydictionaryService dictionary;

    @Override
    public Object createRoomType(RoomType roomType) {
        validateRoomType(roomType);

        return null;
    }

    @Override
    public Object updateRoomType(RoomType roomType) {
        validateRoomType(roomType);
        return null;
    }

    @Override
    public Object getRoomTypeById(long id) {
        return null;
    }

    public void validateRoomType(RoomType roomType) {

        if (StringUtil.stringIsNullOrEmty(roomType.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "name")));
        }

        if (StringUtil.stringIsNullOrEmty(roomType.getPrice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "price")));
        }

        if (StringUtil.stringIsNullOrEmty(roomType.getImage())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "image")));
        }

        if (StringUtil.stringIsNullOrEmty(roomType.getTrailer())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "trailer")));
        }

    }
}
