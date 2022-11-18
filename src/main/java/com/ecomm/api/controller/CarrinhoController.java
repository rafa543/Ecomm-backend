package com.ecomm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.api.domain.Carrinho;
import com.ecomm.api.domain.dto.CarrinhoDTO;
import com.ecomm.api.services.CarrinhoService;

@RestController
@RequestMapping(value="/carrinho")
public class CarrinhoController {
	
	@Autowired
	CarrinhoService service;
	
	@GetMapping
	public ResponseEntity<List<CarrinhoDTO>> findAll() {
		List<Carrinho> produtos = service.findAll();
		List<CarrinhoDTO> converter = CarrinhoDTO.converter(produtos);
		
		return ResponseEntity.ok().body(converter);
	}
	
	@GetMapping(value="/favoritos/{id}")
	public ResponseEntity<List<Carrinho>> buscaFavoritos(@PathVariable Integer id) {
		List<Carrinho> result = service.findFavoritos(id);
		
		return ResponseEntity.ok().body(result);
	}
	
}
