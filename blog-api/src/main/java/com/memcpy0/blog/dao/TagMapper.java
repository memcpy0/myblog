package com.memcpy0.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.blog.po.Tag;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 标签代理接口
 * @date 2023/4/2 19:58
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {
}
