package com.bnumaster.entity.base;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="用户实体")

public class Account {

    @ApiModelProperty("用户编号")
    private int id;

    @NotNull(message = "呢称不能为空")
    @ApiModelProperty("呢称")
    private String nickName;

    @NotNull(message = "角色不能为空")
    @ApiModelProperty("角色")
    private int role;

    @ApiModelProperty("电话号码")
    private String phone;

    @ApiModelProperty("验证电话号码")
    private int phoneValidated;

    @NotNull(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String passWord;

//    @NotNull
    @ApiModelProperty("")
    private String cleanPassWord;


    @ApiModelProperty("用户邮箱")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;

    @ApiModelProperty("验证邮箱")
    private int emailValidated;

    @NotBlank
    @Size(max = 20)
    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("")
    private int modified;

    @ApiModelProperty("")
    private String avator;

    @ApiModelProperty("")
    private String motto;

    @ApiModelProperty("地址编号")
    private int addressId;

    @NotBlank
    @ApiModelProperty("真实名字")
    private String realName;

    @ApiModelProperty("")
    private String idCode;

    @ApiModelProperty("")
    private String options;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("家长编号")
    private int parentId;


}
