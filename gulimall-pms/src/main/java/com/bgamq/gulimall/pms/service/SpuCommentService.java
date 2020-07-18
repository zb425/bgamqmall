package com.bgamq.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.pms.entity.SpuCommentEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:42
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

