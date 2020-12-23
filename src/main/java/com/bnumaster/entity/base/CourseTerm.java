package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程学期实体")
public class CourseTerm {
    @ApiModelProperty("课程学期编号")
    private int id;

    @ApiModelProperty("课程编号")
    private int courseId;

    @NotNull
    @ApiModelProperty("计划人数")
    private int planned;

    @NotNull
    @ApiModelProperty("价格")
    private int price;

    @NotNull
    @ApiModelProperty("")
    private int registrationMethod;

    @NotNull
    @ApiModelProperty("开始时间")
    private Date startTime;

    @NotNull
    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("备注")
    private String remarks;
}
