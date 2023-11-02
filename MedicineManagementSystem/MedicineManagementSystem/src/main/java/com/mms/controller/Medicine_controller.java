package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.entity.Medicine_entity;
import com.mms.model.Medicine_DTO;
import com.mms.service.Medicine_service;
import com.mms.utility.Converter;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class Medicine_controller {
	
	
	@Autowired
	private Medicine_service Medicine_service;

	@Autowired
	private Converter converter;

	@PostMapping("/createMedicine")
	ResponseEntity<Medicine_DTO> createOrder(@Valid @RequestBody Medicine_DTO MedicineDTO) {

		final Medicine_entity Medicine_entity = converter.convertToMedicineEntity(MedicineDTO);
		return new ResponseEntity<Medicine_DTO>(Medicine_service.registerMedicine(Medicine_entity), HttpStatus.CREATED);
	}

	@PostMapping("/assign/{Medicine_id}/{order_id}")
	public String assignOrderToMedicine(@PathVariable("Medicine_id") int Medicine_id, @PathVariable("order_id") int order_id) {
		return Medicine_service.assigningOrderToMedicine(Medicine_id, order_id);

	}

}
