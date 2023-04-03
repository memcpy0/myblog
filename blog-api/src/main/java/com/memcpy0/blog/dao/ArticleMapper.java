package com.memcpy0.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.blog.po.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description Article代理接口
 * @date 2023/4/2 17:14
 */

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
