package com.proconsul.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
@SuppressWarnings("serial")
public class Dipendente implements Serializable{

	@Id
	@Column(name = "codice_fiscale",length = 16)
	@Size(min = 16, max = 16)
	private String codiceFiscale;
	
	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String nome;
	
	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String cognome;
	
	@Column(length = 100, nullable = false)
	@Size(min = 1, max = 100)
	private String email;
	
	@Column(name = "data_di_nascita", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataDiNascita;
	
	@Column(name = "citta_natale", length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String cittaNatale;
	
	@Column(length = 100, nullable = false)
	@Size(min = 1, max = 100)
	private String indirizzo;
	
	@Column(name = "citta_residenza", length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String cittaResidenza;
	
	@Column(length = 5, nullable = false)
	@Size(min = 5, max = 5)
	private String cap;
	
	@Column(name = "numero_telefonico", length = 12, nullable = false)
	@Size(min = 8, max = 12)
	private String numeroTelefonico;
	
	@OneToMany(mappedBy = "dipendenteTecnologiaId.dipendente")
	private List<DipendenteTecnologia> dipendenti;

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCittaNatale() {
		return cittaNatale;
	}

	public void setCittaNatale(String cittaNatale) {
		this.cittaNatale = cittaNatale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCittaResidenza() {
		return cittaResidenza;
	}

	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public List<DipendenteTecnologia> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<DipendenteTecnologia> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public Dipendente(@Size(min = 16, max = 16) String codiceFiscale, @Size(min = 1, max = 50) String nome,
			@Size(min = 1, max = 50) String cognome, @Size(min = 1, max = 100) String email, Date dataDiNascita,
			@Size(min = 1, max = 50) String cittaNatale, @Size(min = 1, max = 100) String indirizzo,
			@Size(min = 1, max = 50) String cittaResidenza, @Size(min = 5, max = 5) String cap,
			@Size(min = 8, max = 12) String numeroTelefonico, List<DipendenteTecnologia> dipendenti) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataDiNascita = dataDiNascita;
		this.cittaNatale = cittaNatale;
		this.indirizzo = indirizzo;
		this.cittaResidenza = cittaResidenza;
		this.cap = cap;
		this.numeroTelefonico = numeroTelefonico;
		this.dipendenti = dipendenti;
	}
	
	public Dipendente(@Size(min = 16, max = 16) String codiceFiscale, @Size(min = 1, max = 50) String nome,
			@Size(min = 1, max = 50) String cognome, @Size(min = 1, max = 100) String email, Date dataDiNascita,
			@Size(min = 1, max = 50) String cittaNatale, @Size(min = 1, max = 100) String indirizzo,
			@Size(min = 1, max = 50) String cittaResidenza, @Size(min = 5, max = 5) String cap,
			@Size(min = 8, max = 12) String numeroTelefonico) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataDiNascita = dataDiNascita;
		this.cittaNatale = cittaNatale;
		this.indirizzo = indirizzo;
		this.cittaResidenza = cittaResidenza;
		this.cap = cap;
		this.numeroTelefonico = numeroTelefonico;
	}

	protected Dipendente() {
		super();
	}

}