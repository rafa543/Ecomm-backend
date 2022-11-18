package com.ecomm.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecomm.api.domain.Carrinho;

@Repository
public interface CarrinhoRepository  extends JpaRepository<Carrinho, Integer>{
	
	@Query(value="select car from Carrinho car where car.idUsuario = :id")
	List<Carrinho> buscaFavoritos(Integer id);
}
