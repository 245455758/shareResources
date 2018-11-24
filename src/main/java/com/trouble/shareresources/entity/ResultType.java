package com.trouble.shareresources.entity;

public class ResultType {

    private Boolean result;
    private String message;

    public ResultType() {
        super();
    }

    public ResultType(Boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
