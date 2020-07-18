package com.bgamq.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.sms.entity.HomeAdvEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 首页轮播广告
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

