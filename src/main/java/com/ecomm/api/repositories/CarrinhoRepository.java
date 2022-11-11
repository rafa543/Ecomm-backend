package com.ecomm.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.api.domain.Carrinho;

@Repository
public interface CarrinhoRepository  extends JpaRepository<Carrinho, Integer>{

}
