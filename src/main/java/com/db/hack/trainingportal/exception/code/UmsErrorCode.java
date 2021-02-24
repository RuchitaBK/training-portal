package com.db.hack.trainingportal.exception.code;

public enum UmsErrorCode implements ErrorCode {

    INVALID_USER_REQUEST("Invalid user Request came", "UMS-1001"), GENERIC_EXCEPTION("Something went wrong. Please contact system admin if error persist ", "UMS-1008"),
    NO_DATA_FOUND("No data found for requested data", "UMS-1002"),INVALID_USER_CREDENTIALS("Invalid user credentials","UMS-1003");

    private String errorCode;
    private String errorMessage;

    private UmsErrorCode(String errorMessage,String errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.getErrorMessage();
    }

    public String getErrorCode() {
        return this.getErrorCode();
    }
}
