package com.zsm.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/15 11:36.
 * @Modified By :
 */
@RestController
@RequestMapping("/test/")
public class TestEureka
{
    @GetMapping("getUser")
    public String testGetUser(String name)
    {
        return "eureka-client 获取测试通过:" + name;
    }

    @PostMapping("postUserId")
    public String testPostUser(String userId)
    {
        return "eureka-client 获取用户Id：" + userId;
    }
}
