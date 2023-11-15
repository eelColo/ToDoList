package com.todolistbackend.com.todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="email")
	private String email;
	
	
	
	
	public User() {
		
	}
	

	public User(int id, String nombre, String pass, String email) {
		
		this.id = id;
		this.nombre = nombre;
		this.pass = pass;
		this.email = email;
	}

	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", pass=" + pass + ", email=" + email + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
