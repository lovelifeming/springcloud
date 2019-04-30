package com.zsm.ribbonuserprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@SpringCloudApplication   //需要添加依赖 spring-cloud-starter-netflix-hystrix
public class RibbonUserProviderApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RibbonUserProviderApplication.class, args);
    }
}
