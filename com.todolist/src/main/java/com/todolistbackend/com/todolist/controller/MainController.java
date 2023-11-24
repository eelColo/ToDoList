package com.todolistbackend.com.todolist.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.todolistbackend.com.todolist.entity.Task;
import com.todolistbackend.com.todolist.service.TaskService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/rest")
public class MainController {
	
	@Autowired
	TaskService taskServ;
	
	//Primero crear
	
	@PostMapping("/task")
	public void createTask(@ModelAttribute("ntask") @RequestBody Task task, HttpServletResponse res ) {
		taskServ.createTask(task);
		try {
			res.sendRedirect("/todolist");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
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
	@GetMapping("/task/edit/{id}")
	public void editTask(@PathVariable(value = "id") Integer idTask,@ModelAttribute("etask") Task task, HttpServletResponse res) {
		taskServ.editTask(idTask, task);
		try {
			res.sendRedirect("/todolist");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//Borrado
	@PostMapping("/task/{id}")
	public void deleteTask(@PathVariable(value = "id") int idTask, HttpServletResponse res) {
		
		taskServ.deleteTaskById(idTask);
		
		
		try {
			res.sendRedirect("/todolist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
