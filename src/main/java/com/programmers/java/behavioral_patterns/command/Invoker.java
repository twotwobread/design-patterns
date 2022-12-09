package com.programmers.java.behavioral_patterns.command;

import java.util.Objects;
import java.util.Scanner;

public class Invoker {
    private static final RunStatus runStatus = new RunStatus();
    private static final VoucherRepository repository = new VoucherRepository();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(runStatus.isRunnable()) {
            System.out.println("커맨드를 입력하세요 : ");
            String command = sc.nextLine();
            Command execCommand = new ExitCommand(runStatus);
            if (Objects.equals(command, "create")) {
                execCommand = new CreateCommand(repository);
            } else if (Objects.equals(command, "list")) {
                execCommand = new ListCommand(repository);
            }

            execCommand.execute();
        }
    }
}
