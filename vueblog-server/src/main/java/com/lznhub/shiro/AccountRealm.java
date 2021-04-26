package com.lznhub.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 15:11
 **/
@Data
public class AccountRealm implements Serializable{

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
