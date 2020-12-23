package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="城市实体")
public class City {
    @ApiModelProperty("城市编号")
    private int id;

    @ApiModelProperty("国家编号")
    private int countryId;

    @ApiModelProperty("省份编号")
    private int provinceId;

    @NotBlank
    @ApiModelProperty("省份名称")
    private String name;

    @NotBlank
    @ApiModelProperty("")
    private String code;
}
