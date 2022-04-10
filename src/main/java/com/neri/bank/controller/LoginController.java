package com.neri.bank.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neri.bank.model.Pedido;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping
	
    public String home() {		
		return "login";
	}
}
