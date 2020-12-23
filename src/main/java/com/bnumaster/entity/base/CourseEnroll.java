package com.bnumaster.entity.base;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程报名实体")
public class CourseEnroll {
    @ApiModelProperty("课程报名编号")
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

    @NotNull
    @ApiModelProperty("地址编号")
    private int addressId;

    @ApiModelProperty("学校")
    private String school;

    @NotBlank
    @ApiModelProperty("家长名字")
    private String parentName;

    @NotBlank
    @ApiModelProperty("家长电话")
    private String parentPhone;

    @NotBlank
    @ApiModelProperty("")
    private String parentIdCode;

    @NotNull
    @ApiModelProperty("家长编号")
    private int parentId;

    @NotBlank
    @ApiModelProperty("学生名字")
    private String studentName;

    @NotNull
    @ApiModelProperty("学生性别")
    private int studentSex;

    @NotNull
    @Max(100)
    @Min(10)
    @ApiModelProperty("学生年龄")
    private int studentAge;

    @ApiModelProperty("学生电话")
    private String studentPhone;

    @NotBlank
    @ApiModelProperty("")
    private String studentIdCode;

    @NotNull
    @ApiModelProperty("学生编号")
    private int studentId;

    @ApiModelProperty("")
    private String additional;

    @NotNull
    @ApiModelProperty("付款记录编号")
    private int payRecordId;

    @ApiModelProperty("是否付款")
    private boolean isRefund;

    @ApiModelProperty("课程报名表创建时间")
    private Date createTime;

    @ApiModelProperty("课程报名表更新时间")
    private Date updateTime;
}
