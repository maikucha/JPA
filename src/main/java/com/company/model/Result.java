package com.company.model;

import com.company.common.ResultStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/7/3 15:44
 */
@ApiModel("统一响应模型")
public class Result {

    @ApiModelProperty("响应状态")
    private int status;

    @ApiModelProperty("响应消息")
    private String message;

    @ApiModelProperty("响应数据")
    private Object data;

    public Result setStatus(ResultStatusEnum resultStatus) {
        this.status = resultStatus.getStatus();
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Result setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
