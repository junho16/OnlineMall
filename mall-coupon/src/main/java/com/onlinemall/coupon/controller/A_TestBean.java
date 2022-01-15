package com.onlinemall.coupon.controller;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@RefreshScope
public class A_TestBean {

    @Value("${coupon.user.name}")
    @Getter
    private String name;


}
