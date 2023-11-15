package com.todolistbackend.com.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolistbackend.com.todolist.entity.User;
import com.todolistbackend.com.todolist.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRep;
	
	
	//Traer usuarioy
	public User findUser(Integer id) {	
		return userRep.findById(id).orElse(null);
	}
	
	//Crear usuario
	public void createUser(User user) {
		userRep.save(user);
	}
	
	//Borrar usuario
	public void deleteUserById(Integer id) {
		userRep.deleteById(id);
	}
	
	//Update usuario
	public void updateUser(Integer idUser, User newUserData) {
		User user = userRep.findById(idUser).orElseThrow();
		
		user.setNombre(newUserData.getNombre());
		user.setEmail(newUserData.getEmail());
		user.setPass(newUserData.getPass());
		
		userRep.save(user);
	}
}
