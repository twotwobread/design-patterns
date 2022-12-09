package com.programmers.java.behavioral_patterns.command;

public class ExitCommand implements Command{

    private final RunStatus runStatus;

    public ExitCommand(RunStatus runStatus) {
        this.runStatus = runStatus;
    }

    @Override
    public void execute() {
        System.out.println("프로그램을 종료합니다.");
        runStatus.setStatus(false);
    }
}
