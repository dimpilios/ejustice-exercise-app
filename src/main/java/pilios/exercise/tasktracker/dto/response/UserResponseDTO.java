package pilios.exercise.tasktracker.dto.response;

import java.io.Serializable;

public class UserResponseDTO implements Serializable {

    private static final long serialVersionUID = 4571324203976022274L;

    private int id;
    private String userName;

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
}
