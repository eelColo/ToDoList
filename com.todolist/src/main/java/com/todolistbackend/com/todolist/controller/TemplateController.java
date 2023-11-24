package com.todolistbackend.com.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todolistbackend.com.todolist.entity.Task;
import com.todolistbackend.com.todolist.repository.TaskRepository;
import com.todolistbackend.com.todolist.service.TaskService;

@Controller

public class TemplateController {
	
	public static final String INICIO_VISTA = "index";
	
	@Autowired
	TaskService taskServ;
	
	
	@GetMapping("/")
	public String inicio(Model mo) {
		
		Task templateTask = new Task();
		
		//atributo para añadir
		mo.addAttribute("ntask", templateTask);
		
		mo.addAttribute("etask", templateTask);
		
		//atributo de listado
		mo.addAttribute("tasks", taskServ.listAllTasks());
		
		
		return INICIO_VISTA;
	}
	
	

}
