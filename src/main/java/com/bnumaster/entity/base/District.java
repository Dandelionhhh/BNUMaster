package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="街道实体")
public class District {
    @ApiModelProperty("街道编号")
    private int id;

    @ApiModelProperty("国家编号")
    private int countryId;

    @ApiModelProperty("省份编号")
    private int provinceId;

    @ApiModelProperty("城市编号")
    private int cityId;

    @NotBlank
    @ApiModelProperty("街道名字")
    private String name;

    @NotBlank
    @ApiModelProperty("")
    private String code;
}
