package com.wyc.stady.patterns.promotion.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFactory {
    private static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CashbackStrategy());
    }

    private PromotionStrategyFactory(){}

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String GROUPBUY = "GROUPBUY";
        String CASHBACK = "CASHBACK";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }
}
