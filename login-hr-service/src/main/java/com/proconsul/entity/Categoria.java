package com.proconsul.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
@SuppressWarnings("serial")
public class Categoria implements Serializable{

	@Id
	@Column(nullable = false, unique = true, length = 50)
	@Size(min = 1, max = 50)
	private String nome;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Tecnologia> tecnologie;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tecnologia> getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(List<Tecnologia> tecnologie) {
		this.tecnologie = tecnologie;
	}

	public Categoria(@Size(min = 1, max = 50) String nome, List<Tecnologia> tecnologie) {
		super();
		this.nome = nome;
		this.tecnologie = tecnologie;
	}

	public Categoria(@Size(min = 1, max = 50) String nome) {
		super();
		this.nome = nome;
	}

	protected Categoria() {
		super();
	}
	
}