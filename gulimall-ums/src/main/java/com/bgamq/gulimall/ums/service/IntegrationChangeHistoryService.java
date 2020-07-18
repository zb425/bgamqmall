package com.bgamq.gulimall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.ums.entity.IntegrationChangeHistoryEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:09:52
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

