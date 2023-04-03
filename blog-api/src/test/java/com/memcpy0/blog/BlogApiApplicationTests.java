package com.memcpy0.blog;

import com.memcpy0.blog.dao.ArticleBodyMapper;
import com.memcpy0.blog.dao.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author memcpy0
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 0:48
 */
@SpringBootTest
public class BlogApiApplicationTests {
    @Test
    void contextLoads() {
    }
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testArticleMapper() {

        System.out.println(articleMapper.selectById(3L));
    }

    @Autowired
    private ArticleBodyMapper articleBodyMapper;

    @Test
    public void testArticleBodyMapper() {
        System.out.println(articleBodyMapper.selectById(1L));
    }
}
