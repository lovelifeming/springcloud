package org.go.show.cloud.api.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.List;

/**
 * Created by 纪尚松 on 2018/6/13.
 * <p>
 * Swagger文档配置
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Autowired
    private SwaggerProperties swaggerProperties;
    @Override
    public List<SwaggerResource> get() {
        return swaggerProperties.getList();
    }
}
