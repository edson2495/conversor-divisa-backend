package com.edsongreig.conversordivisa.dto;

public class Request {

	private double monto;
	
	private String monedaOrigen;
	
	private String monedaDestino;

	public Request() {
	}

	public Request(double monto, String monedaOrigen, String monedaDestino) {
		this.monto = monto;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	@Override
	public String toString() {
		return "Request [monto=" + monto + ", monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino + "]";
	}
	
}
