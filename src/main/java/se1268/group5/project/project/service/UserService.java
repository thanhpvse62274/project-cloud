package se1268.group5.project.project.service;

import se1268.group5.project.project.payload.request.LoginRequest;
import se1268.group5.project.project.payload.response.LoginResponse;

public interface UserService {
    LoginResponse login(String username, String password);
}
