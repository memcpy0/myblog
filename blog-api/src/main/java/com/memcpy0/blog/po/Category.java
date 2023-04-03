package com.memcpy0.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章专栏PO类
 * @date 2023/4/2 14:13
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    // 主键
    private Long id;

    // 专栏名称
    private String categoryName; // 非空唯一

    // 专栏描述
    private String description;

    // 专栏图片
    private String image;

    // 父专栏ID
    private Long parentId;

    // 专栏层级
    private String level; // "0"-"9"
}
