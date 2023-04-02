package com.memcpy0.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.dao.ArticleMapper;
import com.memcpy0.po.Article;
import com.memcpy0.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 文章管理服务实现类
 * @date 2023/4/2 17:17
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
