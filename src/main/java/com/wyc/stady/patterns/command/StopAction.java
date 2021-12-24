package com.wyc.stady.patterns.command;


/**
 * 关闭指令
 * @Date 2021/12/24 上午11:37
 * @author wangyuchao
 **/
public class StopAction implements IAction {

    private GPlayer gplayer;

    public StopAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.stop();
    }
}