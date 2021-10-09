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

public class MenuRolSelection {
	public static void main(String[] args) throws BusinessException {
		 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Organizador");
            System.out.println("2. Corredor");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                //todo esto a la ista de cada clase view
                switch (opcion) {
                    case 1:
                    	MenuOrganizador mO = new MenuOrganizador();
                    	mO.execute();
                        break;
                    case 2:
                    	MenuCorredor mC = new MenuCorredor();
                    	mC.execute();
    	                break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
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
