package com.company.common;

import com.company.model.Result;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/7/3 15:44
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    /**
     * 生成执行成功返回结果
     *
     * @return Result
     */
    public static Result genSuccessResult() {
        return new Result()
                .setStatus(ResultStatusEnum.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 生成执行成功返回结果
     *
     * @param <T>
     * @param data 数据
     * @return Result
     */
    public static Result genSuccessResult(Object data) {
        return new Result()
                .setStatus(ResultStatusEnum.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    /**
     * 生成执行失败返回结果
     *
     * @param <T>
     * @param message 执行失败消息
     * @return Result
     */
    public static Result genFailResult(String message) {
        return new Result()
                .setStatus(ResultStatusEnum.FAIL)
                .setMessage(message);
    }

    /**
     * 生成执行失败返回结果
     *
     * @param <T>
     * @param message 执行失败消息
     * @return Result
     */
    public static Result genServerErrorResult(String message) {
        return new Result()
                .setStatus(ResultStatusEnum.INTERNAL_SERVER_ERROR)
                .setMessage(message);
    }
}
