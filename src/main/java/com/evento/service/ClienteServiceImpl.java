package com.evento.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evento.model.Cliente;
import com.evento.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public Collection<Cliente> buscarClientes(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}
}
