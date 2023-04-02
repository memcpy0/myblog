package com.memcpy0.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章标签PO类
 * @date 2023/4/2 14:08
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("blog_tag")
public class Tag implements Serializable {
    private static final long serialVersionUID = 1L;

    // 主键
    private Long id;

    // 图像路径
    private String image;

    // 标签名
    private String tagName;
}
