package com.bgamq.gulimall.sms.dao;

import com.bgamq.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
