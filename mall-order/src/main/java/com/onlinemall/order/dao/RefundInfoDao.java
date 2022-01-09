package com.onlinemall.order.dao;

import com.onlinemall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 14:55:27
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
