package com.memcpy0.common;

/**
 * @author memcpy0
 * @version 1.0
 * @description 用户状态枚举类
 * @date 2023/4/2 17:04
 */
public enum UserStatus {
    normal("正常状态"), blocked("封禁状态");

    private final String info;

    private UserStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
