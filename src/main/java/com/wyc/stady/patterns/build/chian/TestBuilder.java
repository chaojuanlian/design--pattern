package com.wyc.stady.patterns.build.chian;

/**
 * @author wangyuchao
 * @ClassName: TestBuilder
 * @description:
 * @date 2021/12/17下午2:04
 */
public class TestBuilder {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式")
                .addPPT("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】");

        System.out.println(builder.build());
    }
}
