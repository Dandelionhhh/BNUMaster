package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceMetaData {
    @ApiModelProperty("资源元数据编号")
    private int id;

    @NotBlank
    @ApiModelProperty("")
    private String name;

    @NotBlank
    @ApiModelProperty("")
    private String mime;

    @NotNull
    @ApiModelProperty("")
    private int size;

    @NotBlank
    @ApiModelProperty("")
    private String hash;

    @NotNull
    @ApiModelProperty("存储类型")
    private int storageType;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
