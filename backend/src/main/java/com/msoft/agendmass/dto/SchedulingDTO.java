package com.msoft.agendmass.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.msoft.agendmass.entities.Massage;
import com.msoft.agendmass.entities.Scheduling;

public class SchedulingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private List<MassageDTO> massages = new ArrayList<>();
	
	public SchedulingDTO() {
	}

	public SchedulingDTO(Long id) {
		this.id = id;
	}
	
	public SchedulingDTO(Scheduling entity, Set<Massage>massages) {
		id = entity.getId();
		massages.forEach(cat -> this.massages.add(new MassageDTO(cat)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<MassageDTO> getMassages() {
		return massages;
	}
	
}
