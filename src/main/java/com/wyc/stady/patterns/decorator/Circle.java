package com.wyc.stady.patterns.decorator;

/**
 * @author wangyuchao
 * @ClassName: Circle
 * @description:
 * @date 2021/10/28下午7:53
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
