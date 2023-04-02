package com.memcpy0.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章PO类
 * @date 2023/4/1 21:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_article")
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    // 主键
    private Long id;

    // 文章标题
    private String title;

    // 文章体
    private Long bodyId;

    // 文章摘要
    private String description;

    // 作者ID（就是管理员）
    private Long authorId;

    // 分类专栏ID
    private Long categoryId;

    // 图片
    private String image;

    // 已浏览数
    private Integer viewCounts;

    // 评论数
    private Integer commentCounts;

    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    // 逻辑删除
    @TableLogic(value = "false", delval = "true")
    private Boolean isDeleted = false;
}
