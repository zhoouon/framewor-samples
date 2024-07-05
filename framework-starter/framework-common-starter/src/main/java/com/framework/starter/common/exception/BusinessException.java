/*
 * DailyMart is a microservice-based e-commerce project implemented
 * with Domain-Driven Design (DDD).
 * Copyright (C) 2023 Java日知录
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.framework.starter.common.exception;

import java.io.Serial;

/**
 * 内部服务异常
 */
public class BusinessException extends AbstractException {

    @Serial
    private static final long serialVersionUID = -4211441659856381357L;

    public BusinessException() {
        this(ErrorCode.SERVICE_ERROR, null, null);
    }

    public BusinessException(String message) {
        this(ErrorCode.SERVICE_ERROR, message, null);
    }

    public BusinessException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage(), null);
    }

    public BusinessException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public BusinessException(ErrorCode errorCode, String message, Throwable throwable) {
        super(errorCode, message, throwable);
    }
}
