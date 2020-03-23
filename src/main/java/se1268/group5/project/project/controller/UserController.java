package se1268.group5.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se1268.group5.project.project.model.User;
import se1268.group5.project.project.payload.request.LoginRequest;
import se1268.group5.project.project.payload.response.LoginResponse;
import se1268.group5.project.project.repository.UserRepository;
import se1268.group5.project.project.service.UserService;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @NotNull LoginRequest request){
        LoginResponse response = userService.login(request.getUsername(),request.getPassword());
        return response;
    }
}
