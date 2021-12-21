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
public class Demo3 {

    public static void main(String[] args) {
        long counter = 0;
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Car.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if (method.getName().equals("run")) {
                        System.out.println("启动汽车之间，先进行自动的安全检查……");
                        return methodProxy.invokeSuper(o, objects);
                    } else {
                        return methodProxy.invokeSuper(o, objects);
                    }
                }
            });

            Car car = (Car) enhancer.create();
            car.run();

            System.out.println("目前创建类"+(++counter)+"个Car类的子类了");
        }
    }

    static class Car{
        public void run(){
            System.out.println("汽车启动，开始行驶……");
        }
    }

    static class SafeCar extends Car{
        @Override
        public void run() {
            System.out.println("汽车启动，开始行驶……");
            super.run();
        }
    }
}
