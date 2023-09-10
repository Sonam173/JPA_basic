package com.example.demo2Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @GetMapping("/getAllUsers")
    public List<User>getAllUser()
    {
       return userService.getAllUsers();
    }
    @GetMapping("/getUser")
    public User getUser(@RequestParam("userid") int userid)
    {
        return userService.getUser(userid);
    }
}
