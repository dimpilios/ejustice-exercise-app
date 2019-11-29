package pilios.exercise.tasktracker.mock.persistence.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pilios.exercise.tasktracker.dto.request.TaskRequestDTO;
import pilios.exercise.tasktracker.mock.persistence.entities.MockTask;
import pilios.exercise.tasktracker.mock.persistence.entities.MockUser;

@Repository
public class MockTaskRepository {

    @Autowired
    private MockUserRepository userRepository;

    public MockTask createTask(int userId, TaskRequestDTO taskRequestDTO) throws Exception {
        MockUser user = userRepository.findById(userId);
        MockTask task = new MockTask(taskRequestDTO.getDescription(), LocalDateTime.now(), LocalDateTime.now(), taskRequestDTO.getDeadlineDate() == null ? LocalDateTime.now().plusDays(10) : taskRequestDTO.getDeadlineDate());
        user.getTasks().add(task);
        MockData.TASKS.put(task.getId(), task);
        return task;
    }

    public MockTask updateTask(int taskId, TaskRequestDTO taskRequestDTO) throws Exception {
        MockTask task = findById(taskId);
        task.setDescription(taskRequestDTO.getDescription());
        task.setDeadlineDate(taskRequestDTO.getDeadlineDate());
        return task;
    }

    public void deleteTask(int taskId) throws Exception {
        MockTask task = findById(taskId);

        MockUser user = MockData.USERS.entrySet()
                .stream()
                .map(e -> e.getValue())
                .filter(user1 -> user1.getTasks().stream().anyMatch(task1 -> task1.getId() == taskId))
                .findFirst()
                .get();

        user.getTasks().remove(task);
        MockData.TASKS.remove(taskId);
    }

    public List<MockTask> getUserTasks(int userId) {
        return MockData.USERS.get(userId).getTasks();
    }

    public MockTask findById(int taskId) {
        return MockData.TASKS.get(taskId);
    }
}
