package com.wyc.stady.patterns.promotion.strategy;

public class EmptyStrategy implements IPromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无优惠活动");
    }
}
