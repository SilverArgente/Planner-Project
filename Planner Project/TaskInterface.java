import java.util.ArrayList;

public interface TaskInterface {
    String getName();
    void setName(String name);
    String getDescription();
    void setDescription(String description);
    void getDeadLine();
    void updateDeadline(String start);
    void updateDeadline(String start, String end);

}
