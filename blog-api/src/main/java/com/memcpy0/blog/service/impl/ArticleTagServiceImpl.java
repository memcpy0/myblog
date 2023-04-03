package com.memcpy0.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.blog.dao.ArticleTagMapper;
import com.memcpy0.blog.po.ArticleTag;
import com.memcpy0.blog.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章标签管理服务实现类
 * @date 2023/4/2 17:20
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {
}
