package md.tekwill.main;

import md.tekwill.console.ConsoleMenu;
import md.tekwill.task.TaskManager;

import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        ConsoleMenu menu = new ConsoleMenu(taskManager, scanner);

        menu.run();
    }
}
