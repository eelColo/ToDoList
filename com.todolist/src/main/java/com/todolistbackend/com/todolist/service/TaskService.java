package com.todolistbackend.com.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.todolistbackend.com.todolist.entity.Task;
import com.todolistbackend.com.todolist.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRep;

	
	//Lista 1 tarea
	public Task getTask(Integer id) {
		return taskRep.findById(id).orElse(null);
	}
	
	//Listar todas las tareas
	public List<Task> listAllTasks() {
		return taskRep.findAll();
	}
	//Crear tarea
	public void createTask(Task task) {
		taskRep.save(task);
	}
	//Borrar tarea
	public void deleteTaskById(Integer id) {
		taskRep.deleteById(id);
	}
	//Editar tarea
	public void editTask(Integer idTarea, Task taskv) {
		Task task = taskRep.findById(idTarea).orElseThrow();
		
		task.setTarea(taskv.getTarea());
		task.setTiempo(taskv.getTiempo());
		
		taskRep.save(task);
	}
	
	//Completar tarea
	public void completeTask(Integer id) {
		Task task = taskRep.findById(id).orElseThrow();
		if(task.isCompletado()) {
			task.setCompletado(true);
		} else {
			task.setCompletado(false);
		}
		
		
	}
}
