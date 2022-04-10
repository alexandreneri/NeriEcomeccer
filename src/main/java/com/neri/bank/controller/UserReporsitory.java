package com.neri.bank.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.neri.bank.model.User;

@Repository
public interface UserReporsitory  extends JpaRepository<User, String> {
	
	public User findByUsername(String username);

}
