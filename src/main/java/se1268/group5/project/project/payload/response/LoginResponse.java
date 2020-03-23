package se1268.group5.project.project.payload.response;

import se1268.group5.project.project.model.User;

public class LoginResponse extends ApiResponse {

    private User user;

    public LoginResponse(Boolean success, String message, User user) {
        super(success, message);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
