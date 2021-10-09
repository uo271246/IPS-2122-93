package ips.persistence;

import java.util.List;

import ips.business.CarreraDisplayDTO;
import ips.util.Database;

public class CarrerasModel {

	private Database db=new Database();
	public static final String SQL_LISTA_CARRERAS= "SELECT * FROM CARRERAS";
	public List<CarreraDisplayDTO> getListaCarreras() {
		//List<CarreraDisplayDTO> listCarreras = new ArrayList<CarreraDisplayDTO>();
		return db.executeQueryPojo(CarreraDisplayDTO.class, SQL_LISTA_CARRERAS);
	}

}
