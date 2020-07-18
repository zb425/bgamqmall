package com.bgamq.gulimall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.wms.entity.WareOrderTaskEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:11:15
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

