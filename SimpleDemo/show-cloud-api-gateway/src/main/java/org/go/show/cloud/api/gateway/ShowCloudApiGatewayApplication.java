package org.go.show.cloud.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ShowCloudApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowCloudApiGatewayApplication.class, args);
    }

}
