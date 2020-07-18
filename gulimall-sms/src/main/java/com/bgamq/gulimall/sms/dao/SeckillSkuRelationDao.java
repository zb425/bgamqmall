package com.bgamq.gulimall.sms.dao;

import com.bgamq.gulimall.sms.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
