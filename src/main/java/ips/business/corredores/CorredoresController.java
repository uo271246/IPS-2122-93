package ips.business.corredores;

import java.util.List;

import ips.business.BusinessCheck;
import ips.business.BusinessException;
import ips.business.carreras.CarreraDisplayDTO;
import ips.business.carreras.CarrerasController;
import ips.persistence.carreras.CarrerasModel;
import ips.persistence.corredores.CorredoresModel;
import ips.ui.carreras.CarrerasView;
import ips.ui.corredores.CorredoresView;

public class CorredoresController {
	
	private CorredoresModel model;
	private CorredoresView view;
	
	public CorredoresController(CorredoresModel model, CorredoresView view) {
		this.model = model;
		this.view = view;
	}

	public List<CorredorDTO> getCorredoresByIdCarrera(int idCarrera) throws BusinessException {
		CarrerasController carrerasController = new CarrerasController(new CarrerasModel(),new CarrerasView());
		//Si da nulo es que no existe y no hay que hacer nada mas
		CarreraDisplayDTO carrera = carrerasController.findByIdCarrera(idCarrera);
		List<CorredorDTO> corredores=model.getListaCorredoresByIdCarrera(idCarrera);
		return corredores;
	}

}
