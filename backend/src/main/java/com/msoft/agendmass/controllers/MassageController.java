package com.msoft.agendmass.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msoft.agendmass.dto.MassageDTO;
import com.msoft.agendmass.services.MassageService;

@RestController
@RequestMapping(value = "/massages")
public class MassageController {
	
	@Autowired
	private MassageService service;
	
	@GetMapping
	public ResponseEntity<List<MassageDTO>> findAll() {
		List<MassageDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
