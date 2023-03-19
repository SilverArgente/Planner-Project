import java.util.ArrayList;

public interface PlannerInterface {
    String getName();
    void setName(String name);
    Task displayTask(int i);
    void displayTasks();
    void addTask(Task task);
    void removeTask(int i);

}
