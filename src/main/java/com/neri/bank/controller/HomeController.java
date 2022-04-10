package com.neri.bank.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neri.bank.model.Pedido;
import com.neri.bank.model.StatusPedido;
import com.neri.bank.model.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping
	public String home(Model model, Principal principal) {
		//List<Pedido> pedidos = pedidoRepository.findAll();
		
		//pega o usuario.
		List<Pedido> pedidos = pedidoRepository.findAllByUser(principal.getName());		
		model.addAttribute("pedidos", pedidos);
		return "home";
	}

	@GetMapping("/{status}")
	public String status(@PathVariable("status") String status, Model model) {
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));		
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("status", status);
		return "home";
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}

}
