package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.entity.cliente;
import org.cibertec.edu.pe.interfaceService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

	@Autowired
	private IClienteService servicio;
	
	//Metodo Listado
	@GetMapping("/listar")
	public String listar(Model m) {
		
		List<cliente> lista=servicio.Listado();
		m.addAttribute("clientes", lista);
		return "listar";
	}
	
	//Metodo agregar
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("clientes", new cliente());
		return "form";
	}
	
	//Metodo grabar
	@GetMapping("/guardar")
	public String guardar(cliente c,Model m) {
		servicio.Grabar(c);
		return "redirect:/listar";
	}
}
