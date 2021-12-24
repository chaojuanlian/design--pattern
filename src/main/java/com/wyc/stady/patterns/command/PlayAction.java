package com.wyc.stady.patterns.command;

/**
 * 播放命令
 * @Date 2021/12/24 上午11:34
 * @author wangyuchao
 **/
public class PlayAction implements IAction {

    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.play();
    }
		
}