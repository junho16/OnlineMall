package com.onlinemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 15:37:45
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

