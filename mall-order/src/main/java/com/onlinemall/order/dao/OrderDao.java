package com.onlinemall.order.dao;

import com.onlinemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 14:55:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
