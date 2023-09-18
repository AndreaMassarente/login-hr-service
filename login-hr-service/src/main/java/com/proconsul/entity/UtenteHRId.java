package com.proconsul.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;

@SuppressWarnings("serial")
@Embeddable
public class UtenteHRId implements Serializable{

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

	public UtenteHRId(@Size(min = 1, max = 100) String email, @Size(min = 8) String password) {
		super();
		this.email = email;
		this.password = password;
	}

	protected UtenteHRId() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UtenteHRId other = (UtenteHRId) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password);
	}
	
}