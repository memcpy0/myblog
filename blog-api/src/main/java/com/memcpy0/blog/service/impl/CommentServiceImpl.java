package com.memcpy0.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.blog.dao.CommentMapper;
import com.memcpy0.blog.po.Comment;
import com.memcpy0.blog.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 评论服务实现类
 * @date 2023/4/2 17:39
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
}
