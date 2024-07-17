package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="promociones")
public class promociones {

	
	// Atributos 
	//id_promocion, Nombre, Descuento, FechaInicio, FechaFin


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_promocion")
	private int idpromociones;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Descuento")
	private double descuento;
	@Column(name = "FechaInicio")
	private Date fechainicio;
	@Column(name = "FechaFin")
	private Date fechafin;
	
	
	// Constructor 
	
	public promociones() { }

	
	public promociones(int idpromociones, String nombre, double descuento, Date fechainicio, Date fechafin) {
		
		this.idpromociones = idpromociones;
		this.nombre = nombre;
		this.descuento = descuento;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}




	

	public int getIdpromociones() {
		return idpromociones;
	}


	public void setIdpromociones(int idpromociones) {
		this.idpromociones = idpromociones;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public Date getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}


	public Date getFechafin() {
		return fechafin;
	}


	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}


	@Override
	public String toString() {
		return "promociones [idpromociones=" + idpromociones + ", nombre=" + nombre + ", descuento=" + descuento
				+ ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + "]";
	}
}

