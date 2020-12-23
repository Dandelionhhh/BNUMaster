package com.bnumaster.entity.base;

import com.sun.istack.internal.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

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
