package com.open.pattern.decotator.old.impl;

import com.open.pattern.decotator.base.ResultMsg;
import com.open.pattern.decotator.model.User;
import com.open.pattern.decotator.old.ISigninService;

public class SigninService implements ISigninService {
    @Override
    public ResultMsg regist(String username, String password) {
        return  new ResultMsg(200,"注册成功",new User());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return  new ResultMsg(200,"登录成功",new User());
    }
}
