package com.kpit.taskify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.taskify.entity.User;
import com.kpit.taskify.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    private String addUser(@RequestBody User us) {
        return service.add(us);
    }

    @PostMapping("/addUsers")
    private String addUsers(@RequestBody List<User> users) {
        return service.add(users);
    }

    @GetMapping("/users")
    private List<User> getUsers() {
        return service.get();
    }

    @GetMapping("/userById/{id}")
    private User getUserById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/updateUser")
    private String updateUser(@RequestBody User us) {
        return service.update(us);
    }

    @DeleteMapping("/delete/{id}")
    private String deleteUser(@PathVariable int id) {
        return service.delete(id);
    }

}
