package ips.ui.corredores;

import java.util.List;

import ips.business.BusinessException;
import ips.business.corredores.CorredorDTO;
import ips.business.corredores.CorredoresController;
import ips.persistence.corredores.CorredoresModel;

public class CorredoresView {

	public List<CorredorDTO> getCorredoresByIdCarrera(int opcionCarrera) throws BusinessException {
		CorredoresController corredoresControler= new CorredoresController(new CorredoresModel(),new CorredoresView());
        List<CorredorDTO> corredores = corredoresControler.getCorredoresByIdCarrera(opcionCarrera);
		return corredores;
    }

}
