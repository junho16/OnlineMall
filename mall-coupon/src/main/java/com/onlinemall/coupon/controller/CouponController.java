package com.onlinemall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemall.coupon.entity.CouponEntity;
import com.onlinemall.coupon.service.CouponService;
import com.onlinemall.common.utils.PageUtils;
import com.onlinemall.common.utils.R;



/**
 * 优惠券信息
 *
 * @author wjh
 * @email junhaowang.stu@qq.com
 * @date 2022-01-08 15:59:54
 */
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {

    static private Logger logger = LoggerFactory.getLogger(CouponController.class);

    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name}")
    private String name;

    @Autowired
    A_TestBean a_testBean;

    /**
     * 测试
     */
    @RequestMapping("/testconfig")
    public R testconfig(){
//        System.out.println(a_testBean.getName());
//        return R.ok().put("name", a_testBean.getName());
//        System.out.println(name);
        logger.info("name:{}", name);
        return R.ok().put("name", name);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
