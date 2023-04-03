package com.memcpy0.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.blog.dao.SystemUserMapper;
import com.memcpy0.blog.po.SystemUser;
import com.memcpy0.blog.service.SystemUserService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description TODO
 * @date 2023/4/2 19:56
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser> implements SystemUserService {
}
