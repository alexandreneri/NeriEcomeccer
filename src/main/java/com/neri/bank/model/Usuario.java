package com.neri.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author alexandre
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	private String cpf;
	private String nome;
	private String email;
	
	
	public Usuario() {		
	}
	
	public Usuario(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
		public String toString() {		
			return "Nome  "+this.nome+"  CPF: "+this.cpf;
		}

}
