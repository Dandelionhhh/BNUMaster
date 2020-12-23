package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    @ApiModelProperty("标签编号")
    private int id;

    @NotBlank
    @ApiModelProperty("标签名字")
    private String name;

    @ApiModelProperty("标签创建时间")
    private Date createTime;
}
