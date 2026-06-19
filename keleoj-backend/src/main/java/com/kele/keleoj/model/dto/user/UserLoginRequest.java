package com.kele.keleoj.model.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户登录请求
 *
   */
@ApiModel("用户登录请求")
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    @ApiModelProperty(value = "用户账号", required = true, example = "zhangsan")
    private String userAccount;

    @ApiModelProperty(value = "用户密码", required = true, example = "12345678")
    private String userPassword;
}
