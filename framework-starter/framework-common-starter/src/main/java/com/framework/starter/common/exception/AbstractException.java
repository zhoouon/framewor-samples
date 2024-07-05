package com.framework.starter.common.exception;

import lombok.Getter;

import java.io.Serial;
import java.util.Optional;

/**
 * AbstractException is the parent of all exceptions
 */
@Getter
public abstract class AbstractException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String code;
    private final String message;

    public AbstractException(ErrorCode errorCode, String message, Throwable throwable) {
        super(message, throwable);
        this.code = errorCode.getCode();
        this.message = Optional.ofNullable(message).orElse(errorCode.getMessage());
    }

    public AbstractException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
        this.message = message;
    }
}
