package com.markjfoster.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class ToDoList {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return(false);
        }
        return(true);
    }
}

class Main {
    public static void main(String[] args) {
        List<String> task = new ArrayList<String>();
        int tasks = 0;
        String answer;
        int ans;
        int ch = 999;
        do {
            System.out.println("\n\t:To-Do List:");
            System.out.println("(1)  Add a task.");
            System.out.println("(2)  Remove a task.");
            System.out.println("(3)  Update a task.");
            System.out.println("(4)  List all tasks.");
            System.out.println("(0)  Exit.");
            Scanner reader = new Scanner(in);
            answer = reader.nextLine();
            if (!ToDoList.isInteger(answer)) {
                System.out.println("Invalid command");
            } else {
                ch = Integer.parseInt(answer);
                switch (ch) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Task: ");
                        answer = reader.nextLine();
                        task.add(answer);
                        ++tasks;
                        break;
                    case 2:
                        System.out.print("Please enter the task to remove: ");
                        answer = reader.nextLine();
                        if (!ToDoList.isInteger(answer)) {
                            System.out.println("Invalid command");
                            break;
                        } else {
                            ans = Integer.parseInt(answer);
                            if (ans < 0 || ans >= tasks) {
                                System.out.println("Invalid selection");
                                break;
                            }
                        }
                        task.remove(ans);
                        --tasks;
                        break;
                    case 3:
                        System.out.println("Please enter the task to be updated");
                        int i = 0;
                        for (String t : task) {
                            System.out.print(i++ + ": ");
                            System.out.println(t);
                        }
                        System.out.print("Update which item? ");
                        answer = reader.nextLine();
                        if (!ToDoList.isInteger(answer)) {
                            System.out.println("Invalid command");
                            break;
                        } else {
                            ans = Integer.parseInt(answer);
                            if (ans < 0 || ans >= tasks) {
                                System.out.println("Invalid selection");
                                break;
                            }
                        }
                        System.out.print("Task: ");
                        answer = reader.nextLine();
                        task.remove(ans);
                        task.add(answer);
                        break;
                    case 4:
                        i = 0;
                        for (String t : task) {
                            System.out.print(i++ + ": ");
                            System.out.println(t);
                        }
                        break;
                }
            }
        }
        while (ch != 0);
    }
}