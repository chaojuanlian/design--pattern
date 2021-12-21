package com.wyc.stady.patterns.chain.fourth;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * @author wangyuchao
 * @ClassName: OneValidataHandler
 * @description:
 * @date 2021/12/21下午3:27
 */
public class OneValidataHandler extends AbstractHandler{
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getUserName()) || StringUtils.isEmpty(member.getPassword())) {
            System.out.println("用户名或者密码为空，请检查");
        }
        System.out.println("强制性检查通过，继续执行下一步检查");
        if (ObjectUtils.isEmpty(next)){
            System.out.println("校验不完全");
            return;
        }
        next.doHandler(member);
    }
}
