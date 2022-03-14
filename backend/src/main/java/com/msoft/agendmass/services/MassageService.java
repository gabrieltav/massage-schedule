package com.msoft.agendmass.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msoft.agendmass.dto.MassageDTO;
import com.msoft.agendmass.entities.Massage;
import com.msoft.agendmass.repositories.MassageRepository;

@Service
public class MassageService {
	
	@Autowired
	private MassageRepository repository;
	
	@Transactional(readOnly = true)
	public List<MassageDTO> findAll() {
		List<Massage> list = repository.findAll();
		return list.stream().map(x -> new MassageDTO(x)).collect(Collectors.toList());
	}

}
