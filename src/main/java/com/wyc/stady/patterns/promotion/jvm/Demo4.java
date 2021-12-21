package com.wyc.stady.patterns.promotion.jvm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wangyuchao
 * @ClassName: Demo3
 * @description:
 * @date 2021/9/19下午12:21
 */
public class Demo4 {
    public static long counter = 0;


    public static void main(String[] args) {

        work();
    }

    public static void work() {
        System.out.println("目前是第"+(++counter)+"次调用方法");
        work();
    }


}
