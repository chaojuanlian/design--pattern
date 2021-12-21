package com.wyc.stady.patterns.chain.first;

import org.springframework.util.StringUtils;

public class MemberService {

    public void unusedPatternLogin(String loginName,String loginPass){
        if(StringUtils.isEmpty(loginName) ||
                StringUtils.isEmpty(loginPass)){
            System.out.println("用户名和密码校验为空，请检查");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");

        Member member = unusedPatternCheckExists(loginName,loginPass);
        if(null == member){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");

        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");

    }

    private Member unusedPatternCheckExists(String loginName,String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }

    public static void main(String[] args) {
        MemberService service = new MemberService();
//        service.unusedPatternLogin("tom","666");
        service.login("tom","666");
    }

    public void login(String loginName,String loginPass){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandle(new Member(loginName,loginPass));
    }

}