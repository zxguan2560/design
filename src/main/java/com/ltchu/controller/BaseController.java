package com.ltchu.controller;

import com.ltchu.model.BaseResponse;
import org.springframework.http.HttpStatus;

public class BaseController {

    public BaseResponse sendFailMsg(String msg) {
        return BaseResponse.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public BaseResponse sendSuccessMsg(String msg) {
        return BaseResponse.success(msg);
    }
}
