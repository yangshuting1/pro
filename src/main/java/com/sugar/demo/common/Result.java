package com.sugar.demo.common;


public class Result<T> {
    private int code;
    private String msg;
    private T data;

    //无法直接返回泛型，封装一个static 的内部类
    public static class Builder<T>{

        //添加属性
        private Result<T> result;

        //构造方法
        public Builder(){
            result = new Result<>();
        }

        //重写构造方法
        public Builder(T data){
            result = new Result<>();
            result.setData(data);
        }

        // 设置code
        public Builder<T> setCode(int code){
            result.setCode(code);
            //正确的会返回success,data.错误的会把mesage带出来
            if(ErrorCode.errorMessage.containsKey(code)){
                result.setMsg(ErrorCode.errorMessage.get(code));
            }
            return this;
        }

        public Builder<T> setData(T data){
            result.setData(data);
            return this;
        }

        public Builder<T> setMessage(String message) {
            result.setMsg(message);
            return this;
        }

        //返回的
        public Result<T> build() {
            return result;
        }
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
