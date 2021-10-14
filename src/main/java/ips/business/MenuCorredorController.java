package ips.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;

import ips.business.carreras.CarreraDisplayDTO;
import ips.business.carreras.CarrerasController;
import ips.persistence.carreras.CarrerasModel;
import ips.ui.MenuCorredorView;
import ips.ui.carreras.CarrerasView;
import ips.util.Printer;

public class MenuCorredorController {

	private MenuCorredorView view;
	
	public MenuCorredorController(MenuCorredorView view) {
		this.view = view;
	}


	public void initController() {
		inicializarComboBox();
		//view.getBtnOrganizador().addActionListener(accionBotonOrganizador());
		
	}
	

	private void inicializarComboBox() {
		view.getCbCorredores().addItem("Ver competiciones abiertas");  
		view.getBtnGo().addActionListener(accionBotonGo(view.getCbCorredores().getSelectedIndex()));
	}


	
	
	
	//Acciones
	private ActionListener accionBotonGo(int index) {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CarrerasController carreraController = new CarrerasController(new CarrerasModel(),new CarrerasView());
				switch(index) {
					case 0:
						
					try {
						List<CarreraDisplayDTO> listaCarreras = carreraController.getListaCarreras();
						DefaultListModel dlm = new DefaultListModel();
						dlm.addAll(listaCarreras);
						view.getListCorredores().setModel(dlm);
					} catch (BusinessException e1) {
						Printer.printBusinessException(e1);
						break;
					}
						
						
				}
			}
		};
	}
	
	
}
