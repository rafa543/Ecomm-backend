package com.ecomm.api.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecomm.api.domain.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

	@Query(value="SELECT p.title FROM ecomm.produto p WHERE p.title LIKE %:nome%", nativeQuery = true)
	List<String> buscaProdutoNome(String nome);

}
