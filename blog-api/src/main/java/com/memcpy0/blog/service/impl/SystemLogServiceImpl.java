package com.memcpy0.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.blog.dao.SystemLogMapper;
import com.memcpy0.blog.po.SystemLog;
import com.memcpy0.blog.service.SystemLogService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 系统日志服务实现类
 * @date 2023/4/2 19:54
 */
@Service
public class SystemLogServiceImpl extends ServiceImpl<SystemLogMapper, SystemLog> implements SystemLogService {
}
