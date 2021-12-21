package com.wyc.stady.patterns.promotion.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyuchao
 * @ClassName: Demo2
 * @description:
 * @date 2021/9/19上午10:40
 */
public class Demo2 {
    public static void main(String[] args) {
        long counter = 0;
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
            System.out.println("当前创建了第"+(++counter)+"个对象");
        }
    }
}
