package com.wyc.stady.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制条
 * @Date 2021/12/24 上午11:37
 * @author wangyuchao
 **/
public class Controller {
    private List<IAction> actions = new ArrayList<IAction>();
    public void addAction(IAction action){
        actions.add(action);
    }

    public void execute(IAction action){
        action.execute();
    }

    public void executes(){
        for(IAction action : actions){
            action.execute();
        }
        actions.clear();
    }
}