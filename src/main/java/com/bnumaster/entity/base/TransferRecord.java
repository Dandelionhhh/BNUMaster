package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferRecord {
    @ApiModelProperty("交易记录编号")
    private int id;

    @ApiModelProperty("用户编号")
    private int accountId;

    @ApiModelProperty("退款申请编号")
    private int refundApplyId;

    @ApiModelProperty("机构编号")
    private int institutionId;

    @ApiModelProperty("是否为机构")
    private boolean isInstitution;

    @ApiModelProperty("描述")
    private String description;

    @NotNull
    @ApiModelProperty("支付价钱")
    private int payPrice;

    @NotNull
    @ApiModelProperty("")
    private int payType;

    @ApiModelProperty("创建时间")
    private Date createTime;
}
