package com.zsm.feignuserconsumer.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 15:11.
 * @Modified By :
 */
@FeignClient(value = "ribbon-user-provider")
@Component
public interface UserInterface
{
    @RequestMapping(value = "/getUserInfo/{name}",method = RequestMethod.GET)
    String getUserInfo(@PathVariable String name);
}
