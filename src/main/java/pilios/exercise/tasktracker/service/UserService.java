package pilios.exercise.tasktracker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pilios.exercise.tasktracker.dto.response.UserResponseDTO;

@Service
public class UserService {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public UserResponseDTO createUser(String username, String password) {
        return null;
    }

    public UserResponseDTO loginUser(String username, String password) {
        //TODO: find and return user, raise exception if user not found
        return null;
    }

    public void logoutUser(int userId) {
        //TODO: find user and just return, if not found raise exception
    }
}
