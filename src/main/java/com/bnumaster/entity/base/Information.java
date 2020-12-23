package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="咨询实体")
public class Information {
    @ApiModelProperty("咨询编号")
    private int id;

    @NotNull
    @ApiModelProperty("")
    private int authorId;

    @ApiModelProperty("机构编号")
    private int institutionId;

    @ApiModelProperty("咨询属性")
    private int attribute;

    @NotNull
    @ApiModelProperty("咨询状态")
    private int status;

    @NotNull
    @ApiModelProperty("咨询类型")
    private int informationType;

    @NotBlank
    @ApiModelProperty("咨询标题")
    private String title;

    @ApiModelProperty("咨询封面")
    private String cover;

    @NotBlank
    @ApiModelProperty("咨询摘要")
    private String abst;

    @NotBlank
    @ApiModelProperty("咨询详情")
    private String content;

    @ApiModelProperty("咨询来源")
    private String resources;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updadateTime;
}
