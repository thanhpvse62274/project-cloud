package se1268.group5.project.project.service;

import se1268.group5.project.project.payload.response.UserInfoResponse;

public interface UserService {
    UserInfoResponse login(String username, String password);
    UserInfoResponse getInforUser(String username);
}
