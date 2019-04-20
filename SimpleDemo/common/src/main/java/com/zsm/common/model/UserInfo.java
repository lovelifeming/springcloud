package com.zsm.common.model;

import lombok.Data;


/**
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/18 10:00.
 * @Modified By :
 */
@Data
public class UserInfo
{
    private long userId;
    private String userName;
    private String gender;
    private String hobby;
    private boolean active;
    private String role;
    private String description;
    private String remark;
}
