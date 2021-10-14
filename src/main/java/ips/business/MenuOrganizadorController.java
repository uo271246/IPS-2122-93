package ips.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import ips.business.carreras.CarreraDisplayDTO;
import ips.business.carreras.CarrerasController;
import ips.business.corredores.CorredorDTO;
import ips.business.corredores.CorredoresController;
import ips.persistence.carreras.CarrerasModel;
import ips.persistence.corredores.CorredoresModel;
import ips.ui.MenuOrganizadorView;
import ips.ui.carreras.CarrerasView;
import ips.ui.corredores.CorredoresView;
import ips.util.Printer;

public class MenuOrganizadorController {

	private MenuOrganizadorView view;
	
	public MenuOrganizadorController(MenuOrganizadorView view) {
		this.view = view;
	}


	public void initController() {
		inicializarComboBox();
		//view.getBtnOrganizador().addActionListener(accionBotonOrganizador());
		
	}
	

	private void inicializarComboBox() {
		view.getCbOpciones().addItem("Ver estado de la competicion");  
		view.getBtnGo().addActionListener(accionBotonGo(view.getCbOpciones().getSelectedIndex()));
		view.getBtnBuscarCorredores().addActionListener(accionBotonBuscarCorredores(view.getCbCarreras().getSelectedIndex()));
		
	}


	//Acciones
	
	private ActionListener accionBotonBuscarCorredores(Object index) {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CorredoresController carreraController = new CorredoresController(new CorredoresModel(),
						new CorredoresView());
				try {
					DefaultListModel<CorredorDTO> dlm = new DefaultListModel<CorredorDTO>();
					dlm.addAll(carreraController.getCorredoresByIdCarrera(((CarreraDisplayDTO)(view.getCbCarreras().getSelectedItem())).getIdCarrera()));
					view.getListCorredores().setModel(dlm);
				} catch (BusinessException e1) {
					Printer.printBusinessException(e1);
				}
			}
		};
	}
	
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
						CarreraDisplayDTO[] carreras = arrayListToArray(listaCarreras);
						view.getCbCarreras().setModel(new DefaultComboBoxModel<CarreraDisplayDTO>(carreras));
						view.getBtnBuscarCorredores().setEnabled(true);
						view.getListCorredores().setEnabled(true);
					} catch (BusinessException e1) {
						Printer.printBusinessException(e1);
						break;
					}
						
						
				}
			}

			private CarreraDisplayDTO[] arrayListToArray(List<CarreraDisplayDTO> listaCarreras) {
				CarreraDisplayDTO[] list = new CarreraDisplayDTO[listaCarreras.size()];
				for(int i = 0; i<listaCarreras.size();i++) {
					list[i] = listaCarreras.get(i);
				}
				return list;
			}
		};
	}
	
	
}
