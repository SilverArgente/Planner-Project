/*
Author: Amogh Dalal
Final Project - Day Planner
12/13/22
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean keepRunning = true;

        ArrayList<Task> userTasks = new ArrayList<Task>();
        Planner userPlanner = new Planner("", userTasks);

        int isFirstRun = 0;

        // Keeps running after the user inputs something
        do {
            // Print main menu
            System.out.println("**********************************************");
            System.out.println("**********************************************\n");
            System.out.println("Welcome to Planner App! Help organize your day by creating different tasks with deadlines!\n");
            System.out.println("Main Menu (input the number for the function you want to complete):\n");
            System.out.println("1. Add Task to Planner");
            System.out.println("2. Change Planner Name");
            System.out.println("3. View full planner");
            System.out.println("4. Delete task");
            System.out.println("5. Exit Planner App (WARNING: Program will stop running and progress will be lost!)");

            String input = in.next();

            // Functionality based off user input
            // Add Task
            if (input.equals("1")) {
                // Starts asking user about task information
                Task task = new Task();
                task = taskInfo(task);

                //userTasks.add(task);
                userPlanner.addTask(task);

                System.out.println(task);

            }
            // Change Planner Name
            if (input.equals("2")) {
                System.out.println("Input what you want the title of your entire planner to be called: ");
                Scanner changeName = new Scanner(System.in);
                String name = changeName.nextLine();
                userPlanner.setName(name);
                System.out.println("Name successfully changed to '" + name + "'!");
            }

            // Print out planner
            if (input.equals("3")) {
                System.out.println("*****" + userPlanner.getName() + "*****\n");

                for (int i = 0; i < userTasks.size(); i++) {
                    Task temp = userPlanner.displayTask(i);
                    System.out.println(temp);

                }

                System.out.println("**********");
                Scanner view = new Scanner(System.in);
                System.out.println("Press and enter anything to get back to main menu");

                String next = view.nextLine();

                if (next != null) {
                    continue;
                }
            }

            // Remove task
            if (input.equals("4")) {
                Scanner del = new Scanner(System.in);

                System.out.println("Enter which task element you want to delete (starting from 1): ");
                int num = del.nextInt();

                if (num > userTasks.size() || num <= 0) {
                    System.out.println("Task at specified element does not exit.");
                } else {
                    num -= 1;
                    userPlanner.removeTask(num);
                    System.out.println("Task has been removed!");
                }

            }
            // Exit Program
            if (input.equals("5")) {
                keepRunning = false;
            }

        } while(keepRunning);

    }

    /**
     *
     * @param task Task to be filled out with information
     * @return Returns the Task with newly filled information by the user
     */
    public static Task taskInfo(Task task) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the name of the task: ");
        String name = s.nextLine();

        System.out.println("Input a description for this task: ");
        String descrip = s.nextLine();

        System.out.println("Deadline options (enter number):\n1. Deadline start time\n2. Deadline start time and end time\n3. No deadline");
        String deadlineOption = s.nextLine();
        String start;
        String end;

        Deadline test = new Deadline("", "");

        if (deadlineOption.equals("1")) {
            System.out.println("Input start time: ");
            start = s.nextLine();
            test = new Deadline(start);
        }
        else if (deadlineOption.equals("2")) {
            System.out.println("Input start time: ");
            start = s.nextLine();
            System.out.println("Input end time: ");
            end = s.nextLine();
            test = new Deadline(start, end);
        }
        else if (deadlineOption.equals("3")) {
            System.out.println("No deadline chosen.");
        }

        System.out.println("Enter amount of subtasks you'd like to create (0 if none)");
        int subtaskCount = s.nextInt();

        ArrayList<Task> subtasks = new ArrayList<Task>();

        for (int i = 0; i < subtaskCount; i++) {
            Task subtask = new Task();
            subtask = taskInfo(subtask);
            subtasks.add(subtask);
        }

        task = new Task(name, descrip, test, subtasks);

        return task;
    }

}