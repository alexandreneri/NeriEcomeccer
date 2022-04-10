package com.neri.bank.model.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.neri.bank.model.Usuario;
import com.neri.bank.model.repository.UsuarioRepository;

@Service
public class CrudUsuarioService {

	private UsuarioRepository repository;
	private Boolean system = true;

	public CrudUsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	public void iniciar(Scanner scanner) {
		while (system) {
			System.out.println("Bem vindo ao NeriBank");
			System.out.println("Escolha uma opção");
			System.out.println("0 - SAIR");
			System.out.println("1 - SALVAR");
			System.out.println("2 - ATUALIZAR");
			System.out.println("3 - DELETAR");
			System.out.println("4 - VISUALIZAR");
			System.out.println("5 - VISUALIZAR TODOS");


			int acao = scanner.nextInt();

			switch (acao) {
			case 1:
				salvar(scanner);
				break;
			case 2:
				atualizar(scanner);
				break;				
			case 3:
				deletar(scanner);
				break;				
			case 4:
				visualizar(scanner);
				break;					
			case 5:
				visualizarTodos();
				break;					
			default:
				system = false;
			}
		}
	}

	public void salvar (Scanner scanner) {
		System.out.println("Salvar" );	

		System.out.println("CPF:" );
		String cpf =scanner.next();
		System.out.println("NOME");
		String nome = scanner.next();
		System.out.println("EMAIL");
		String email = scanner.next();	
		Usuario usuario = new Usuario(cpf, nome, email);		
		repository.save(usuario);	
		System.out.println("Salvo");
	}
	
	public void atualizar  (Scanner scanner) {
		System.out.println("Atualizar" );		
		
		System.out.println("CPF:" );
		String cpf =scanner.next();		
		if (repository.findById(cpf).isPresent()) {
			System.out.println("NOME");
			String nome = scanner.next();
			System.out.println("EMAIL");
			String email = scanner.next();	
			Usuario usuario = new Usuario(cpf, nome, email);		
			repository.save(usuario);	
			System.out.println("Atualizado");
		}else {			
			System.out.println("Registro não encontrado");
		}		
	}
	
	public void deletar (Scanner scanner) {
		System.out.println("Deletar" );	
	
		System.out.println("CPF:" );
		String cpf =scanner.next();		
		if (repository.findById(cpf).isPresent()) {
			repository.deleteById(cpf);		
			System.out.println("Deletado");
		}else {			
			System.out.println("Registro não encontrado");
		}			
	}
	
	public void visualizar (Scanner scanner) {
		System.out.println("Pesquisar" );	
	
		System.out.println("CPF: ");
		String cpf =scanner.next();		
		if (repository.findById(cpf).isPresent()) {
			Optional<Usuario> usuario = repository.findById(cpf);
			System.out.println(usuario.toString());
			
		}else {			
			System.out.println("Registro não encontrado");
		}			
	}
	
	public void visualizarTodos () {
		
		Iterable<Usuario> usuarios =  repository.findAll();
		usuarios.forEach(usuario -> System.out.println(usuario));
		System.out.println(" ");
	}
}
