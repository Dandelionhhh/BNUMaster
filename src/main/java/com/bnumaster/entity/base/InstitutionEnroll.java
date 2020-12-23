package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="机构注册实体")
public class InstitutionEnroll {
    @ApiModelProperty("机构注册表编号")
    private int id;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("用户编号")
    private int accountId;

    @ApiModelProperty("机构详细信息编号")
    private int institutionDetailsId;

    @ApiModelProperty("操作")
    private boolean handle;

    @ApiModelProperty("是否通过")
    private boolean adopt;

    @ApiModelProperty("")
    private String reply;

    @ApiModelProperty("")
    private int status;
}
