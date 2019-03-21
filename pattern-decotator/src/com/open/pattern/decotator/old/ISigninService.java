package com.open.pattern.decotator.old;

import com.open.pattern.decotator.base.ResultMsg;

public interface ISigninService {

    public ResultMsg regist(String username, String password);
    public ResultMsg login(String username,String password);
}
