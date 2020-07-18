package com.bgamq.gulimall.pms.dao;

import com.bgamq.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 11:32:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
