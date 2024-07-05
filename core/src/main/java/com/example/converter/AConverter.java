package com.example.converter;

import com.example.dto.AItemDTO;
import com.example.exception.SystemException;
import com.example.model.AItemModel;
import com.example.utils.StringUtil;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.stream.Collectors;

public interface AConverter<DTO extends AItemDTO, MODEL extends AItemModel> {

    MODEL convertDTO2MODEL(DTO source);

    DTO convertMODEL2DTO(MODEL source);

    default List<MODEL> convertListDTO2MODEL(List<DTO> source) {
        if (!StringUtil.isListEmpty(source)) {
            List<MODEL> target = source.stream().map(this::convertDTO2MODEL).collect(Collectors.toList());
            return target;
        } else {
            throw new SystemException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                    "Occur error when convert data from " + DTO.BASIC_NAME + " to " + MODEL.BASIC_NAME + "!!!");
        }
    }

    default List<DTO> convertListMODEL2DTO(List<MODEL> source) {
        if (!StringUtil.isListEmpty(source)) {
            List<DTO> target = source.stream().map(this::convertMODEL2DTO).collect(Collectors.toList());
            return target;
        } else {
            throw new SystemException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                    "Occur error when convert data from " + MODEL.BASIC_NAME + " to " + DTO.BASIC_NAME + "!!!");
        }
    }
}
