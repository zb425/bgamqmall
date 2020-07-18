package com.bgamq.gulimall.oms.dao;

import com.bgamq.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:42:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
