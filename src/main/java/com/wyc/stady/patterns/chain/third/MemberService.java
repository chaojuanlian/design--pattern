package com.wyc.stady.patterns.chain.third;


public class MemberService {


    public static void main(String[] args) {
        Handler.Builder buildHandler = new Handler.Builder();
        buildHandler.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        buildHandler.build().doHandle(new Member("张三", "123455"));
    }


}