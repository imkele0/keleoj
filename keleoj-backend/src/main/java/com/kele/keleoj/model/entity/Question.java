package com.kele.keleoj.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目
 * @TableName question
 */
@ApiModel("题目")
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "题目 ID", example = "1")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "题目标题", example = "两数之和")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "题目内容（题目描述）")
    private String content;

    /**
     * 标签列表（json 数组）
     */
    @ApiModelProperty(value = "标签列表（JSON 数组）", example = "[\"数组\", \"哈希表\"]")
    private String tags;

    /**
     * 题目答案
     */
    @ApiModelProperty(value = "题目答案代码")
    private String answer;

    /**
     * 题目提交数
     */
    @ApiModelProperty(value = "题目提交次数", example = "100")
    private Integer submitNum;

    /**
     * 题目通过数
     */
    @ApiModelProperty(value = "题目通过次数", example = "50")
    private Integer acceptedNum;

    /**
     * 判题用例（json 数组）
     */
    @ApiModelProperty(value = "判题用例（JSON 数组）")
    private String judgeCase;

    /**
     * 判题配置（json 对象）
     */
    @ApiModelProperty(value = "判题配置（JSON 对象）")
    private String judgeConfig;

    /**
     * 创建用户 id
     */
    @ApiModelProperty(value = "创建用户 ID", example = "1")
    private Long userId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    @ApiModelProperty(value = "是否删除（逻辑删除）", hidden = true)
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
