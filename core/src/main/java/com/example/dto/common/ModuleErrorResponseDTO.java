package com.example.dto.common;

import com.example.utils.BaseConstants;
import lombok.Data;

@Data
public class ModuleErrorResponseDTO {

    private String message;
    private int code;
    private String checkPoint;

    public ModuleErrorResponseDTO(String message, int code) {
        this.message = message;
        this.code = code;
        this.checkPoint = BaseConstants.TEMPLE_SPLIT;
    }
}
