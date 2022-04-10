package com.neri.bank.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neri.bank.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>{	
	
	

}
