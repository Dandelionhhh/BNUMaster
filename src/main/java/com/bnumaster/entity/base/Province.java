package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;


import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Province {
    @ApiModelProperty("省份编号")
    private int id;

    @ApiModelProperty("国家编号")
    private int countryId;

    @NotBlank
    @ApiModelProperty("省名")
    private String name;

    @NotBlank
    @ApiModelProperty("")
    private String code;
}
