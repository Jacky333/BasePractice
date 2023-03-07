package com.pm.threadpool;

import java.util.ArrayList;
import java.util.List;

public class LoopTask {
    private List<ChildTask> childTasks;

    public void initLoopTask() {
        childTasks = new ArrayList<>();
        childTasks.add(new ChildTask("childTask1"));
        childTasks.add(new ChildTask("childTask2"));

        for ( ChildTask childTask : childTasks) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    childTask.doExecute();
                }
            }).start();
        }
    }

    public void shutdownLoopTask() {
        if (childTasks != null && childTasks.size() > 0) {
            for (ChildTask childTask : childTasks) {
                childTask.terminal();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LoopTask loopTask = new LoopTask();
        loopTask.initLoopTask();
        Thread.sleep(5000L);
        loopTask.shutdownLoopTask();
    }
}
