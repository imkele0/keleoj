package com.kele.keleoj.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
   */
@ApiModel("删除请求")
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    @ApiModelProperty(value = "要删除的记录 ID", required = true, example = "1")
    private Long id;

    private static final long serialVersionUID = 1L;
}
