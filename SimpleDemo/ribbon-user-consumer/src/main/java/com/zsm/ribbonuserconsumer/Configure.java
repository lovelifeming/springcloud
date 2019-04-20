package com.zsm.ribbonuserconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 9:47.
 * @Modified By :
 */
@Configuration
public class Configure
{
    @Bean
    @Autowired
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
