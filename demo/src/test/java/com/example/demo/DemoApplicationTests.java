package com.example.demo;

import com.example.demo.dao.ArticleMapper;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private UserDao userDao;
    @Test
    public void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void testArticleBodyMapper() {

        System.out.println(articleMapper.selectById(1L));
    }
}