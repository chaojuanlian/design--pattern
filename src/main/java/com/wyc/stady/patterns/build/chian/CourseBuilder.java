package com.wyc.stady.patterns.build.chian;

/**
 * 建造者模式的链式写法
 */
public class CourseBuilder {

    private Course course = new Course();
    /*
     * 链式编程，方法返回this对象，这样就可以使用链式编程
     * 构建模式，每个方法中设置的属性都赋值给需要构建的对象的属性上
     * build方法，返回了一个需要构建的对象
     * public方法，在初始化后new CourseBuilder()后可以调用
     * static修饰的方法，可以直接使用类名，方法名进行调用
     **/

    public CourseBuilder addName(String name){
        course.setName(name);
        return this;
    }

    public CourseBuilder addPPT(String ppt){
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video){
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note){
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework){
        course.setHomework(homework);
        return this;
    }

    public Course build(){
        return course;
    }

}