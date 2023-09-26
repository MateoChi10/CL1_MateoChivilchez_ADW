package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import org.cibertec.edu.pe.entity.cliente;

public interface IClienteService {
	public List<cliente> Listado();
	public int Grabar(cliente ObjC);
}
