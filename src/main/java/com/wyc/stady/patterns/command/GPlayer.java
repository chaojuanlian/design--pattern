package com.wyc.stady.patterns.command;

/**
 * 播放器内核类
 * @Date 2021/12/24 上午11:32
 * @author wangyuchao
 **/
public class GPlayer {

    public void play(){
        System.out.println("正常播放");
    }

    public void speed(){
        System.out.println("拖动进度条");
    }

    public void stop(){
        System.out.println("停止播放");
    }

    public void pause(){
        System.out.println("暂停播放");
    }
}