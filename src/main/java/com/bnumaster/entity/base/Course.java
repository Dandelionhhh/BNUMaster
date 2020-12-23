package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程实体")
public class Course {
    @ApiModelProperty("课程编号")
    private int id;

    @NotNull
    @ApiModelProperty("机构编号")
    private int institutionId;

    @NotNull
    @ApiModelProperty("")
    private int authorId;

    @NotBlank
    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("子标题")
    private String subTitle;

    @ApiModelProperty("")
    private int status;

    @ApiModelProperty("")
    private int attribute;

    @ApiModelProperty("课程描述")
    private String description;

    @ApiModelProperty("封面")
    private String cover;

    @NotNull
    @ApiModelProperty("课程类别")
    private int courseType;

    @NotNull
    @ApiModelProperty("课程价钱")
    private int price;

    @NotNull
    @ApiModelProperty("开始日期")
    private Date startTime;

    @NotNull
    @ApiModelProperty("结束日期")
    private Date endTime;

    @NotNull
    @ApiModelProperty("地址编号")
    private int addressId;

    @NotBlank
    @ApiModelProperty("课程详情")
    private String details;

    @NotBlank
    @ApiModelProperty("行程安排")
    private String scheduling;

    @ApiModelProperty("报名须知")
    private String notice;

    @ApiModelProperty("")
    private String enrollAdditional;

    @ApiModelProperty("")
    private String resources;

    @ApiModelProperty("适合人群")
    private String suitableForCrowd;

    @NotBlank
    @ApiModelProperty("")
    private String options;

    @ApiModelProperty("营期")
    private int travelDays;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
