package com.wyc.stady.patterns.decorator;

/**
 * @author wangyuchao
 * @ClassName: RedShapeDecorator
 * @description:
 * @date 2021/10/28下午7:56
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
