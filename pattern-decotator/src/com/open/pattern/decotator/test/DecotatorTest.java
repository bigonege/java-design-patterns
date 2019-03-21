package com.open.pattern.decotator.test;

import com.open.pattern.decotator.old.impl.SigninService;
import com.open.pattern.decotator.upgrade.ISigninForThirdService;
import com.open.pattern.decotator.upgrade.impl.SigninForThirdService;

public class DecotatorTest {
    public static void main(String[] args) {
        //原来的功能依旧对外开放，依旧保留
        //新的功能同样的也可以使用

        ISigninForThirdService signinForThirdService =
                new SigninForThirdService(new SigninService());

        signinForThirdService.login("zhangsan","1111");

        signinForThirdService.loginForQQ("66668888");
        signinForThirdService.loginForWechat("4353433");
    }
}
