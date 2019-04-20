package com.zsm.ribbonuserconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 11:03.
 * @Modified By :
 */
@RestController
public class UserController
{
    @Autowired
    private RestTemplate template;

    @GetMapping("/getUserInfo/{name}")
    public String getUserInfo(@PathVariable String name)
    {
        String result = template.getForObject("http://ribbon-user-provider/getUserInfo/" + name, String.class);
        System.out.println(result);
        return result;
    }
}
