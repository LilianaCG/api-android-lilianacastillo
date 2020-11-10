package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Autor;
import com.examen.repository.AutorRepository;

@Service
public class AutorServicelmpl implements AutorService{

	@Autowired
	private AutorRepository repository;
	

	@Override
	public Autor inserta(Autor obj) {
		return repository.save(obj);
	}


	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}
	
}
