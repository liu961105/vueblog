package com.lznhub.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 15:17
 **/
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;

    private String avatar;

    private String email;
}
