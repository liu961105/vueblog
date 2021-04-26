package com.lznhub.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 15:13
 **/

public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
