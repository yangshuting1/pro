package com.sugar.demo.common;

public enum ErrorCodeEnum {
    SUCCESS(10001, "成功"),
    FAIL(10002,"失败");

    private int code;
    private String msg;

    ErrorCodeEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
