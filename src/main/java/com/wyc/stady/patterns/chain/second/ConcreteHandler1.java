package com.wyc.stady.patterns.chain.second;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("ConcreteHandler1实现代码");
        this.successor.handleRequest();
    }

}