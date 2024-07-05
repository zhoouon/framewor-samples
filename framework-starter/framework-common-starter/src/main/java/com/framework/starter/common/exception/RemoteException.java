package com.framework.starter.common.exception;

import java.io.Serial;

/**
 * 远程调用异常
 */
public class RemoteException extends AbstractException {

    @Serial
    private static final long serialVersionUID = -3095639653937569308L;

    public RemoteException() {
        super(ErrorCode.REMOTE_ERROR, null, null);
    }

    public RemoteException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage(), null);
    }

    public RemoteException(ErrorCode errorCode, String message, Throwable throwable) {
        super(errorCode, message, throwable);
    }

    public RemoteException(String code, String message) {
        super(code, message, null);
    }
}
