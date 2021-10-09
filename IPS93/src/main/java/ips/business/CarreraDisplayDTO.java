package ips.business;

import java.sql.Date;

public class CarreraDisplayDTO {
	private String idCarrera;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private int precio;//arreglar a double en la base de datos 

	public CarreraDisplayDTO() {
	}

	public CarreraDisplayDTO(String id, String nombre, Date fechaI, Date fechaF, int precio) {
		this.idCarrera = id;
		this.nombre = nombre;
		this.fechaInicio = fechaI;
		this.fechaFin = fechaF;
		this.precio = precio;
	}

	public String getId() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public int getPrecio() {
		return this.precio;
	}
	

	
}
