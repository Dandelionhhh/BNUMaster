package com.bnumaster.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="机构详细信息实体")
public class InstitutionDetails {
    @ApiModelProperty("机构详细信息编号")
    private int id;

    @NotBlank
    @ApiModelProperty("机构名称")
    private String name;

    @NotBlank
    @ApiModelProperty("企业注册号")
    private String taxId;

    @NotNull
    @ApiModelProperty("注册资金")
    private int registerMoney;

    @NotBlank
    @ApiModelProperty("企业类型")
    private String institutionType;

    @NotBlank
    @ApiModelProperty("机构封面")
    private String logo;

    @NotBlank
    @ApiModelProperty("营业执照")
    private String businessLicense;

    @NotBlank
    @ApiModelProperty("成立时间")
    private String establishTime;

    @NotNull
    @ApiModelProperty("营业开始日期")
    private Date businessStartTime;

    @NotNull
    @ApiModelProperty("营业结束日期")
    private Date businessEndTime;

    @NotBlank
    @ApiModelProperty("经营范围")
    private String businessScope;

    @NotBlank
    @ApiModelProperty("登记机关")
    private String registerAuthority;

    @NotNull
    @ApiModelProperty("核准时间")
    private Date approveTime;

    @NotNull
    @ApiModelProperty("法人")
    private String legalPerson;

    @NotNull
    @ApiModelProperty("地址编号")
    private int addressId;

    @ApiModelProperty("")
    private int region;

    @NotBlank
    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("")
    private String remarks;

    @ApiModelProperty("")
    private String invoiceRise;

    @ApiModelProperty("")
    private String taxPayerDistinguish;

    @ApiModelProperty("")
    private String invoicePhone;

    @ApiModelProperty("")
    private String contactMan;

    @ApiModelProperty("")
    private String contactNumber;

    @ApiModelProperty("")
    private String resources;

    @ApiModelProperty("")
    private int modifyEditionId;
}
