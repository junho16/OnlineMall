package com.onlinemall.coupon.dao;

import com.onlinemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-08 15:59:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
