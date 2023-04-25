package com.generation.sustentatech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo nome é obrigatório")
	@Size(max = 255, message = "O atributo nome deve ter no maximo 255 caracteres")
	private String nome;
	
	@Email
	@NotBlank(message = "O Atributo usuario é obrigatório")
	@Size(max = 255, message = "O atributo usuario deve ter no maximo 255 caracteres")
	private String usuario;
	
	@NotBlank(message = "O Atributo senha é obrigatório")
	@Size(min = 8, message = "O atributo senha deve ter no minimo 8 caracteres")
	private String senha;
	
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}


