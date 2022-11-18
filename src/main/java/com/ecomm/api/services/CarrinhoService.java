package com.ecomm.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.api.domain.Carrinho;
import com.ecomm.api.repositories.CarrinhoRepository;

@Service
public class CarrinhoService {
	
	@Autowired
	CarrinhoRepository repository;
	
	public List<Carrinho> findAll() {
		return repository.findAll();
	}
	
	
	public List<Carrinho> findFavoritos(Integer id) {
		
		return repository.buscaFavoritos(id);
	}
}
