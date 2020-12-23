package com.bnumaster.entity.base;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayRecord {
    @ApiModelProperty("支付记录编号")
    private int id;

    @NotNull
    @ApiModelProperty("用户编号")
    private int accountId;

    @NotNull
    @ApiModelProperty("课程编号")
    private int courseId;

    @NotNull
    @ApiModelProperty("支付的价钱")
    private int payPrice;

    @NotNull
    @ApiModelProperty("")
    private int payType;

    @NotNull
    @ApiModelProperty("")
    private int rMethod;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
