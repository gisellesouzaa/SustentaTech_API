package com.generation.sustentatech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo tipo é obrigatório")
	@Size(min = 5, max = 255, message = "O atributo tipo deve ter no minimo 05 e no maximo 255 caracteres")
	private String tipo;
	
	@NotBlank(message = "O Atributo descricao é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo título deve ter no minimo 10 e no maximo 1000 caracteres")
	private String descricao;
	
	//GET AND SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
