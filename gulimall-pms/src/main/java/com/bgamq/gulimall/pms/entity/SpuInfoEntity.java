package com.bgamq.gulimall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:42
 */
@ApiModel
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "商品id")
	private Long id;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "spuName",value = "商品名称")
	private String spuName;
	/**
	 * 商品描述
	 */
	@ApiModelProperty(name = "spuDescription",value = "商品描述")
	private String spuDescription;
	/**
	 * 所属分类id
	 */
	@ApiModelProperty(name = "catalogId",value = "所属分类id")
	private Long catalogId;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "brandId",value = "品牌id")
	private Long brandId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "weight",value = "")
	private BigDecimal weight;
	/**
	 * 上架状态[0 - 下架，1 - 上架]
	 */
	@ApiModelProperty(name = "publishStatus",value = "上架状态[0 - 下架，1 - 上架]")
	private Integer publishStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "createTime",value = "")
	private Date createTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "updateTime",value = "")
	private Date updateTime;

}
