package com.wx.learning.core.listener;

import org.springframework.context.SmartLifecycle;

public class DBLifecycleListener implements SmartLifecycle {
    private boolean isRunning = false;
    public void start() {
        isRunning = true;
        System.out.println("==========start===========");
    }

    public void stop() {
        isRunning = false;
        System.out.println("-----------stop------------");
    }

    public boolean isRunning() {
        System.out.println("-----------isRunning------------");
        return isRunning;
    }

    public boolean isAutoStartup() {
        System.out.println("-----------isAutoStartup------------");
        return true;
    }

    public void stop(Runnable callback) {
        System.out.println("-----------stop callback------------");
        callback.run();
    }

    public int getPhase() {
        return 0;
    }
}
