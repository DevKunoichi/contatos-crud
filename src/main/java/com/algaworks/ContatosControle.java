package com.algaworks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 

public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static { 
		LISTA_CONTATOS.add(new Contato("1", "Alessandro","+55 16 00000-0000"));
		LISTA_CONTATOS.add(new Contato("2","Andresa","+55 16 11111-1111"));
		LISTA_CONTATOS.add(new Contato("3","Luis","+55 16 22222-2222"));
		LISTA_CONTATOS.add(new Contato("4","Sueli","+55 16 33333-3333"));
		
	}
	
	@GetMapping("/") 
	public String index() {
		return "index"; 
	}
	
	@GetMapping("/contatos") 
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
		
	}

	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		modelAndView.addObject("contato", new Contato());
		
		return modelAndView; 
		
	}
	
  }
