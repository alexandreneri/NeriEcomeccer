package com.neri.bank.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeProduto;
	private BigDecimal valorNegocio;
	private LocalDate dataDaEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorNegocio() {
		return valorNegocio;
	}
	public void setValorNegocio(BigDecimal valorNegocio) {
		this.valorNegocio = valorNegocio;
	}
	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}
	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
