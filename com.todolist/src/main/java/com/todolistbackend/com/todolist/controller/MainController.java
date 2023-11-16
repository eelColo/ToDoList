package com.todolistbackend.com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolistbackend.com.todolist.entity.Task;
import com.todolistbackend.com.todolist.service.TaskService;

@RestController
@RequestMapping("/rest")
public class MainController {
	
	@Autowired
	TaskService taskServ;
	
	//Primero crear
	
	@PostMapping("/task")
	public void createTask(@RequestBody Task task) {
		taskServ.createTask(task);
	}
	
	//Listar todas
	@GetMapping("/task")
	public List<Task> listOfTask() {
		return taskServ.listAllTasks();
		
	}
	
	//Listar por id
	@GetMapping("/task/{id}")
	public Task findTask(@PathVariable(value = "id") Integer idTask){
		return taskServ.getTask(idTask);
	}
	
	//Editar
	@PutMapping("/task/{id}")
	public void editTask(@PathVariable(value = "id") Integer idTask,@RequestBody Task task) {
		taskServ.editTask(idTask, task);
	}
	@DeleteMapping("/task/{id}")
	public void deleteTask(@PathVariable(value = "id") Integer idTask) {
		taskServ.deleteTaskById(idTask);
	}
	
	
}
