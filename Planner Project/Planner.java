import java.util.ArrayList;

public class Planner implements PlannerInterface {
    String name;
    ArrayList<Task> tasks;

    /**
     *
     * @param name Planner name
     * @param tasks ArrayList of Task objects
     */
    public Planner(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    /**
     * Get name method
     * @return returns planner name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Setter method for name
     * @param name planner name variable
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param i the element to display the Task in the array at
     * @return returns the task at the element i
     */
    @Override
    public Task displayTask(int i) {
        // System.out.println(tasks.get(i));
        return tasks.get(i);
    }

    /**
     * Displays all tasks
     */
    @Override
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i);
        }
    }

    /**
     * Adds a task
     * @param task Task to be added
     */
    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Removes a task
     * @param i element to remove task at in array
     */
    @Override
    public void removeTask(int i) {
        tasks.remove(i);
    }

    /**
     * toString method
     * @return returns name of Planner object
     */
    public String toString() {
        return name;
    }
}
