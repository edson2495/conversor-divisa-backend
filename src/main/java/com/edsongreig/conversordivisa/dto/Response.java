package com.edsongreig.conversordivisa.dto;

public class Response {

	private double monto;
	
	private double montoTipoCambio;
	
	private String monedaOrigen;
	
	private String monedaDestino;
	
	private double tipoCambio;

	public Response() {
	}

	public Response(double monto, double montoTipoCambio, String monedaOrigen, String monedaDestino,
			double tipoCambio) {
		this.monto = monto;
		this.montoTipoCambio = montoTipoCambio;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.tipoCambio = tipoCambio;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMontoTipoCambio() {
		return montoTipoCambio;
	}

	public void setMontoTipoCambio(double montoTipoCambio) {
		this.montoTipoCambio = montoTipoCambio;
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

	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	@Override
	public String toString() {
		return "Response [monto=" + monto + ", montoTipoCambio=" + montoTipoCambio + ", monedaOrigen=" + monedaOrigen
				+ ", monedaDestino=" + monedaDestino + ", tipoCambio=" + tipoCambio + "]";
	}
	
}
