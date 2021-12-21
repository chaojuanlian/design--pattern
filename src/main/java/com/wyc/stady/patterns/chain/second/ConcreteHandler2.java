package com.wyc.stady.patterns.chain.second;

public class ConcreteHandler2 extends Handler {


    @Override
    public void handleRequest() {
        System.out.println("ConcreteHandler2实现代码");
        this.successor.handleRequest();
    }

}