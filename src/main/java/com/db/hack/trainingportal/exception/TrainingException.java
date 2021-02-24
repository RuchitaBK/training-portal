package com.db.hack.trainingportal.exception;

import com.db.hack.trainingportal.exception.code.ErrorCode;

public class TrainingException extends RuntimeException {
    protected Throwable throwable;
    protected String errorMessage;
    protected ErrorCode errorCode;

    public TrainingException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }


    public TrainingException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public TrainingException(Throwable throwable, String errorMessage) {
        super(errorMessage, throwable);
        this.throwable = throwable;
        this.errorMessage = errorMessage;
    }

}
