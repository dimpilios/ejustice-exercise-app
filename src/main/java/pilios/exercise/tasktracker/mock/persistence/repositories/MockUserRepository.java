package pilios.exercise.tasktracker.mock.persistence.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import pilios.exercise.tasktracker.mock.persistence.entities.MockUser;

@Repository
public class MockUserRepository {

    public MockUser create(String username, String password) throws Exception {
        if (!StringUtils.hasText(username) || !StringUtils.hasText(password)) {
            throw new Exception("MockUser cannot be created. Invalid credentials. Credentials should not be empty.");
        }

        if (MockData.USERS.entrySet()
                .stream()
                .map(e -> e.getValue())
                .anyMatch(user -> user.getUserName().equals(username) || user.getUserName().equals(password))
        ) {
            throw new Exception("MockUser cannot be created. Invalid credentials. There is already an existing user with same credentials.");
        }

        MockUser newUser = new MockUser(username, password);
        MockData.USERS.put(newUser.getId(), newUser);
        return newUser;
    }

    public MockUser findById(int id) {
        return MockData.USERS.get(id);
    }

    public Optional<MockUser> findByCredentials(String username, String password) {
        return MockData.USERS.entrySet()
                .stream()
                .map(e -> e.getValue())
                .filter(user -> user.getUserName().equals(username) && user.getUserName().equals(password))
                .findFirst();
    }
}
