package com.example.demo2Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user)
    {
        userRepository.save(user);
        return "user added successfully";

    }
    public List<User>getAllUsers()
    {
       return  userRepository.findAll();
    }
    public User getUser(int userid)
    {
       return userRepository.findById(userid).get();
    }
}
