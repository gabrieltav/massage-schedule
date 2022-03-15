package com.msoft.agendmass.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.msoft.agendmass.dto.SchedulingDTO;
import com.msoft.agendmass.services.SchedulingService;

@RestController
@RequestMapping(value = "/schedules")
public class SchedulingController {

	@Autowired
	private SchedulingService schedulingService;

	@GetMapping
	public ResponseEntity<List<SchedulingDTO>> findAll() {
		List<SchedulingDTO> list = schedulingService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<SchedulingDTO> findById(@PathVariable Long id) {
		SchedulingDTO dto = schedulingService.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<SchedulingDTO> insert(@Valid @RequestBody SchedulingDTO dto) {
		dto = schedulingService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<SchedulingDTO> update(@PathVariable Long id, @Valid @RequestBody SchedulingDTO dto) {
		dto = schedulingService.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<SchedulingDTO> delete(@PathVariable Long id) {
		schedulingService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
