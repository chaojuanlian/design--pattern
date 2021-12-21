package com.wyc.stady.patterns.promotion.jvm;

/**
 * @author wangyuchao
 * @ClassName: Demo1
 * @description:
 * @date 2021/9/19上午10:13
 */
public class Demo1 {
    public static long counter = 0;

    public static void main(String[] args) {
        work();
    }

    private static void work() {
        System.out.println("目前是第"+(++counter)+"次调用方法");
        work();
    }
}
