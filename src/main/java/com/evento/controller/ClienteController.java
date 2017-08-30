package com.evento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evento.model.Cliente;
import com.evento.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping("/")
	public Collection<Cliente> listaConvidados() {
		System.out.println("teste");

		Collection<Cliente> clientes = clienteService.buscarClientes();

		return clientes;
	}
	
	  @RequestMapping(value = "/teste",
	            produces = { MediaType.APPLICATION_JSON_VALUE },
	            method = RequestMethod.GET)
	    public ResponseEntity<Map<String, String>> getContacts() {

	        Map<String, String> dummyData = new HashMap<>();

	        dummyData.put("java-examples",
	                "http://www.leveluplunch.com/java/examples/");
	        dummyData.put("groovy-examples",
	                "http://www.leveluplunch.com/groovy/examples/");

	        return new ResponseEntity<Map<String, String>>(dummyData, HttpStatus.OK);
	    }
}
