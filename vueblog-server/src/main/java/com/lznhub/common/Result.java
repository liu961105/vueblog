package com.lznhub.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 14:49
 **/
@Data
public class Result implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode(0);
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static Result succ(String mess, Object data) {
        Result m = new Result();
        m.setCode(0);
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess) {
        Result m = new Result();
        m.setCode(-1);
        m.setData(null);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess, Object data) {
        Result m = new Result();
        m.setCode(-1);
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
    public static Result fail(int code,String mess, Object data) {
        Result m = new Result();
        m.setCode(code);
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

}
