package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="机构实体")
public class Institution {
    @ApiModelProperty("机构编号")
    private int id;

    @ApiModelProperty("机构创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;

    @NotBlank
    @ApiModelProperty("机构名字")
    private String name;

    @ApiModelProperty("")
    private String description;

    @NotNull
    @ApiModelProperty("")
    private int institutionDetailsId;

    @ApiModelProperty("")
    private String options;

    @ApiModelProperty("")
    private boolean waitUpdate;
}
