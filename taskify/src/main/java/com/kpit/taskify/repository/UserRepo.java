package com.kpit.taskify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpit.taskify.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
