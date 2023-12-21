package com.dday.common;

import lombok.Getter;

@Getter
public class ApiResponseDto {

    private int status;
    private String state;

    public ApiResponseDto(int httpStatus, String ok) {
        this.status = httpStatus;
        this.state = ok;
    }
}
