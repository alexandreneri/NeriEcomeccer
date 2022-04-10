package com.neri.bank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neri.bank.dto.RequisicaoNovoPedido;
import com.neri.bank.model.Pedido;
import com.neri.bank.model.User;
import com.neri.bank.model.repository.PedidoRepository;

@Controller
@RequestMapping("pedido") //nivel da clasee
public class PedidoController {
	
	
	@Autowired
	private PedidoRepository pedidoRepoditory;
	
	@Autowired
	private UserReporsitory userReporsitory;
	
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {		
		return "pedido/formulario";		
	}

	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "pedido/formulario";	
		}		
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();		
		User user = userReporsitory.findByUsername(username);	
		Pedido pedido = requisicao.toPedido();		
		pedido.setUser(user);		
		pedidoRepoditory.save(pedido);	
		
		return "redirect:/home";
		
	}
}
