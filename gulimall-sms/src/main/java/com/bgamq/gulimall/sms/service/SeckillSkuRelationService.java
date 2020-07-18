package com.bgamq.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.sms.entity.SeckillSkuRelationEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 秒杀活动商品关联
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

