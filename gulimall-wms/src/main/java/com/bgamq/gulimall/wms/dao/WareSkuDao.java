package com.bgamq.gulimall.wms.dao;

import com.bgamq.gulimall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:11:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
