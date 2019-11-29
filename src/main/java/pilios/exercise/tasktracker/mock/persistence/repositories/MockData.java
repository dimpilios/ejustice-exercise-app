package pilios.exercise.tasktracker.mock.persistence.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import pilios.exercise.tasktracker.mock.persistence.entities.MockTask;
import pilios.exercise.tasktracker.mock.persistence.entities.MockUser;

@Repository
public class MockData {

    public static Map<Integer, MockUser> USERS = new HashMap<>();
    public static Map<Integer, MockTask> TASKS = new HashMap<>();
}
