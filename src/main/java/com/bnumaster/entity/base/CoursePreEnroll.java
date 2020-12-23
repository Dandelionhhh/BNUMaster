package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程预报名实体")
public class CoursePreEnroll {
    @ApiModelProperty("课程预报名表编号")
    private int id;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;

    @NotNull
    @ApiModelProperty("课程编号")
    private int courseId;

    @NotNull
    @ApiModelProperty("课程学期编号")
    private int courseTermId;

    @NotBlank
    @ApiModelProperty("姓名")
    private String name;

    @NotNull
    @ApiModelProperty("性别")
    private int sex;

    @Email
    @ApiModelProperty("学生邮箱")
    private String email;

    @NotNull
    @ApiModelProperty("学生年龄")
    private int age;

    @NotBlank
    @ApiModelProperty("用户电话")
    private String phone;

    @ApiModelProperty("")
    private String remarks;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
