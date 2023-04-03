package com.memcpy0.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.blog.po.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 专栏代理接口
 * @date 2023/4/2 17:30
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
