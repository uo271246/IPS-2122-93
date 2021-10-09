package ips.util;

import java.util.List;

import ips.business.carreras.CarreraDisplayDTO;
import ips.business.corredores.CorredorDTO;

public class Printer {

	public static void print(CarreraDisplayDTO carrera) {

		Console.println("Id carrera: " + carrera.getIdCarrera());
		Console.println("Nombre: " + carrera.getNombre());
		Console.println("Tipo: "+carrera.getTipo());
		Console.println("Precio: " + carrera.getPrecio());
		Console.println("Fecha inicio: " + carrera.getFechaInicio());
		Console.println("Fecha fin: "  + carrera.getFechaFin());
		Console.println("Fecha competicion: "+carrera.getFechaCompeticion());
		Console.println("Plazas disponibles: "+carrera.getPlazasDisponibles());
		
	}
	
	public static void print(CorredorDTO corredor) {

		Console.println("DNI: " + corredor.getDniCorredor());
		Console.println("Nombre: " + corredor.getNombre());
		Console.println("Categoria: " + corredor.getCategoria());
		Console.println("Fecha inscripcion: " + corredor.getFechaInscripcion());
		Console.println("Estado inscripcion: "  + corredor.getEstadoInscripcion());
		
	}

	//LISTAS
	public static void printCarreras(List<CarreraDisplayDTO> carreras) {
		for(CarreraDisplayDTO carrera: carreras) {
			if(carrera != null) {
				print(carrera);
				printSaltoLinea();
			}
		}
	}
	
	public static void printCorredores(List<CorredorDTO> corredores) {
		for(CorredorDTO corredor: corredores) {
			if(corredor != null) {
				print(corredor);
				printSaltoLinea();
			}
		}
	}
	
	//AUXILIARES
	private static void printSaltoLinea(){
		Console.println();
	}
	
	public static void printBusinessException(Exception e) {
		Console.println("Ha ocurrido un problema procesando su opcion:");
		Console.println("\t- " + e.getLocalizedMessage());
	}

	

	
	

}
