package com.todolistbackend.com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolistbackend.com.todolist.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
