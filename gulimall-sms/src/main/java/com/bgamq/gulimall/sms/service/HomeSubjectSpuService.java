package com.bgamq.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.sms.entity.HomeSubjectSpuEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 专题商品
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:07:47
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

