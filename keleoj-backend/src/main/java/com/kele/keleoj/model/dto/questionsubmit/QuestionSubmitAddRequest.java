package com.kele.keleoj.model.dto.questionsubmit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 提交代码请求
 *
   */
@ApiModel("提交代码请求")
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    @ApiModelProperty(value = "编程语言", required = true, example = "java", allowableValues = "java,cpp,python,go")
    private String language;

    /**
     * 用户代码
     */
    @ApiModelProperty(value = "用户提交的代码", required = true, example = "public class Main { ... }")
    private String code;

    /**
     * 题目 id
     */
    @ApiModelProperty(value = "题目 ID", required = true, example = "1")
    private Long questionId;

    private static final long serialVersionUID = 1L;
}
