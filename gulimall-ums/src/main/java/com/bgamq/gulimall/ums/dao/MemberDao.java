package com.bgamq.gulimall.ums.dao;

import com.bgamq.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bgamq
 * @email bgamq@425.com
 * @date 2020-07-18 12:09:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
