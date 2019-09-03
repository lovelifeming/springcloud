package com.zsm.eurekaclient.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api("查询用户模块")
public class TestEureka
{
    @GetMapping("getUser")
    @ApiOperation(value = "getUser")
    public String testGetUser(String name)
    {
        String result = "eureka-client 获取测试通过:" + name;
        System.out.println(result);
        return result;
    }

    @PostMapping("postUserId")
    public String testPostUser(String userId)
    {
        String result = "eureka-client 获取用户Id：" + userId;
        System.out.println(result);
        return result;
    }
}
