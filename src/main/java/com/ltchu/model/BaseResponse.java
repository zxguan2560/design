package com.ltchu.model;

import org.springframework.http.HttpStatus;

public class BaseResponse<T> {

    private int code;

    private String msg;

    private T t;

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(int code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.t = t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> BaseResponse<T> success(String msg) {
        return new BaseResponse<T>(HttpStatus.OK.value(), msg);
    }

    public static <T> BaseResponse<T> success(String msg, T t) {
        return new BaseResponse<T>(HttpStatus.OK.value(), msg, t);
    }

    public static <T> BaseResponse<T> fail(int code, String msg) {
        return new BaseResponse<T>(code, msg);
    }


}
