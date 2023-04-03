package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Article;
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
