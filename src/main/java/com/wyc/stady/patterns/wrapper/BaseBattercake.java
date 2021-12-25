package com.wyc.stady.patterns.wrapper;

/**
 * 基础煎饼套餐 类
 * @Date 2021/12/25 上午10:21
 * @author wangyuchao
 **/
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg(){
        return "煎饼";
    }

    @Override
    public int getPrice(){ return 5;  }
}