package com.bgamq.gulimall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:09:52
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

