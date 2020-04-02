package com.chivisgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chivisgt.models.entity.Cliente;
import com.chivisgt.models.service.IClienteService;

@Controller
public class ClienteController {
	@Autowired
	private IClienteService clienteService;
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("cliente", clienteService.findAll());
		return"listar";
	}
	@GetMapping("/form")
	public String crear(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("tiulo", "Crear Cliente");
		model.addAttribute("cliente", cliente);
		return "form";
	}

}
