package com.wyc.stady.patterns.wrapper;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        //买一个煎饼
        battercake = new BaseBattercake();
        //煎饼有点小，想再加1个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加1个鸡蛋
        battercake = new EggDecorator(battercake);
        //很饿，再加1根香肠
        battercake = new SausageDecorator(battercake);

        //与静态代理的最大区别就是职责不同
        //静态代理不一定要满足is-a的关系
        //静态代理会做功能增强，同一个职责变得不一样

        //装饰器更多考虑的是扩展
        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());
    }
}