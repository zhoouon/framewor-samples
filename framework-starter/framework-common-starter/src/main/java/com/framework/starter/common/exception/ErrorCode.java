package com.framework.starter.common.exception;

/**
 * 系统内置错误码，返回错误信息必须要有对应的错误码。
 * 本系统将错误码分为ABC三类，其中A类对应客户端错误，B类对应系统内部错误，C类对应第三方接口调用错误
 */
public enum ErrorCode {

    OK("00000", "操作已成功"),

    CLIENT_ERROR("A0001", "客户端错误"),
    USER_NOT_FOUND("A0010", "用户不存在"),
    USER_ALREADY_EXISTS("A0011", "用户已存在"),
    USERNAME_PASSWORD_INCORRECT("A0012", "用户名或密码错误"),
    VERIFICATION_CODE_EXPIRED("A0013", "验证码已过期"),
    BAD_CREDENTIALS_EXPIRED("A0014", "用户认证异常"),

    SERVICE_ERROR("B0001", "系统内部错误"),
    SERVICE_TIMEOUT_ERROR("B0010", "系统执行超时"),
    INVENTORY_DUPLICATE_ERROR("B0011", "库存发生重复扣减"),
    JWT_PARSE_ERROR("B0012", "JWT解析异常"),

    REMOTE_ERROR("C0001", "第三方服务错误"),
    FEIGN_ERROR("C0002", "OpenFeign调用异常"),
    IDEMPOTENT_TOKEN_ERROR("C0003", "幂等TOKEN参数为空"),

    IDEMPOTENT_TOKEN_DELETE_ERROR("C0004", "幂等Token已被使用或失效"),
    IDEMPOTENT_ERROR("C0005", "幂等操作异常");

    /**
     * 错误码
     */
    private final String code;
    /**
     * 错误信息
     */
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
