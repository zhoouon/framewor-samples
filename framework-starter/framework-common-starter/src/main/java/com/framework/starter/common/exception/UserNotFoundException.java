package com.framework.starter.common.exception;

import java.io.Serial;

/**
 * 客户端异常
 */
public class UserNotFoundException extends ClientException {

    @Serial
    private static final long serialVersionUID = -5653832166622573877L;

    /**
     * Constructs a <code>UsernameNotFoundException</code>
     */
    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
