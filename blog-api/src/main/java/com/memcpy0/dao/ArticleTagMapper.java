package com.memcpy0.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.po.ArticleTag;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章标签代理接口
 * @date 2023/4/2 17:18
 */
@Mapper
public interface ArticleTagMapper extends BaseMapper<ArticleTag> {

}
