package se1268.group5.project.project.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1268.group5.project.project.exception.ResourceNotFoundException;
import se1268.group5.project.project.model.User;
import se1268.group5.project.project.payload.response.UserInfoResponse;
import se1268.group5.project.project.repository.UserRepository;
import se1268.group5.project.project.service.UserService;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserInfoResponse login(String username, String password) {
        User user = userRepository.getUserByUserNameAndPassword(username, password)
                .orElseThrow(() -> new ResourceNotFoundException("login", "loginRequest", username + "+" + password));
        UserInfoResponse userInfoResponse = new UserInfoResponse(true, "Login Successfully", user);
        return userInfoResponse;
    }

    @Override
    public UserInfoResponse getInforUser(String username) {
        User user = userRepository.findUserByUserName(username)
                .orElseThrow(() -> new ResourceNotFoundException("login", "username", username));
        UserInfoResponse userInfoResponse = new UserInfoResponse(true, "get inforUser successfully", user);
        return userInfoResponse;
    }
}
