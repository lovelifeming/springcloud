package com.zsm.feignuserconsumer.controller;

import com.zsm.feignuserconsumer.rpc.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 15:09.
 * @Modified By :
 */
@RestController
public class UserController
{
    @Autowired
    private UserInterface userInterface;    //rpc注入

    @GetMapping("/getUserInfo/{name}")
    public String getUserInfo(@PathVariable String name)
    {
        String result = userInterface.getUserInfo(name);
        System.out.println(result);
        return result;
    }
}
