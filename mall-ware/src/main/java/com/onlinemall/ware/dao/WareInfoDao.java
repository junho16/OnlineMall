package com.onlinemall.ware.dao;

import com.onlinemall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 15:37:45
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
