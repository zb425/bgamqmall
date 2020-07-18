package com.bgamq.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.sms.entity.SpuBoundsEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:46
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

