package com.edsongreig.conversordivisa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONVERSOR")
public class Conversor {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CONVERSOR", nullable = false)
	private int codigo;
	
	@Column(name = "MONEDA_ORIGEN", nullable = false, length = 50)
	private String monedaOrigen;
	
	@Column(name = "MONEDA_DESTINO", nullable = false, length = 50)
	private String monedaDestino;
	
	@Column(name = "TIPO_CAMBIO", nullable = false)
	private double tipoCambio;
	
	@Column(name = "ESTADO", nullable = false)
	private int estado;

	public Conversor() {
	}

	public Conversor(int codigo, String monedaOrigen, String monedaDestino, double tipoCambio, int estado) {
		this.codigo = codigo;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.tipoCambio = tipoCambio;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Conversor [codigo=" + codigo + ", monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino
				+ ", tipoCambio=" + tipoCambio + ", estado=" + estado + "]";
	}
	
}
