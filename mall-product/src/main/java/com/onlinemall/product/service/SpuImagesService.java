package com.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-07 15:48:51
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

