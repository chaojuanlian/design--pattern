package com.wyc.stady.patterns.command;

/**
 * @author wangyuchao
 * @ClassName: Test
 * @description:
 * @date 2021/12/24上午11:38
 */
public class Test {

    public static void main(String[] args) {
        /*
         * 控制条已经与播放器内核解耦了，以后如果想扩展新命令，只需增加命令即可，控制条的结构无须改动
         */
        GPlayer player = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }

}
