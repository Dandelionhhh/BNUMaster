package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="咨询审核记录实体")
public class InformationExamineRecord {
    @ApiModelProperty("咨询审核记录编号")
    private int id;

    @ApiModelProperty("咨询编号")
    private int informationId;

    @ApiModelProperty("是否采用")
    private boolean adopt;

    @ApiModelProperty("")
    private String reply;

    @ApiModelProperty("更新时间")
    private Date createTime;
}
