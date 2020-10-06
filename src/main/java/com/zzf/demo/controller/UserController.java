package com.zzf.demo.controller;

import com.zzf.demo.entities.User;
import com.zzf.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/jpa/user/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
        return userRepository.getOne(id);
    }

    @GetMapping("/jpa/user")
    public User addUser(User user)
    {
        User u = userRepository.save(user);
        return  u;
    }
}
