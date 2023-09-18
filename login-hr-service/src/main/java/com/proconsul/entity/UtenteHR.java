package com.proconsul.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "utente_hr")
@SuppressWarnings("serial")
public class UtenteHR implements Serializable {

	@EmbeddedId
	private UtenteHRId utenteHRId;

	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String nome;

	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String cognome;

	@Column(nullable = false)
	private boolean utente;

	public UtenteHRId getUtenteHRId() {
		return utenteHRId;
	}

	public void setUtenteHRId(UtenteHRId utenteHRId) {
		this.utenteHRId = utenteHRId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public boolean isUtente() {
		return utente;
	}

	public void setUtente(boolean utente) {
		this.utente = utente;
	}

	public UtenteHR(UtenteHRId utenteHRId, @Size(min = 1, max = 50) String nome,
			@Size(min = 1, max = 50) String cognome, boolean utente) {
		super();
		this.utenteHRId = utenteHRId;
		this.nome = nome;
		this.cognome = cognome;
		this.utente = utente;
	}

	public UtenteHR(UtenteHRId utenteHRId, @Size(min = 1, max = 50) String nome,
			@Size(min = 1, max = 50) String cognome) {
		super();
		this.utenteHRId = utenteHRId;
		this.nome = nome;
		this.cognome = cognome;
	}

	protected UtenteHR() {
		super();
	}

}