package com.wyc.stady.patterns.build.staticInner;

import lombok.Data;

/**
 * 静态内部类，的构建者内模式，代码更加简洁
 * @Date 2021/12/17 下午2:18
 * @author wangyuchao
 **/
@Data
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String note;

    private String homework;

    @Override
    public String toString() {
        return "CourseBuilder{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }

    public static class Builder {
        private Course course = new Course();

        public Builder addName(String name) {
            course.setName(name);
            return this;
        }

        public Builder addPPT(String ppt){
            course.setPpt(ppt);
            return this;
        }

        public Builder addVideo(String video){
            course.setVideo(video);
            return this;
        }

        public Builder addNote(String note){
            course.setNote(note);
            return this;
        }

        public Builder addHomework(String homework){
            course.setHomework(homework);
            return this;
        }

        public Course build(){
            return course;
        }
    }
}