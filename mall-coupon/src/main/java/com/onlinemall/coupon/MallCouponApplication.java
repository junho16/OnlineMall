package com.onlinemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;


@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        System.setProperty("spring.cloud.bootstrap.enabled","true");
//        args = Arrays.copyOf(args, args.length + 1);
//        args[args.length - 1] = "--spring.cloud.bootstrap.enabled=true";
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
