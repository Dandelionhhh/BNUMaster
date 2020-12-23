package com.bnumaster.entity.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "POST: 增加用户使用的Param类")
public class AccountParams {
    @ApiModelProperty("用户编号")
    private int id;

    @ApiModelProperty(value = "呢称", required = true)
    private String nickName;

    @ApiModelProperty(value = "角色",required = true)
    private int role;

    @ApiModelProperty("电话号码")
    private String phone;

    @ApiModelProperty("验证电话号码")
    private int phoneValidated;


    @ApiModelProperty(value = "密码",required = true)
    private String passWord;

    //    @NotNull
    @ApiModelProperty("")
    private String cleanPassWord;

    @Email
    @ApiModelProperty("用户邮箱")
    private String email;

    @ApiModelProperty("验证邮箱")
    private int emailValidated;

    @Size(max = 20)
    @ApiModelProperty(value = "用户名", required = true)
    private String userName;

    @ApiModelProperty("")
    private int modified;


    @ApiModelProperty("")
    private String motto;

    @ApiModelProperty("地址编号")
    private int addressId;

    @ApiModelProperty(value = "真实名字", required = true)
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
