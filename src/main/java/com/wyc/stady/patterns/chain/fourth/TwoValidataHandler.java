package com.wyc.stady.patterns.chain.fourth;

import org.springframework.util.ObjectUtils;

/**
 * @author wangyuchao
 * @ClassName: OneValidataHandler
 * @description:
 * @date 2021/12/21下午3:27
 */
public class TwoValidataHandler extends AbstractHandler{
    @Override
    public void doHandler(Member member) {
        member.setRose("admin");
        System.out.println("软性检查通过，继续执行下一步检查");
        if (ObjectUtils.isEmpty(next)){
            System.out.println("校验不完全");
            return;
        }
        next.doHandler(member);
    }
}
