package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefundApply {
    @ApiModelProperty("退款申请编号")
    private int id;

    @NotNull
    @ApiModelProperty("批准人编号")
    private int approverId;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;

    @NotNull
    @ApiModelProperty("课程编号")
    private int courseId;

    @NotNull
    @ApiModelProperty("支付记录编号")
    private int payRecordId;

    @ApiModelProperty("")
    private String note;

    @ApiModelProperty("")
    private int status;

    @ApiModelProperty("创建时间")
    private Date createTime;
}
