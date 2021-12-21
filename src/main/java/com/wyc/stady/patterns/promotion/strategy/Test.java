package com.wyc.stady.patterns.promotion.strategy;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys(); //返回前端，给用户做选择的
//        用户选择的key一定是我返回keys的某一个
        String selectKey = "COUPON";
        IPromotionStrategy strategy = PromotionStrategyFactory.getPromotionStrategy(selectKey);
        strategy.doPromotion();
    }
}
