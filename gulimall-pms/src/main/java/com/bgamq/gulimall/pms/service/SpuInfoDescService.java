package com.bgamq.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.pms.entity.SpuInfoDescEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:41
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

