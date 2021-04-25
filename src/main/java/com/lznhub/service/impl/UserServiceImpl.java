package com.lznhub.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lznhub.entity.MUser;
import com.lznhub.mapper.UserMapper;
import com.lznhub.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 14:02
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, MUser> implements UserService{
}
