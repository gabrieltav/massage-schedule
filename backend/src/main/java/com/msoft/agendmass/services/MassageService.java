package com.msoft.agendmass.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msoft.agendmass.dto.MassageDTO;
import com.msoft.agendmass.entities.Massage;
import com.msoft.agendmass.repositories.MassageRepository;
import com.msoft.agendmass.services.execeptions.DatabaseException;
import com.msoft.agendmass.services.execeptions.ResourceNotFoundException;

@Service
public class MassageService {
	
	@Autowired
	private MassageRepository repository;
	
	@Transactional(readOnly = true)
	public List<MassageDTO> findAll() {
		List<Massage> list = repository.findAll();
		return list.stream().map(x -> new MassageDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public MassageDTO findById(Long id) {
		Optional<Massage> obj = repository.findById(id);
		Massage entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new MassageDTO(entity);
	}
	
	@Transactional
	public MassageDTO insert(MassageDTO dto) {
		Massage entity = new Massage();
		entity.setTitle(dto.getTitle());
		entity.setDescription(dto.getDescription());
		entity.setPrice(dto.getPrice());
		entity.setImgUrl(dto.getImgUrl());
		entity = repository.save(entity);
		return new MassageDTO(entity);
	}
	
	@Transactional
	public MassageDTO update(Long id, MassageDTO dto) {
		try {
			Massage entity = repository.getOne(id);
			entity.setTitle(dto.getTitle());
			entity.setDescription(dto.getDescription());
			entity.setPrice(dto.getPrice());
			entity.setImgUrl(dto.getImgUrl());
			entity = repository.save(entity);
			return new MassageDTO(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " +id);
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

}
