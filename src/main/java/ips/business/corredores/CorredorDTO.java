package ips.business.corredores;

import java.sql.Date;

import ips.util.Printer;

public class CorredorDTO {

	private String dniCorredor;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String sexo;
	private String email;
	private String categoria;
	//ATRIBUTOS TABLA INSCRIPCIONES
	private int idCarrera;
	private String estadoInscripcion;
	private Date fechaInscripcion;
	
	public String getDniCorredor() {
		return dniCorredor;
	}
	public void setDniCorredor(String dniCorredor) {
		this.dniCorredor = dniCorredor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getEstadoInscripcion() {
		return estadoInscripcion;
	}
	public void setEstadoInscripcion(String estadoInscripcion) {
		this.estadoInscripcion = estadoInscripcion;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
	
	public String toString() {
		return Printer.print(this);
	}
	
}
