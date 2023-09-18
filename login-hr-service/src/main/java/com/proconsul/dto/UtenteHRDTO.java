package com.proconsul.dto;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

public class UtenteHRDTO implements Serializable{

	@Column(length = 100)
	@Size(min = 1, max = 100)
	private String email;
	
	@Size(min = 8)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	protected UtenteHRDTO() {
	}

	public UtenteHRDTO(@Size(min = 1, max = 100) String email, @Size(min = 8) String password) {
		this.email = email;
		this.password = password;
	}
	
	
}
