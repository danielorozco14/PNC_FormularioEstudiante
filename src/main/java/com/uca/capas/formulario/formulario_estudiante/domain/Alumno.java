package com.uca.capas.formulario.formulario_estudiante.domain;

public class Alumno {

	private String nombre,apellido,fechaNacimiento,lugar,colegio,telFijo,telMovil;
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getFecha() {
		return fechaNacimiento;
	}
	public String getLugar() {
		return lugar;
	}
	public String getColegio() {
		return colegio;
	}
	public String getTelFijo() {
		return telFijo;
	}
	public String getTelMovil() {
		return telMovil;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setFecha(String fecha) {
		 this.fechaNacimiento=fecha;
	}
	public void setLugar(String lugar) {
		this.lugar=lugar;
	}
	public void setColegio(String colegio) {
		this.colegio=colegio;
	}
	public void setTelFijo(String telFijo) {
		this.telFijo=telFijo;
	}
	public void setTelMovil(String telMovil) {
		this.telMovil=telMovil;
	}
	
}
