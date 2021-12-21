package com.wyc.stady.patterns.chain.fourth;

/**
 * @author wangyuchao
 * @ClassName: Test
 * @description:
 * @date 2021/12/21下午3:31
 */
public class Test {
    public static void main(String[] args) {
        AbstractHandler.Builder builder = new AbstractHandler.Builder();
        AbstractHandler build = builder.addHandler(new OneValidataHandler())
                .addHandler(new TwoValidataHandler())
                .addHandler(new ThreeValidataHandler())
                .build();
        build.doHandler(new Member("zhangsan", "2222"));
    }
}
