package com.proconsul.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
@SuppressWarnings("serial")
public class Tecnologia implements Serializable{
	
	@Id
	@Column(length = 50)
	@Size(min = 1, max = 50)
	private String nome;
	
	@ManyToOne
	private Categoria categoria;
	
	@OneToMany(mappedBy = "dipendenteTecnologiaId.tecnologia")
	private List<DipendenteTecnologia> tecnologie;

	public @Size(min = 1, max = 50) @Size(min = 1, max = 50) String getNome() {
		return nome;
	}

	public void setNome(@Size(min = 1, max = 50) @Size(min = 1, max = 50) String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<DipendenteTecnologia> getTecnologie() {
		return tecnologie;
	}

	public void setTecnologie(List<DipendenteTecnologia> tecnologie) {
		this.tecnologie = tecnologie;
	}

	public Tecnologia(@Size(min = 1, max = 50) String nome, Categoria categoria,
			List<DipendenteTecnologia> tecnologie) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.tecnologie = tecnologie;
	}

	protected Tecnologia() {
		super();
	}
	
}