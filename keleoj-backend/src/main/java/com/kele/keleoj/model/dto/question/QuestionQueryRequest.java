package com.kele.keleoj.model.dto.question;

import com.kele.keleoj.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 题目查询请求
 *
   */
@ApiModel("题目查询请求")
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "题目 ID", example = "1")
    private Long id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "题目标题（模糊搜索）", example = "两数之和")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "题目内容（模糊搜索）")
    private String content;

    /**
     * 标签列表
     */
    @ApiModelProperty(value = "标签列表", example = "[\"数组\"]")
    private List<String> tags;

    /**
     * 题目答案
     */
    @ApiModelProperty(value = "题目答案")
    private String answer;

    /**
     * 创建用户 id
     */
    @ApiModelProperty(value = "创建用户 ID", example = "1")
    private Long userId;

    private static final long serialVersionUID = 1L;
}
