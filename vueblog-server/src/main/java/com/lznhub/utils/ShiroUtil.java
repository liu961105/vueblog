package com.lznhub.utils;

import com.lznhub.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/26 16:35
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
