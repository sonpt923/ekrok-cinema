package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.dto.request.RoomRequest;
import com.example.cinemaservice.entity.Room;
import com.example.cinemaservice.repository.RoomRepository;
import com.example.cinemaservice.service.ChairService;
import com.example.cinemaservice.service.RoomService;
import com.example.cinemaservice.utils.Constant;
import com.example.exception.ValidationException;
import com.example.service.MyDictionary;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private MyDictionary dictionary;

    @Autowired
    private ChairService chairService;

    @Override
    public Object updateRoom(RoomRequest request, String username) {
        String code = request.getCode();
        if (StringUtil.stringIsNullOrEmty(code)) {
            code = StringUtil.generateString(Constant.CODE_LENGTH);
        }
        validateRoom(request);
        Room room = Room.builder().code(code)
                .name(request.getName())
                .price(request.getPrice())
                .createdBy(username)
                .build();

        room = roomRepository.save(room);
        if (!StringUtil.stringIsNullOrEmty(room)) {
            chairService.createBatchChair(request.getChairs());
        }
        return null;
    }

    @Override
    @Transactional
    public Object createRoome(RoomRequest request, String username) {
        String code = request.getCode();
        if (StringUtil.stringIsNullOrEmty(code)) {
            code = StringUtil.generateString(Constant.CODE_LENGTH);
        }
        validateRoom(request);
        Room room = Room.builder().code(code)
                .name(request.getName())
                .price(request.getPrice())
                .createdBy(username)
                .build();

        room = roomRepository.save(room);
        if (!StringUtil.stringIsNullOrEmty(room)) {
            chairService.createBatchChair(request.getChairs());
        }
        return null;
    }

    @Override
    public Object getRoomByCondition(RoomRequest request, String username) {
        return null;
    }

    private void validateRoom(RoomRequest request) {

        if (StringUtil.stringIsNullOrEmty(request.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "room name")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getPrice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "price")));
        }

        if (StringUtil.isListEmpty(request.getChairs())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "list chair")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getRoomType())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get("ERROR.ERROR.FIELD_IS_REQUIRED", "room type")));
        }


        //TODO: kiem tra code, kiem tra id cua room type


    }
}
