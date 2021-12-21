package com.wyc.stady.patterns.chain.fourth;

import org.springframework.util.ObjectUtils;

/**
 * @author wangyuchao
 * @ClassName: OneValidataHandler
 * @description:
 * @date 2021/12/21下午3:27
 */
public class ThreeValidataHandler extends AbstractHandler {
    @Override
    public void doHandler(Member member) {
        if (!"admin".equals(member.getRose())) {
            System.out.println("用户权限不足，请联系管理员");
        }
        System.out.println("最终检查通过，继续执行下一步检查");
        if (ObjectUtils.isEmpty(next)){
            System.out.println("校验完成，您可以继续执行");
            return;
        }
        next.doHandler(member);
    }
}
