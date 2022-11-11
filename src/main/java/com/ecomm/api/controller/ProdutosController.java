package com.ecomm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.api.domain.Produto;
import com.ecomm.api.domain.dto.ProdutosDTO;
import com.ecomm.api.services.ProdutoService;

@CrossOrigin(origins = "http://192.168.18.63:19000", maxAge = 3600)
@RestController
@RequestMapping(value="/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoService service;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping
	public ResponseEntity<List<ProdutosDTO>> findAll() {
		List<Produto> produtos = service.findAll();
		List<ProdutosDTO> converter = ProdutosDTO.converter(produtos);
		
		return ResponseEntity.ok().body(converter);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutosDTO> findById(@PathVariable Integer id) {
		Produto obj = service.findById(id);
		
		return ResponseEntity.ok().body(new ProdutosDTO(obj));
	}
}
