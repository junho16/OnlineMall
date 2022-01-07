package com.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-07 15:48:51
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

