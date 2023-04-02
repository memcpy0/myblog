package com.memcpy0.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章标签ID
 * @date 2023/4/2 14:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_article_tag")
public class ArticleTag implements Serializable {
    private static final long serialVersionUID = 1L;

    // 主键，文章标签ID
    private Long id;

    // 文章ID
    private Long articleId;

    // 标签ID
    private Long tagId;
}
