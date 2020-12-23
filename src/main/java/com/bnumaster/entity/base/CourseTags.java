package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="课程标签实体")
public class CourseTags {
    @ApiModelProperty("课程编号")
    private int courseId;

    @NotNull
    @ApiModelProperty("标签编号")
    private int tagId;
}
