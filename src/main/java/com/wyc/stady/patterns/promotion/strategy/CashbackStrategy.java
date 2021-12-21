package com.wyc.stady.patterns.promotion.strategy;

public class CashbackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现，打到支付宝账号");
    }
}
