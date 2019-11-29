package pilios.exercise.tasktracker.mock.persistence.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MockTask implements Serializable {

    private static final long serialVersionUID = 362850910714848552L;

    private static int idCounter = 1;

    private int id;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private LocalDateTime deadlineDate;

    public MockTask(String description, LocalDateTime creationDate, LocalDateTime lastModifiedDate, LocalDateTime deadlineDate) {
        this.id = idCounter++;
        this.description = description;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.deadlineDate = deadlineDate;
    }

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
