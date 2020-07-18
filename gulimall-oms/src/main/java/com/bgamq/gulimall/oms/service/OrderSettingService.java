package com.bgamq.gulimall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.oms.entity.OrderSettingEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 订单配置信息
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:42:16
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageVo queryPage(QueryCondition params);
}

