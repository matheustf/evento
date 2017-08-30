package com.evento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.gson.annotations.Expose;

@Entity(name="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Expose(serialize = false, deserialize = false)
	private String nome;
	
}
