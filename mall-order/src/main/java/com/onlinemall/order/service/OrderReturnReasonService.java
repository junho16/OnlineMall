package com.onlinemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 14:55:27
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

