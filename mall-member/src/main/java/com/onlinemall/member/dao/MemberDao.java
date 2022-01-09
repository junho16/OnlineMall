package com.onlinemall.member.dao;

import com.onlinemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 15:19:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
