package com.memcpy0.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章体PO类
 * @date 2023/4/1 21:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_article_body")
public class ArticleBody implements Serializable {
    private static final long serialVersionUID = 1L;
    // 主键
    private Long id;
    // 文章内容
    private String content;
    // 文章内容的HTML
    private String contentHtml;

}
