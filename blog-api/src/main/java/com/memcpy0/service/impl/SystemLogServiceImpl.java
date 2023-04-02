package com.memcpy0.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.dao.SystemLogMapper;
import com.memcpy0.po.SystemLog;
import com.memcpy0.service.SystemLogService;
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
