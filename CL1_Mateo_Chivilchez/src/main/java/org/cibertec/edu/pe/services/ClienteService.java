package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.entity.cliente;
import org.cibertec.edu.pe.interfaceService.IClienteService;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente data;
	
	@Override
	public List<cliente> Listado() {
		
		return (List<cliente>)data.findAll();
	}

	@Override
	public int Grabar(cliente ObjC) {
		int rpta = 0;
		cliente c = data.save(ObjC);
		if(!c.equals(null))rpta=1;
		return rpta;
	}

}
