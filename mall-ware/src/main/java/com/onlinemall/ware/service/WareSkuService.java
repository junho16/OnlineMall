package com.onlinemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-09 15:37:45
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);


}

