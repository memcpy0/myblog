package com.memcpy0.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.memcpy0.po.SystemUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author memcpy0
 * @version 1.0
 * @description 系统用户代理接口
 * @date 2023/4/2 19:57
 */
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {
}
