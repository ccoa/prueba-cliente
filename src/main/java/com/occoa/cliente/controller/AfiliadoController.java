package com.occoa.cliente.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afiliados")
public class AfiliadoController {
	
	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public ResponseEntity<Object> mostrarMensajeCliente() {
		
		return new ResponseEntity<Object>("Cliente", HttpStatus.OK);
	}
}
