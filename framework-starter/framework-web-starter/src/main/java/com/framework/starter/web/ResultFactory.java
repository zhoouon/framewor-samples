package com.framework.starter.web;

import com.framework.starter.common.exception.AbstractException;
import com.framework.starter.common.exception.ErrorCode;
import com.framework.starter.common.result.Result;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static com.framework.starter.common.result.Result.SUCCESS_CODE;
import static com.framework.starter.common.result.Result.SUCCESS_MESSAGE;

/**
 * @author jam
 * 公众号：JAVA日知录
 * Result 返回对象的封装工具类
 */
@Slf4j
public class ResultFactory {

    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setCode(SUCCESS_CODE)
                .setMessage(SUCCESS_MESSAGE)
                .setData(data)
                .setTimestamp(System.currentTimeMillis());

    }

    public static Result<Void> fail(String code, String message) {
        return sendError(code, message);
    }

    protected static Result<Void> fail(AbstractException abstractException) {
        String errorCode = Optional.ofNullable(abstractException.getCode())
                .orElse(ErrorCode.SERVICE_ERROR.getCode());
        String errorMessage = Optional.ofNullable(abstractException.getMessage())
                .orElse(ErrorCode.SERVICE_ERROR.getMessage());
        return sendError(errorCode, errorMessage);
    }

    public static Result<Void> fail(ErrorCode errorCode, String message) {
        return sendError(errorCode.getCode(), message);
    }

    /**
     * 向客户端发送带操作的信息
     */
    private static Result<Void> sendError(String code, String message) {
        return new Result<Void>()
                .setCode(code)
                .setMessage(message)
                .setTimestamp(System.currentTimeMillis());
    }

}
