package com.zsm.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //启动eureka注册中心服务端server
public class EurekaServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
