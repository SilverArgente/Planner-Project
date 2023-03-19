import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task implements TaskInterface {
    String name;
    String description;
    Deadline deadline = new Deadline("", "");
    ArrayList<Task> subtasks;

    /**
     * No input parameters required
     */
    public Task() {
        this.name = "";
        this.description = "";
    }

    /**
     * Input parameters required
     * @param name task name
     * @param description task description
     * @param deadline task deadline (object)
     * @param subtasks arraylist of subtasks
     */
    public Task(String name, String description, Deadline deadline, ArrayList<Task> subtasks) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.subtasks = subtasks;
    }

    /**
     * Input parameters required
     * @param name task name
     * @param description task description
     * @param subtasks arraylist of subtasks
     */
    public Task(String name, String description, ArrayList<Task> subtasks) {
        this.name = name;
        this.description = description;
        this.subtasks = subtasks;
    }

    /**
     * Input parameters required
     * @param name task name
     * @param description task description
     */
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Input parameters required
     * @param name task name
     * @param description task description
     * @param deadline task deadline (object)
     */
    public Task(String name, String description, Deadline deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
    }

    /**
     * Name getter method
     * @return returns name variable
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Name setter method
     * @param name task name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns task description
     * @return task description
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * sets task description
     * @param description task description
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets task deadline object
     */
    @Override
    public void getDeadLine() {
        System.out.println(deadline);
    }

    /**
     * updates task deadline object
     * @param start start time to update deadline with
     */
    @Override
    public void updateDeadline(String start) {
        deadline.setDeadline(start);
    }

    /**
     * Updates task deadline
     * @param start start time
     * @param end end time
     */
    @Override
    public void updateDeadline(String start, String end) {
        deadline.setDeadline(start, end);
    }

    /**
     * toString method
     * @return returns all task information formatted correctly
     */
    public String toString() {

        System.out.println("Task Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Deadline: " + deadline + "\n" +
                "Subtasks: " + "");

        for (int i = 1; i <= subtasks.size(); i++) {
            Task temp = subtasks.get(i-1);
            System.out.println(" " + i + ". Subtask Name: " + subtasks.get(i-1).name);
            System.out.println("    Subtask Description: " + subtasks.get(i-1).description);
            System.out.print("    Subtask Deadline: ");
            subtasks.get(i-1).getDeadLine();
        }
        return "";
    }

}
