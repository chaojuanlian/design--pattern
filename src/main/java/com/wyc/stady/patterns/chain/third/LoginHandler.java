package com.wyc.stady.patterns.chain.third;


public class LoginHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        nextHandle.doHandle(member);
    }
}