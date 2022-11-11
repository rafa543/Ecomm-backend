package com.ecomm.api.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import com.ecomm.api.domain.Carrinho;
import com.ecomm.api.domain.Produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarrinhoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;

	private Integer idUsuario;
	private Integer idProduto;
	private String nome;
	private String image;
	private Double preco;
	private Double oldPreco;
	private Long quant;
	private Long favorito;

	public CarrinhoDTO(Integer id, Integer idUsuario, Integer idProduto, String nome, String image, Double preco,
			Double oldPreco, Long quant, Long favorito) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idProduto = idProduto;
		this.nome = nome;
		this.image = image;
		this.preco = preco;
		this.oldPreco = oldPreco;
		this.quant = quant;
		this.favorito = favorito;
	}

	public static List<CarrinhoDTO> converter(List<Carrinho> produtos) {
		List<CarrinhoDTO> dto = new ArrayList<>();
		for (Carrinho i : produtos) {
			dto.add(new CarrinhoDTO(i.getId(), i.getIdUsuario(), 
					i.getIdProduto(), i.getNome(), i.getImage(), 
					i.getPreco(), i.getOldPreco(), i.getQuant(), i.getFavorito()));
		}

		return dto;
	}

}
