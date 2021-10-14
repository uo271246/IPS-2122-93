package ips.business.carreras;

import java.sql.Date;

import ips.util.Printer;

public class CarreraDisplayDTO {
	private int idCarrera;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private Date fechaCompeticion;
	private double precio;//arreglar a double en la base de datos 
	private double distancia;
	private String tipo;
	private int plazasDisponibles;
	
	public Date getFechaCompeticion() {
		return fechaCompeticion;
	}

	public void setFechaCompeticion(Date fechaCompeticion) {
		this.fechaCompeticion = fechaCompeticion;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	public CarreraDisplayDTO() {
	}

	public CarreraDisplayDTO(int id, String nombre, Date fechaI, Date fechaF, int precio,
			double distancia, Date fechaC, String tipo ) {
		this.idCarrera = id;
		this.nombre = nombre;
		this.fechaInicio = fechaI;
		this.fechaFin = fechaF;
		this.precio = precio;
		this.distancia = distancia;
		this.fechaCompeticion = fechaC;
		this.tipo = tipo;
	}


	public void setIdCarrera(int idCarrera) {
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

	public String getNombre() {
		return this.nombre;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}
	
	
	public String toString() {
		
		return Printer.print(this);
	}

	
}
