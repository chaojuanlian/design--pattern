package com.wyc.stady.patterns.decorator;

/**
 * @author wangyuchao
 * @ClassName: Rectangle
 * @description:
 * @date 2021/10/28下午7:52
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
