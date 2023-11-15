package com.todolistbackend.com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolistbackend.com.todolist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
