package com.proconsul.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
@SuppressWarnings("serial")
public class DipendenteTecnologiaId implements Serializable{

	@ManyToOne
	@JoinColumn(nullable = false)
	private Dipendente dipendente;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Tecnologia tecnologia;

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	public Tecnologia getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(Tecnologia tecnologia) {
		this.tecnologia = tecnologia;
	}

	public DipendenteTecnologiaId(Dipendente dipendente, Tecnologia tecnologia) {
		super();
		this.dipendente = dipendente;
		this.tecnologia = tecnologia;
	}

	protected DipendenteTecnologiaId() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dipendente, tecnologia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DipendenteTecnologiaId other = (DipendenteTecnologiaId) obj;
		return Objects.equals(dipendente, other.dipendente) && Objects.equals(tecnologia, other.tecnologia);
	}
	
}