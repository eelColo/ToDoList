package com.todolistbackend.com.todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="name")
	private int id;
	
	@Column(name = "tiempo")
	private String tiempo;
	
	@Column(name = "tarea")
	private String tarea;
	
	@Column(name = "completado")
	private boolean completado;

	@ManyToOne
	@JoinColumn(name="id_u")
	User id_u;
	
	public Task() {}

	public Task(int id, String tiempo, String tarea, boolean completado, User id_u) {
		super();
		this.id = id;
		this.tiempo = tiempo;
		this.tarea = tarea;
		this.completado = completado;
		this.id_u = id_u;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	public User getId_u() {
		return id_u;
	}

	public void setId_u(User id_u) {
		this.id_u = id_u;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", tiempo=" + tiempo + ", tarea=" + tarea + ", completado=" + completado + ", id_u="
				+ id_u + "]";
	}

	

	
	
	
	
	
	
	
	
	
	
}
