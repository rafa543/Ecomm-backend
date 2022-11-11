package com.ecomm.api.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.ecomm.api.domain.Imagens;
import com.ecomm.api.domain.Produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProdutosDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	@NotNull(message = "O campo PRIORIDADE e requerido")
	private String title;
	@NotNull(message = "O campo STATUS e requerido")
	private String image;
	private List<Imagens> imagens = new ArrayList<>();
	@NotNull(message = "O campo TITULO e requerido")
	private Double preco;
	@NotNull(message = "O campo OBSERVAÇÕES e requerido")
	private Double oldPreco;
	@NotNull(message = "O campo TÉCNICO e requerido")
	private String sizes;
	@NotNull(message = "O campo CLIENTE e requerido")
	private String colors;
	
	public ProdutosDTO(Integer id, @NotNull(message = "O campo PRIORIDADE e requerido") String title,
			@NotNull(message = "O campo STATUS e requerido") String image,
			@NotNull(message = "O campo TITULO e requerido") Double preco,
			@NotNull(message = "O campo OBSERVAÇÕES e requerido") Double oldPreco) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.preco = preco;
		this.oldPreco = oldPreco;
	}


	
	
	public static List<ProdutosDTO> converter(List<Produto> produtos) {
		List<ProdutosDTO> dto  = new ArrayList<>();
		
		for(Produto i: produtos) {
			dto.add(new ProdutosDTO(i.getId(), i.getTitle(), i.getImage(), i.getOldPreco(), i.getPreco()));
		}
		
		return dto;
	}




	public ProdutosDTO(Integer id, @NotNull(message = "O campo PRIORIDADE e requerido") String title,
			@NotNull(message = "O campo STATUS e requerido") String image, List<Imagens> imagens,
			@NotNull(message = "O campo TITULO e requerido") Double preco,
			@NotNull(message = "O campo OBSERVAÇÕES e requerido") Double oldPreco,
			@NotNull(message = "O campo TÉCNICO e requerido") String sizes,
			@NotNull(message = "O campo CLIENTE e requerido") String colors) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.imagens = imagens;
		this.preco = preco;
		this.oldPreco = oldPreco;
		this.sizes = sizes;
		this.colors = colors;
	}




	public ProdutosDTO(Produto obj) {
		this.id = obj.getId();
		this.title = obj.getTitle();
		this.image = obj.getImage();
		this.imagens = obj.getImagens();
		this.preco = obj.getPreco();
		this.oldPreco = obj.getOldPreco();
		this.sizes = obj.getSizes();
		this.colors = obj.getColors();
	}
	
	
	
}
