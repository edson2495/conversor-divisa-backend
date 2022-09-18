package com.edsongreig.conversordivisa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsongreig.conversordivisa.dto.Request;
import com.edsongreig.conversordivisa.dto.Response;
import com.edsongreig.conversordivisa.entity.Conversor;
import com.edsongreig.conversordivisa.repository.IConversorRepository;
import com.edsongreig.conversordivisa.service.IConversorService;

@Service
public class ConversorServiceImpl implements IConversorService {

	@Autowired
	private IConversorRepository conversorRepository;
	
	@Override
	public Response getTipoCambio(Request request) {
		Conversor conversor = conversorRepository.findByMonedaOrigenAndMonedaDestinoAndEstado(request.getMonedaOrigen(), request.getMonedaDestino(), 1);
		Response response = new Response(
				request.getMonto(),
				request.getMonto() * conversor.getTipoCambio(),
				request.getMonedaOrigen(),
				request.getMonedaDestino(),
				conversor.getTipoCambio()
		);
		return response;
	}

	@Override
	public void update(Conversor conversor) {
		conversorRepository.save(conversor);
	}

}
