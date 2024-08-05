package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.dto.request.RoomRequest;
import com.example.cinemaservice.entity.Room;
import com.example.cinemaservice.repository.RoomRepository;
import com.example.cinemaservice.service.ChairService;
import com.example.cinemaservice.service.RoomService;
import com.example.cinemaservice.service.RoomTypeService;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private MydictionaryService dictionary;

    @Autowired
    private ChairService chairService;

    @Autowired
    private RoomTypeService roomTypeService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Object updateRoom(RoomRequest request) {
        String code = request.getCode();
//        if (StringUtil.stringIsNullOrEmty(code)) {
//            code = StringUtil.generateString(Constant.CODE_LENGTH);
//        }
        validateRoom(request);
        Room room = Room.builder().code(code)
                .name(request.getName())
                .price(request.getPrice())
                .build();

        room = roomRepository.save(room);
//        if (!StringUtil.stringIsNullOrEmty(room)) {
//            chairService.createBatchChair(request.getChairs());
//        }
        return null;
    }

    @Override
    @Transactional
    public Object createRoome(RoomRequest request) {
        String code = request.getCode();
//        if (StringUtil.stringIsNullOrEmty(code)) {
//            code = StringUtil.generateString(Constant.CODE_LENGTH);
//        }
        validateRoom(request);
        Room room = Room.builder().code(code)
                .name(request.getName())
                .price(request.getPrice())
                .build();

        room = roomRepository.save(room);
//        if (!StringUtil.stringIsNullOrEmty(room)) {
//            chairService.createBatchChair(request.getChairs());
//        }
        return null;
    }

    @Override
    public Object getRoomByCondition(RoomRequest request) {
        ListResponse<Object> listResponse = new ListResponse<>();
        StringBuilder sql = new StringBuilder();
        Map<String, Object> params = new HashMap<>();

        sql.append(" SELECT * FROM HELLO_WOLRD ");
        sql.append(" WHERE 1 = 1");

//        if (!StringUtil.stringIsNullOrEmty(request.getName())) {
//            sql.append(" s.hello = :helllo");
//            params.put("", request.getName());
//        }

        Query query = entityManager.createNativeQuery(sql.toString());
        params.forEach(query::setParameter);

        Object object = query.getResultList();

        sql.setLength(0);
        params.clear();

        sql.append(" SELECT COUNT(*) FROM HELLO_WOLRD");

        query = entityManager.createNativeQuery(sql.toString());
        params.forEach(query::setParameter);

        Integer totalRecord = ((Integer) query.getSingleResult()).intValue();

        listResponse.setListResponse((List<Object>) listResponse);
        listResponse.setTotalRecord(totalRecord);

        return listResponse;
    }

    @Override
    public Object getRoom(RoomRequest request) {
        return null;
    }

    private void validateRoom(RoomRequest request) {

        if (StringUtil.stringIsNullOrEmty(request.getName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "room name")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getPrice())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "price")));
        }

        if (StringUtil.isListEmpty(request.getChairs())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "list chair")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getRoomType())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.ERROR.FIELD_IS_REQUIRED", "room type")));
        }

        if (StringUtil.stringIsNullOrEmty(request.getStatus())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionary.get("ERROR.FIELD_IS_REQUIRED", "status")));
        }

        if (!StringUtil.stringIsNullOrEmty(roomTypeService.getRoomTypeById(request.getRoomType().getId()))) {
            throw new ValidationException(BaseConstants.ERROR_DATA_NOT_FOUND,
                    String.format(dictionary.get("ERROR.NOT_FOUND_DATA")));
        }
    }
}
