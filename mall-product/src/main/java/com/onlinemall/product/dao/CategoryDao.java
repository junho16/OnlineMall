package com.onlinemall.product.dao;

import com.onlinemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-07 15:48:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
