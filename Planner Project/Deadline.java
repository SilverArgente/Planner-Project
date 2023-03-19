public class Deadline implements DeadlineInterface {
    String startTime;
    String endTime;

    /**
     *
     * @param start The start time to start doing the task for the deadline
     */
    public Deadline(String start) {
        startTime = start;
    }

    /**
     *
     * @param start Start date for the deadline
     * @param end End date for the deadline
     */
    public Deadline(String start, String end) {
        startTime = start;
        endTime = end;
    }

    /**
     *
     * @param start Start time for the deadline
     */
    @Override
    public void setDeadline(String start) {
        this.startTime = start;
    }

     /**
     *
     * @param start Start date for the deadline
     * @param end End date for the deadline
     */
    @Override
    public void setDeadline(String start, String end) {
        this.startTime = start;
        this.endTime = end;
    }

    /**
     *
     * @return Returns the start time and end time formatted
     */
    public String toString() {
        if (startTime == "" && endTime == "") {
            return "none";
        }
        else if (endTime == "") {
            return startTime;
        }
        else {
            return startTime + " - " + endTime;
        }
    }
}
