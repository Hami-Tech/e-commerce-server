package com.hmaitech.onlineshop.model.dto;

public class BaseAbstractResponse<T> {

    private String errorMessage;

    private T result;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
