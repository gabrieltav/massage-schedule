package com.msoft.agendmass.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Massage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private MassageService service;
	
	public Massage() {
	}

	public Massage(Long id, MassageService service) {
		this.id = id;
		this.service = service;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MassageService getService() {
		return service;
	}

	public void setService(MassageService service) {
		this.service = service;
	}

}
