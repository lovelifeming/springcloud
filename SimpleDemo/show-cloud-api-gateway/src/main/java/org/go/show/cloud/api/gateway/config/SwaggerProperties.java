package org.go.show.cloud.api.gateway.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;


import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("swagger")
public class SwaggerProperties {
    private final List<SwaggerResource> list = new ArrayList<>();
    public List<SwaggerResource> getList() {
        return this.list;
    }
}
