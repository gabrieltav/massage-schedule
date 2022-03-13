package com.msoft.agendmass.dto;

import java.util.HashSet;
import java.util.Set;

import com.msoft.agendmass.entities.Scheduling;

public class SchedulingDTO {
	
	private Long id;
	
	Set<MassageDTO> massages = new HashSet<>();
	
	public SchedulingDTO() {
	}

	public SchedulingDTO(Long id) {
		this.id = id;
	}
	
	public SchedulingDTO(Scheduling entity) {
		id = entity.getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<MassageDTO> getMassages() {
		return massages;
	}
	
}
