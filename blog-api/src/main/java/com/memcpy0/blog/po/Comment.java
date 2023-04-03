package com.memcpy0.blog.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author memcpy0
 * @version 1.0
 * @description TODO
 * @date 2023/4/2 14:53
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_comment")
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;

    // 主键
    private Long id;

    // 评论内容
    private String content;

    // 文章ID
    private Long articleId;

    // 评论层级
    private String level;

    // 父评论ID
    private Long parentId;

    // 用户ID
    @TableField(value = "uid")
    private Long userId;

    // 被评论者ID
    @TableField(value = "to_uid")
    private Long toUserId;
}
