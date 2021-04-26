package com.lznhub.controller;

import com.lznhub.common.Result;
import com.lznhub.entity.MUser;
import com.lznhub.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 14:01
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户信息",value ="用户相关")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/selectById")
    @ApiOperation("MybatisPlus搭建查询测试")
    public Object test(Long id) {
        return userService.getById(id);
    }
    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Result testUser(@Validated @RequestBody MUser user) {
        user.setLastLogin(new Date());
        userService.save(user);
        return  Result.succ("");
    }
}