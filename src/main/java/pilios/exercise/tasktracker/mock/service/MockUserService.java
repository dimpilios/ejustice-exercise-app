package pilios.exercise.tasktracker.mock.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pilios.exercise.tasktracker.dto.response.UserResponseDTO;

@Service
public class MockUserService {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public UserResponseDTO createUser(String username, String password) {
        return null;
    }

    public UserResponseDTO loginUser(String username, String password) {
        return null;
    }

    public void logoutUser(int userId) {
    }
}
