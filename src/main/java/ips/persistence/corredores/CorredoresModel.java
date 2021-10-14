package ips.persistence.corredores;

import java.util.List;

import ips.business.corredores.CorredorDTO;
import ips.util.Database;

public class CorredoresModel {

	private Database db=new Database();
	private final static String SQL_LISTA_CORREDORES_BY_IDCARRERA = 
	"select * from corredores c,inscripciones i where idcarrera = ? and c.dnicorredor = i.dnicorredor order by"
	+ " fechainscripcion, estadoinscripcion";
	public List<CorredorDTO> getListaCorredoresByIdCarrera(int idCarrera) {
		return db.executeQueryPojo(CorredorDTO.class,SQL_LISTA_CORREDORES_BY_IDCARRERA,idCarrera);
	}

}
