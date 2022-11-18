package com.ecomm.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.api.domain.Produto;
import com.ecomm.api.repositories.ProdutoRepository;
import com.ecomm.api.services.exceptions.ObjectnotFoundException;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto findById(Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! ID "+ id));
	}
	
	public List<String> findByNome(String nome) {
		
		return produtoRepository.buscaProdutoNome(nome);
	}
}
