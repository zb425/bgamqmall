package com.bgamq.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgamq.gulimall.pms.entity.SpuImagesEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu图片
 *
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:42
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

