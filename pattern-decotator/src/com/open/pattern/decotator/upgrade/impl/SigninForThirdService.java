package com.open.pattern.decotator.upgrade.impl;

import com.open.pattern.decotator.base.ResultMsg;
import com.open.pattern.decotator.old.ISigninService;
import com.open.pattern.decotator.upgrade.ISigninForThirdService;

import java.util.UUID;

public class SigninForThirdService implements ISigninForThirdService {

    private ISigninService service;

    public SigninForThirdService(ISigninService service){
        this.service = service;
    }


    @Override
    public ResultMsg regist(String username, String password) {
        return service.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        //System.out.println("欢迎"+username+"登录奥鹏教学系统");
        return service.login(username,password);
    }

    @Override
    public ResultMsg loginForQQ(String userId) {

        //1、userId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为123456
        //3、调用原来的注册方法（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        System.out.println("通过QQ登录成功!");
        return loginForRegist(String.valueOf(UUID.randomUUID()),"123456");
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        System.out.println("通过Wechat登录成功!");

        return loginForRegist(String.valueOf(UUID.randomUUID()),"123456");
    }

    @Override
    public ResultMsg loginForToken(String token) {
        System.out.println("通过Token登录成功!");

        //通过token拿到用户信息，然后再重新登陆了一次
        return loginForRegist(String.valueOf(UUID.randomUUID()),"123456");
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        System.out.println("通过Telphone登录成功!");

        return loginForRegist(String.valueOf(UUID.randomUUID()),"123456");
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        this.regist(username,"123456");
        return this.login(username,"123456");
    }


}
