package com.memcpy0.blog.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author dell
 * @version 1.0
 * @description 系统日志类
 * @date 2023/4/2 15:24
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_log")
public class SystemLog implements Serializable {
    private static final long serialVersionUID = 1L;
    // 日志ID
    private Long id;

    // 用户ID
    private Long userId;

    // 昵称
    private String nickname;

    // 模块
    private String module;

    // 操作
    private String operation;

    // 方法
    private String method;

    // 参数
    private String params;

    // IP地址
    private String ip;

    //
    private Long time;

    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
