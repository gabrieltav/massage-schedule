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
import com.msoft.agendmass.dto.SchedulingDTO;
import com.msoft.agendmass.entities.Massage;
import com.msoft.agendmass.entities.Scheduling;
import com.msoft.agendmass.repositories.MassageRepository;
import com.msoft.agendmass.repositories.SchedulingRepository;
import com.msoft.agendmass.services.execeptions.DatabaseException;
import com.msoft.agendmass.services.execeptions.ResourceNotFoundException;

@Service
public class SchedulingService {

	@Autowired
	private SchedulingRepository schedulingRepository;

	@Autowired
	private MassageRepository massageRepository;

	@Transactional(readOnly = true)
	public List<SchedulingDTO> findAll() {
		List<Scheduling> list = schedulingRepository.findAll();
		return list.stream().map(x -> new SchedulingDTO(x, x.getMassages())).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public SchedulingDTO findById(Long id) {
		Optional<Scheduling> obj = schedulingRepository.findById(id);
		Scheduling entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new SchedulingDTO(entity, entity.getMassages());
	}

	@Transactional
	public SchedulingDTO insert(SchedulingDTO dto) {
		Scheduling entity = new Scheduling();
		copyDtoToEntity(dto, entity);
		entity = schedulingRepository.save(entity);
		return new SchedulingDTO(entity, entity.getMassages());
	}

	@Transactional
	public SchedulingDTO update(Long id, SchedulingDTO dto) {
		try {
			Scheduling entity = schedulingRepository.getById(id);
			copyDtoToEntity(dto, entity);
			entity = schedulingRepository.save(entity);
			return new SchedulingDTO(entity, entity.getMassages());
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			schedulingRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	private void copyDtoToEntity(SchedulingDTO dto, Scheduling entity) {
		entity.setDate(dto.getDate());

		entity.getMassages().clear();
		for (MassageDTO massDto : dto.getMassages()) {
			Massage massage = massageRepository.getById(massDto.getId());
			entity.getMassages().add(massage);
		}
	}
}
