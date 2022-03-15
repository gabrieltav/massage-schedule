package com.msoft.agendmass.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.msoft.agendmass.entities.Massage;
import com.msoft.agendmass.entities.Scheduling;

public class SchedulingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	
	private List<MassageDTO> massages = new ArrayList<>();
	
	public SchedulingDTO() {
	}

	public SchedulingDTO(Long id, Instant date) {
		this.id = id;
		this.date = date;
	}
	
	public SchedulingDTO(Scheduling entity) {
		id = entity.getId();
		date = entity.getDate();
	}
	
	public SchedulingDTO(Scheduling entity, Set<Massage>massages) {
		this(entity);
		massages.forEach(cat -> this.massages.add(new MassageDTO(cat)));
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

	public List<MassageDTO> getMassages() {
		return massages;
	}

	public void setMassages(List<MassageDTO> massages) {
		this.massages = massages;
	}
	
}
