package com.occoa.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> listar() {
		
		List<String> clientes = new ArrayList<>();
		
		clientes.add("Omar");
		clientes.add("Steve");
		clientes.add("Amy");
		
		return new ResponseEntity<Object>(clientes, HttpStatus.OK);
	}
}
