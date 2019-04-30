package com.zsm.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ZuulApplication.class, args);
    }

    /**
     * 引入Zuul过滤器到容器中
     */
    @Bean
    public SimpleFilter simpleFilter()
    {
        return new SimpleFilter();
    }
}
