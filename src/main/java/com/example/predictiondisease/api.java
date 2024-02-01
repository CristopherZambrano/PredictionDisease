package com.example.predictiondisease;

import Controllers.UserController;
import Models.User;
import java.util.List;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class api {
    @PostMapping("/registerDoctor")
    public void registerDoctor (Request request){

    }

    @GetMapping(path = "/")
    public List<User> message(){
        UserController user = new UserController();
        return user.getUsers();
    }

}
