package com.memcpy0.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.blog.dao.TagMapper;
import com.memcpy0.blog.po.Tag;
import com.memcpy0.blog.service.TagService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 标签服务实现接口
 * @date 2023/4/2 19:57
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
}
