package com.ecomm.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.api.domain.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}
