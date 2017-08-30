package com.evento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evento.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
}
