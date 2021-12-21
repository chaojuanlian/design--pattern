package com.wyc.stady.patterns.chain.third;

import org.springframework.util.StringUtils;

public class ValidateHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) ||
        StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名或者密码为空");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行");
//        重点是这里进行的调用
        nextHandle.doHandle(member);
    }
}