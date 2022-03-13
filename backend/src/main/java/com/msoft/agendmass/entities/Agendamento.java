package com.msoft.agendmass.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Agendamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	private Massage massage;
	
	public Agendamento() {
	}

	public Agendamento(Long id, Instant date, Massage massage) {
		this.id = id;
		this.date = date;
		this.massage = massage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Massage getMassage() {
		return massage;
	}

	public void setMassage(Massage massage) {
		this.massage = massage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(id, other.id);
	}
	
}
