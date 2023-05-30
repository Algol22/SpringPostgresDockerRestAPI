package com.RestAPI.RestAPI;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {



    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

}