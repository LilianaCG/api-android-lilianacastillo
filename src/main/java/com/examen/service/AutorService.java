package com.examen.service;

import java.util.List;

import com.examen.entity.Autor;

public interface AutorService {
	
	public abstract Autor inserta(Autor obj);
	public abstract List<Autor> listaAutor();
	
}
