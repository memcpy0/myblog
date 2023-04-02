package com.memcpy0.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.po.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 评论代理接口
 * @date 2023/4/2 17:38
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
