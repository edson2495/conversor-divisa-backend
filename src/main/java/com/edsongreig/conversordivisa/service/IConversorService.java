package com.edsongreig.conversordivisa.service;

import com.edsongreig.conversordivisa.dto.Request;
import com.edsongreig.conversordivisa.dto.Response;
import com.edsongreig.conversordivisa.entity.Conversor;

public interface IConversorService {

	public Response getTipoCambio(Request request);
	
	public void update(Conversor conversor);
	
}
