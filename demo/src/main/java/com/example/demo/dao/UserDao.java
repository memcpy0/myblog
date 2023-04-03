package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 1:52
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}