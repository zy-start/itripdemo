package com.itrip.beans.dto;

/**
 * 数据传输对象
 * @param <T>
 */
public class Dto<T> {

    private String success;//成功表示（true 成功，false 失败）
    private String errorCode;//错误码（没有错误是：0）
    private String msg;//消息提示
    private T data;//封装的数据

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
