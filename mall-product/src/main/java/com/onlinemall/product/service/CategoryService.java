package com.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-07 15:48:51
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

