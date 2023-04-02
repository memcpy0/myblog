package com.memcpy0.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.memcpy0.dao.CategoryMapper;
import com.memcpy0.po.Category;
import com.memcpy0.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author memcpy0
 * @version 1.0
 * @description 专栏管理服务实现类
 * @date 2023/4/2 17:31
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
