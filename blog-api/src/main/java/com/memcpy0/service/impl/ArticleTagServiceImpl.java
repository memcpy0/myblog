package com.memcpy0.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.dao.ArticleTagMapper;
import com.memcpy0.po.ArticleTag;
import com.memcpy0.service.ArticleTagService;
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
