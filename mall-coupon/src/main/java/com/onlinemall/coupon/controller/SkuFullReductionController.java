package com.onlinemall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.onlinemall.common.to.SkuReductionTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlinemall.coupon.entity.SkuFullReductionEntity;
import com.onlinemall.coupon.service.SkuFullReductionService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.common.utils.R;



/**
 * 商品满减信息
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-08 15:59:54
 */
@RestController
@RequestMapping("coupon/skufullreduction")
public class SkuFullReductionController {
    @Autowired
    private SkuFullReductionService skuFullReductionService;

    @PostMapping("/saveinfo")
    public R saveInfo(@RequestBody SkuReductionTo reductionTo){

        skuFullReductionService.saveSkuReduction(reductionTo);
        return R.ok();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SkuFullReductionEntity skuFullReduction = skuFullReductionService.getById(id);

        return R.ok().put("skuFullReduction", skuFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.save(skuFullReduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.updateById(skuFullReduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		skuFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
