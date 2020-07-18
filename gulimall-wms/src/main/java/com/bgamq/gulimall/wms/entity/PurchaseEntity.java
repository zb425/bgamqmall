package com.bgamq.gulimall.wms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:11:15
 */
@ApiModel
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 采购单id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "采购单id")
	private Long id;
	/**
	 * 采购人id
	 */
	@ApiModelProperty(name = "assigneeId",value = "采购人id")
	private Long assigneeId;
	/**
	 * 采购人名
	 */
	@ApiModelProperty(name = "assigneeName",value = "采购人名")
	private String assigneeName;
	/**
	 * 联系方式
	 */
	@ApiModelProperty(name = "phone",value = "联系方式")
	private String phone;
	/**
	 * 优先级
	 */
	@ApiModelProperty(name = "priority",value = "优先级")
	private Integer priority;
	/**
	 * 状态
	 */
	@ApiModelProperty(name = "status",value = "状态")
	private Integer status;
	/**
	 * 仓库id
	 */
	@ApiModelProperty(name = "wareId",value = "仓库id")
	private Long wareId;
	/**
	 * 总金额
	 */
	@ApiModelProperty(name = "amount",value = "总金额")
	private BigDecimal amount;
	/**
	 * 创建日期
	 */
	@ApiModelProperty(name = "createTime",value = "创建日期")
	private Date createTime;
	/**
	 * 更新日期
	 */
	@ApiModelProperty(name = "updateTime",value = "更新日期")
	private Date updateTime;

}
