package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="地址实体")
public class Address {

    @ApiModelProperty("地址编号")
    private int id;

    @ApiModelProperty("国家编号")
    private int countryId;

    @ApiModelProperty("国家名字")
    private String countryName;

    @ApiModelProperty("省份编号")
    private int provinceId;

    @ApiModelProperty("省份名字")
    private String provinceName;

    @ApiModelProperty("城市编号")
    private int cityId;

    @ApiModelProperty("城市名字")
    private String cityName;

    @ApiModelProperty("街道编号")
    private int districtId;

    @ApiModelProperty("街道名字")
    private String districtName;

    @ApiModelProperty("")
    private String zipCode;

    @ApiModelProperty("详细地址")
    private String details;
}
