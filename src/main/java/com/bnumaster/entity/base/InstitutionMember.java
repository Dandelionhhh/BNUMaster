package com.bnumaster.entity.base;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="用户实体")
public class InstitutionMember {
    @NotNull
    @ApiModelProperty("机构编号")
    private int institutionId;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;
}
