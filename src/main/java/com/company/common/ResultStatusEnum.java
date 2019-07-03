package com.company.common;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/7/3 15:42
 */
public enum ResultStatusEnum {

    SUCCESS(200),//成功
    FAIL(201),//失败
    UNAUTHORIZED(401),//未认证
    NOT_FOUND(404),//访问资源不存在
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    private int status;

    ResultStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
