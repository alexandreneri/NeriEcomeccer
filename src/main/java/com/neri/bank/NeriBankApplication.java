package com.neri.bank;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neri.bank.model.Usuario;
import com.neri.bank.model.repository.UsuarioRepository;
import com.neri.bank.model.service.CrudUsuarioService;

@SpringBootApplication
public class NeriBankApplication implements CommandLineRunner {

	//instanciar
	
	private CrudUsuarioService usuarioService;
	
	public NeriBankApplication (CrudUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
		
	
	public static void main(String[] args) {
		SpringApplication.run(NeriBankApplication.class, args);
	}
	
	@Override
	public void run (String...args) {
		Scanner scanner = new Scanner(System.in);		
		usuarioService.iniciar(scanner); 
	  
  }
	
	

}
