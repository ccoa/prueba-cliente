package com.occoa.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	private static List<String> clientes = getClientes();
	
	private static List<String> getClientes() {
		List<String> clientes = new ArrayList<>();
		
		clientes.add("Omar");
		clientes.add("Steve");
		clientes.add("Amy");
		
		return clientes;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> listar() {
		
		return new ResponseEntity<Object>(clientes, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	public ResponseEntity<Object> listarPedidos() {
		
		List<String> pedidos = new ArrayList<>();
		
		pedidos.add("PEDIDO-1");
		pedidos.add("PEDIDO-2");
		pedidos.add("PEDIDO-3");
		
		return new ResponseEntity<Object>(pedidos, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saludo/{cliente}", method = RequestMethod.GET)
	public ResponseEntity<Object> saludar(@PathVariable("cliente") String cliente) {
		
		String saludo = "Hola " + cliente;
		
		return new ResponseEntity<Object>(saludo, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> agregar(@RequestParam("cliente") String cliente) {
		
		clientes.add(cliente);
		
		return new ResponseEntity<Object>(clientes, HttpStatus.OK);
	}
}
