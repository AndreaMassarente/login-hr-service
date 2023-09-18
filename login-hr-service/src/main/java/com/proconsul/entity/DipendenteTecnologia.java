package com.proconsul.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "dipendente_tecnologia")
@SuppressWarnings("serial")
public class DipendenteTecnologia implements Serializable {

	@EmbeddedId
	private DipendenteTecnologiaId dipendenteTecnologiaId;

	@Column(nullable = false, length = 2)
	@Size(min = 1, max = 2)
	private int esperienza;

	@Column(nullable = false)
	@Size(min = 1)
	private String competenza;

	public DipendenteTecnologiaId getDipendenteTecnologiaId() {
		return dipendenteTecnologiaId;
	}

	public void setDipendenteTecnologiaId(DipendenteTecnologiaId dipendenteTecnologiaId) {
		this.dipendenteTecnologiaId = dipendenteTecnologiaId;
	}

	public int getEsperienza() {
		return esperienza;
	}

	public void setEsperienza(int esperienza) {
		this.esperienza = esperienza;
	}

	public String getCompetenza() {
		return competenza;
	}

	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}
	
	public DipendenteTecnologia(DipendenteTecnologiaId dipendenteTecnologiaId, @Size(min = 1, max = 2) int esperienza,
			@Size(min = 1) String competenza) {
		super();
		this.dipendenteTecnologiaId = dipendenteTecnologiaId;
		this.esperienza = esperienza;
		this.competenza = competenza;
	}

	protected DipendenteTecnologia() {
		super();
	}

}