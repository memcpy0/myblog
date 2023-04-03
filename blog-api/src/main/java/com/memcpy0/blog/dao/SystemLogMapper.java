package com.memcpy0.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.blog.po.SystemLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 系统日志代理接口
 * @date 2023/4/2 19:52
 */
@Mapper
public interface SystemLogMapper extends BaseMapper<SystemLog> {

}
