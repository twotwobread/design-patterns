package com.programmers.java.behavioral_patterns.command;

public class RunStatus {
    private boolean status;

    public RunStatus() {
        status = true;
    }

    public boolean isRunnable() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
