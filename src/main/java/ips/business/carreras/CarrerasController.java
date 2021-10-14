package ips.business.carreras;

import java.util.List;

import ips.business.BusinessCheck;
import ips.business.BusinessException;
import ips.persistence.carreras.CarrerasModel;
import ips.ui.carreras.CarrerasView;

public class CarrerasController {

	private CarrerasModel model;
	private CarrerasView view;
	
	public CarrerasController(CarrerasModel m, CarrerasView v) {
		this.model = m;
		this.view = v;
	}
	
	public  List<CarreraDisplayDTO> getListaCarreras() throws BusinessException {
		List<CarreraDisplayDTO> carreras=model.getListaCarreras();
		BusinessCheck.isTrue(!carreras.isEmpty(),"No hay carreras disponibles");
		return carreras;
		
		
	}

	public CarreraDisplayDTO findByIdCarrera(int idCarrera) throws BusinessException {
		List<CarreraDisplayDTO> carrera = model.getCarreraByIdCarrera(idCarrera);
		BusinessCheck.isTrue(!carrera.isEmpty(),"La carrera no existe");
		return carrera.get(0);
	}
}
