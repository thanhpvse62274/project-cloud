package se1268.group5.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se1268.group5.project.project.payload.request.LoginRequest;
import se1268.group5.project.project.payload.response.UserInfoResponse;
import se1268.group5.project.project.service.UserService;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "https://projeccloud-se1268-shoesstore.herokuapp.com")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserInfoResponse login(@RequestBody @NotNull LoginRequest request){
        UserInfoResponse response = userService.login(request.getUsername(),request.getPassword());
        return response;
    }

    @GetMapping
    public UserInfoResponse getInfoUser(@RequestParam String username){
        UserInfoResponse response = userService.getInforUser(username);
        return response;
    }
}
