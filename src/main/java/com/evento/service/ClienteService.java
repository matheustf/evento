package com.evento.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.evento.model.Cliente;

@Service
public interface ClienteService {

	Collection<Cliente> buscarClientes();

}
