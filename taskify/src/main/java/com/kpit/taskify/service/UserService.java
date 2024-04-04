package com.kpit.taskify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.taskify.entity.User;
import com.kpit.taskify.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public String add(User us) {
        repo.save(us);
        return "User added..";
    }

    public String add(List<User> users) {
        repo.saveAll(users);
        return "Users added..";
    }

    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<User> get() {
        return repo.findAll();
    }

    public String update(User us) {
        User user = repo.findById(us.getId()).orElse(null);
        user.setFirst_name(us.getFirst_name());
        user.setLast_name(us.getLast_name());
        user.setEmail(us.getEmail());
        user.setPass(us.getPass());
        repo.save(user);
        return "User name updated..";
    }

    public String delete(int id) {
        repo.deleteById(id);
        return "User data deleted..";
    }

}
