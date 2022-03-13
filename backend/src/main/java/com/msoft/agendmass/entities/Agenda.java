package com.msoft.agendmass.entities;

import java.io.Serializable;

public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Agendamento agenda;
	
	public Agenda() {
	}

	public Agenda(Agendamento agenda) {
		this.agenda = agenda;
	}

	public Agendamento getAgenda() {
		return agenda;
	}

	public void setAgenda(Agendamento agenda) {
		this.agenda = agenda;
	}
	
}
