package com.neri.bank.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.neri.bank.model.Pedido;

@Controller
public class HelloControler {
	 
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		Pedido pedido = new Pedido();
		
		pedido.setNomeProduto("Tela Toshiba 32 Pol. 32V35KB Dled HD Smart Vidaa – TB007");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61N02V+KvUL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Tela-Toshiba-32V35KB-Smart-Vidaa/dp/B09JY7DWBF/ref=sr_1_3?adgrpid=128723434535&gclid=CjwKCAjw3cSSBhBGEiwAVII0Z5-PNmamGxqR1L4k9dsmMlB_dp_12OcnjBrvLhffZcrSNzEuVqh98xoCFL8QAvD_BwE&hvadid=552303625601&hvdev=c&hvlocphy=20099&hvnetw=g&hvqmt=b&hvrand=12135410632324154227&hvtargid=kwd-324669369595&hydadcr=28051_11512792&keywords=tv+32+amazon&qid=1649535289&sr=8-3&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		
		
		
		
		
		
		model.addAttribute("nome", "Alexandre");
		return "hello";
	}
	

}
