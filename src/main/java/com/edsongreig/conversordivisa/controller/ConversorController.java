package com.edsongreig.conversordivisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsongreig.conversordivisa.dto.Request;
import com.edsongreig.conversordivisa.dto.Response;
import com.edsongreig.conversordivisa.entity.Conversor;
import com.edsongreig.conversordivisa.service.IConversorService;

@RestController
@RequestMapping(value = "/conversiones")
public class ConversorController {

	@Autowired
	IConversorService conversorService;
	
	@PostMapping(value = "/tipo-cambio", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> getTipoCambio(@RequestBody Request request) throws Exception{
		return new ResponseEntity<Response>(conversorService.getTipoCambio(request), HttpStatus.OK);
	}
	
	@PostMapping(value = "/update-tipo-cambio", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateTipoCambio(@RequestBody Conversor conversor) throws Exception{
		conversorService.update(conversor);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
