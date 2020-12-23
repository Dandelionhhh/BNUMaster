package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="国家实体")
public class Country {
    @ApiModelProperty("国家编号")
    private int id;

    @NotNull
    @ApiModelProperty("国家名字")
    private String name;

    @NotNull
    @ApiModelProperty("")
    private String code;
}
