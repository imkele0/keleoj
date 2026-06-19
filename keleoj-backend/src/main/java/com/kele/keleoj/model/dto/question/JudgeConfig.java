package com.kele.keleoj.model.dto.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 判题配置
 */
@ApiModel("判题配置")
@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    @ApiModelProperty(value = "时间限制（ms）", example = "1000")
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    @ApiModelProperty(value = "内存限制（KB）", example = "262144")
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    @ApiModelProperty(value = "堆栈限制（KB）", example = "262144")
    private Long stackLimit;
}
