package com.onlinemall.product.dao;

import com.onlinemall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-07 15:48:51
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(Long catId, String name);

}
