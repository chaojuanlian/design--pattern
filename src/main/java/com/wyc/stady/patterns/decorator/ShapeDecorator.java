package com.wyc.stady.patterns.decorator;

/**
 * @author wangyuchao
 * @ClassName: ShapeDecorator
 * @description:
 * @date 2021/10/28下午7:53
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
