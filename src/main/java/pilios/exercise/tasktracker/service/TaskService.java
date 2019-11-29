package pilios.exercise.tasktracker.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pilios.exercise.tasktracker.dto.request.TaskRequestDTO;
import pilios.exercise.tasktracker.dto.response.TaskResponseDTO;

@Service
public class TaskService {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public TaskResponseDTO createTask(int userId, TaskRequestDTO taskCreationDTO) throws Exception {
        return null;
    }

    public TaskResponseDTO updateTask(int taskId, TaskRequestDTO taskRequestDTO) throws Exception {
        return null;
    }

    public void deleteTask(int taskId) {
    }

    public List<TaskResponseDTO> getUserTasks(int userId) {
        return null;
    }
}
