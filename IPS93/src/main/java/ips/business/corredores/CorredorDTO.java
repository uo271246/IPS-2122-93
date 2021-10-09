package ips.business.corredores;

import java.sql.Date;

public class CorredorDTO {

	private String dniCorredor;
	private String nombre;
	private Date fechaNacimiento;
	private String sexo;
	private String email;
	private String idCarrera;
	private Date fechaInscripcion;
	private String estadoInscripcion;
	private String categoria;
	
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
	public String getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getEstadoInscripcion() {
		return estadoInscripcion;
	}
	public void setEstadoInscripcion(String estadoInscipcion) {
		this.estadoInscripcion = estadoInscipcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
