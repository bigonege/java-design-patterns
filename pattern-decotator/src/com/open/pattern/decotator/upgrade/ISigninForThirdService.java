package com.open.pattern.decotator.upgrade;

import com.open.pattern.decotator.base.ResultMsg;
import com.open.pattern.decotator.old.ISigninService;

public interface ISigninForThirdService extends ISigninService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegist(String username,String password);
}
