package com.wyc.stady.patterns.command;

/**
 * 暂停指令
 * @Date 2021/12/24 上午11:35
 * @author wangyuchao
 **/
public class PauseAction implements IAction {

    private GPlayer gplayer;

    public PauseAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.pause();
    }
		
}