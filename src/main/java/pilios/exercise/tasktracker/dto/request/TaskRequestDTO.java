package pilios.exercise.tasktracker.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TaskRequestDTO implements Serializable {

    private static final long serialVersionUID = -2505856036146264121L;

    private String description;
    private LocalDateTime deadlineDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDateTime deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}
