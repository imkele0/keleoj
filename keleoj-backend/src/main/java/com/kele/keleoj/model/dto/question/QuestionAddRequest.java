package com.kele.keleoj.model.dto.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题目请求
 *
   */
@ApiModel("创建题目请求")
@Data
public class QuestionAddRequest implements Serializable {

    /**
     * 标题
     */
    @ApiModelProperty(value = "题目标题", required = true, example = "两数之和")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "题目内容（题目描述）", required = true, example = "给定一个整数数组...")
    private String content;

    /**
     * 标签列表
     */
    @ApiModelProperty(value = "标签列表", example = "[\"数组\", \"哈希表\"]")
    private List<String> tags;

    /**
     * 题目答案
     */
    @ApiModelProperty(value = "题目答案（判题参考）", example = "class Solution { ... }")
    private String answer;

    /**
     * 判题用例
     */
    @ApiModelProperty(value = "判题用例列表")
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置
     */
    @ApiModelProperty(value = "判题配置（时间/内存/堆栈限制）")
    private JudgeConfig judgeConfig;

    private static final long serialVersionUID = 1L;
}
