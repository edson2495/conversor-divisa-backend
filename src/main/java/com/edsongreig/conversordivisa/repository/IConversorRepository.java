package com.edsongreig.conversordivisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsongreig.conversordivisa.entity.Conversor;

public interface IConversorRepository extends JpaRepository<Conversor, Integer> {

	public Conversor findByMonedaOrigenAndMonedaDestinoAndEstado(String monedaOrigen, String monedaDestino, int estado);
	
}
