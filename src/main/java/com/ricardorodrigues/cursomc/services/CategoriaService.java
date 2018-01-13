package com.ricardorodrigues.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardorodrigues.cursomc.domain.Categoria;
import com.ricardorodrigues.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Categoria obj = repo.findOne(id);
		return obj;
	}
}