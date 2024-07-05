package com.framework.starter.common.exception;

import java.io.Serial;

/**
 * 客户端异常
 */
public class ClientException extends AbstractException {

    @Serial
    private static final long serialVersionUID = 2792869211011068994L;

    public ClientException(String message) {
        this(ErrorCode.CLIENT_ERROR, message, null);
    }

    public ClientException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage(), null);
    }

    public ClientException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public ClientException(ErrorCode errorCode, String message, Throwable throwable) {
        super(errorCode, message, throwable);
    }
}
