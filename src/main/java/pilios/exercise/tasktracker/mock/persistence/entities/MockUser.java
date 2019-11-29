package pilios.exercise.tasktracker.mock.persistence.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Objects;

public class MockUser implements Serializable {

    private static final long serialVersionUID = -2627784375313848346L;

    private static int idCounter = 1;

    private int id;
    private String userName;
    private String password;
    private List<MockTask> tasks = new ArrayList<>();

    public MockUser(String userName, String password) {
        this.id = idCounter++;
        this.userName = userName;
        this.password = password;
    }

    public MockUser(String userName, String password, List<MockTask> tasks) {
        this.id = idCounter++;
        this.userName = userName;
        this.password = password;
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MockTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<MockTask> tasks) {
        this.tasks = tasks;
    }

    public void addTasks(MockTask... tasks) {
        this.tasks.addAll(Arrays.asList(tasks));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MockUser user = (MockUser) o;
        return id == user.id &&
                Objects.equal(userName, user.userName) &&
                Objects.equal(password, user.password) &&
                Objects.equal(tasks, user.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, userName, password, tasks);
    }
}
