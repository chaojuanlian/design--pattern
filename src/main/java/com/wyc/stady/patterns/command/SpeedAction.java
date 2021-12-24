package com.wyc.stady.patterns.command;

/**
 * 拖动进度条指令
 * @Date 2021/12/24 上午11:35
 * @author wangyuchao
 **/
public class SpeedAction implements IAction {

    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.speed();
    }
		
}
