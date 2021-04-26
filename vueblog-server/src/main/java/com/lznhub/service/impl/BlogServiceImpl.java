package com.lznhub.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lznhub.entity.Blog;
import com.lznhub.mapper.BlogMapper;
import com.lznhub.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/26 16:16
 **/
@Service
public class BlogServiceImpl  extends ServiceImpl<BlogMapper,Blog> implements BlogService {
}
