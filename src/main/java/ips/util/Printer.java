package ips.util;

import java.util.List;

import ips.business.carreras.CarreraDisplayDTO;
import ips.business.corredores.CorredorDTO;

public class Printer {

	public static String print(CarreraDisplayDTO carrera) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Id carrera: " + carrera.getIdCarrera());
		sb.append(" ");
		sb.append("Nombre: " + carrera.getNombre());
		sb.append(" ");
		sb.append("Tipo: "+carrera.getTipo());
		sb.append(" ");
		sb.append("Precio: " + carrera.getPrecio());
		sb.append(" ");
		sb.append("Fecha inicio: " + carrera.getFechaInicio());
		sb.append(" ");
		sb.append("Fecha fin: "  + carrera.getFechaFin());
		sb.append(" ");
		sb.append("Fecha competicion: "+carrera.getFechaCompeticion());
		sb.append(" ");
		sb.append("Plazas disponibles: "+carrera.getPlazasDisponibles());
		return sb.toString();
	}
	
	public static String print(CorredorDTO corredor) {

		StringBuilder sb = new StringBuilder();
		sb.append("DNI: " + corredor.getDniCorredor());
		sb.append(" ");
		sb.append("Nombre: " + corredor.getNombre());
		sb.append(" ");
		sb.append("Categoria: " + corredor.getCategoria());
		sb.append(" ");
		sb.append("Fecha inscripcion: " + corredor.getFechaInscripcion());
		sb.append(" ");
		sb.append("Estado inscripcion: "  + corredor.getEstadoInscripcion());
		
		return sb.toString();
		
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
