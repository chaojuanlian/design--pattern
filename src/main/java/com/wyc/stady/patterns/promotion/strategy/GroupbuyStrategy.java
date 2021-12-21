package com.wyc.stady.patterns.promotion.strategy;

public class GroupbuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团优惠");
    }
}
