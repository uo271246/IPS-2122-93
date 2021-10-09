package ips.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ips.business.BusinessException;
import ips.business.carreras.CarreraDisplayDTO;
import ips.business.corredores.CorredorDTO;
import ips.ui.carreras.CarrerasView;
import ips.ui.corredores.CorredoresView;
import ips.util.Printer;

public class MenuCorredor {
	public void execute() throws BusinessException{
		 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Ver competiciones abiertas");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                //todo esto a la ista de cada clase view
                switch (opcion) {
                    case 1:
                    	CarrerasView carrerasView = new CarrerasView();
                    	List<CarreraDisplayDTO> carreras1 = carrerasView.getCompeticiones();
                        System.out.println("Has seleccionado la opcion 1");
                        Printer.printCarreras(carreras1);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
    	                break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            } catch(BusinessException e) {
            	Printer.printBusinessException(e);
            }
        }
 
    }
}
