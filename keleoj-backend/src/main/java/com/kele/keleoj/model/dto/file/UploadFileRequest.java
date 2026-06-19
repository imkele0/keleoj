package com.kele.keleoj.model.dto.file;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 文件上传请求
 *
   */
@ApiModel("文件上传请求")
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务类型
     */
    @ApiModelProperty(value = "业务类型", required = true, example = "user_avatar", allowableValues = "user_avatar")
    private String biz;

    private static final long serialVersionUID = 1L;
}
