package com.kele.keleoj.model.dto.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 判题用例
 */
@ApiModel("判题用例")
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    @ApiModelProperty(value = "输入用例", example = "1 2")
    private String input;

    /**
     * 输出用例
     */
    @ApiModelProperty(value = "预期输出", example = "3")
    private String output;
}
