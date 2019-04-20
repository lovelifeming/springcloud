package com.zsm.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @EnableEurekaClient与@EnableDiscoveryClient的区别，前者是针对eureka的，后者是可用于zookeeper、consul。
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
