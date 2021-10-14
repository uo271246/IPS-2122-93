package ips.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import ips.business.BusinessException;
import ips.business.carreras.CarreraDisplayDTO;
import ips.ui.carreras.CarrerasView;
import ips.util.Printer;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class MenuCorredorView extends JFrame{
	private JComboBox cbCorredores;
	private JScrollPane scrollPane;
	private JList listCorredores;
	private JButton btnGo;
	
	public MenuCorredorView() {

		setBounds(100, 100, 854, 427);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		getContentPane().add(getCbCorredores());
		getContentPane().add(getScrollPane());
		getContentPane().add(getBtnGo());
	}
	/*public void execute() throws BusinessException{
		 
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
 
    }*/
	public JComboBox getCbCorredores() {
		if (cbCorredores == null) {
			cbCorredores = new JComboBox();
			cbCorredores.setBounds(57, 41, 316, 30);
		}
		return cbCorredores;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(121, 107, 209, 146);
			scrollPane.setViewportView(getListCorredores());
		}
		return scrollPane;
	}
	public JList getListCorredores() {
		if (listCorredores == null) {
			listCorredores = new JList();
		}
		return listCorredores;
	}
	public JButton getBtnGo() {
		if (btnGo == null) {
			btnGo = new JButton("Go");
			btnGo.setBounds(171, 81, 85, 21);
		}
		return btnGo;
	}
}
