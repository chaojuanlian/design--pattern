package com.wyc.stady.patterns.wrapper;

/**
 * 鸡蛋装饰器
 * @Date 2021/12/25 上午10:24
 * @author wangyuchao
 **/
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {}

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}