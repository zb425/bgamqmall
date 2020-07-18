package com.bgamq.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.sms.entity.SkuLadderEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

