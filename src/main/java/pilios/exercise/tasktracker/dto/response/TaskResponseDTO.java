package pilios.exercise.tasktracker.dto.response;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TaskResponseDTO implements Serializable {

    private static final long serialVersionUID = -8015630916280421154L;

    private int id;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private LocalDateTime deadlineDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public LocalDateTime getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDateTime deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}
