package com.zsm.ribbonuserprovider.controller;

import com.zsm.common.model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 9:52.
 * @Modified By :
 */
@RestController
public class UserController
{
    @GetMapping("/getUserInfo/{name}")
    public String getUserInfo(@PathVariable String name)
    {
        System.out.println("search user:" + name);
        UserInfo user = new UserInfo();
        user.setUserName(name);
        user.setDescription("search user info success:" + name);
        return user.toString();
    }
}
