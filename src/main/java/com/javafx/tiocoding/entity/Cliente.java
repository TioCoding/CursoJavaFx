package com.javafx.tiocoding.entity;

import java.time.LocalDate;

public class Cliente {
	
	private int codigo;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String dni;
	private String email;
	private LocalDate fechaDeNacimiento;
	private String estadoCivil;
	private String sexo;
	private String usuario;
	private String contrasena;
	
	public Cliente(){
		
	}

	public Cliente(int codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String email,
			LocalDate fechaDeNacimiento, String estadoCivil, String sexo, String usuario, String contrasena) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni= dni;
		this.email = email;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", dni=" + dni + ", email=" + email + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", estadoCivil=" + estadoCivil + ", sexo=" + sexo + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + "]";
	}
	
}
