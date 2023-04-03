package com.memcpy0.blog.po;

import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author dell
 * @version 1.0
 * @description TODO
 * @date 2023/4/2 16:50
 */
public class SystemUser implements Serializable {
    private static final long serialVersionUID = 1L;

    // 用户ID，主键
    private Long id;

    // 账号名称
    private String account; // 唯一

    // 密码，使用md5(username + original password + salt)加密存储
    private String password;

    // 加密时使用的种子
    private String salt;

    // 是否是管理员
    private Boolean admin = false;

    // 用户状态
    private String status; // 正常和封禁

    // 用户头像
    private String avatar;

    // 昵称
    private String nickName;

    // 邮箱
    private String email; // 唯一

    // 手机
    private String mobilePhoneNumber; // 唯一

    // 创建时间
    private LocalDateTime createTime;

    // 上次登陆
    private LocalDateTime lastLogin;

    // 逻辑删除
    @TableLogic(value = "false", delval = "true")
    private Boolean isDeleted = false;
}
