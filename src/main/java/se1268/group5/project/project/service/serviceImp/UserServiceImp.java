package se1268.group5.project.project.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1268.group5.project.project.exception.ResourceNotFoundException;
import se1268.group5.project.project.model.User;
import se1268.group5.project.project.payload.request.LoginRequest;
import se1268.group5.project.project.payload.response.LoginResponse;
import se1268.group5.project.project.repository.UserRepository;
import se1268.group5.project.project.service.UserService;
import se1268.group5.project.project.defind.Defind;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public LoginResponse login(String username, String password) {
        User user = userRepository.getUserByUserNameAndPassword(username, password)
                .orElseThrow(() -> new ResourceNotFoundException("login", "loginRequest", username + "+" + password));
        LoginResponse loginResponse = new LoginResponse(true, "Login Successfully", user);
        return loginResponse;
    }
}
