package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程评论实体")
public class CourseComment {
    @ApiModelProperty("课程评论编号")
    private int id;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;

    @NotNull
    @ApiModelProperty("课程编号")
    private int courseId;

    @ApiModelProperty("星星")
    private int star;

    @NotBlank
    @ApiModelProperty("")
    private String context;

    @ApiModelProperty("")
    private String reply;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
