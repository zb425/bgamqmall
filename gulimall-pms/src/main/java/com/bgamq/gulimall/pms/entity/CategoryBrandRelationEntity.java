package com.bgamq.gulimall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌分类关联
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:42
 */
@ApiModel
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "brandId",value = "品牌id")
	private Long brandId;
	/**
	 * 分类id
	 */
	@ApiModelProperty(name = "catelogId",value = "分类id")
	private Long catelogId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "brandName",value = "")
	private String brandName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "catelogName",value = "")
	private String catelogName;

}
