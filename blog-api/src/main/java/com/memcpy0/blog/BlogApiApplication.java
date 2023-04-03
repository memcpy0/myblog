package com.memcpy0.blog;

import com.alibaba.druid.pool.DruidDataSource;
import com.memcpy0.blog.dao.ArticleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@Slf4j // lombok提供的注解,可以直接使用log变量打印日志
@SpringBootApplication
@EnableTransactionManagement
//@MapperScan("com.memcpy0.blog.dao")
public class BlogApiApplication {
    @Autowired
    private static ArticleMapper articleMapper;

    public static void main(String[] args) {

        ConfigurableApplicationContext c = SpringApplication.run(BlogApiApplication.class, args);
        String[] str = c.getBeanDefinitionNames();
        Arrays.sort(str);
        for (String s : str)
            System.out.println(s);
        Object o = c.getBean(DruidDataSource.class);
        System.out.println(o);
        if (o == null) System.out.println("sdf");
//        articleMapper.selectById(1L);
    }
}
