package com.itb.inf2bm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2bm.comercio.model.Produto;


@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	@GetMapping("/listar")
	public String testProduto() {
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp");
		p1.setPreco(2654.65);
		p1.setCodigoBarras("JFDJAIOJEOHSOA12365415");
		p1.setDescricao("Máquina de Lavar Brastemp 13l com painel digital");
		
		// Adicionando o produto ao array
		
		listaDeProdutos.add(p1);
		
		return "produtos"; // Retorna o nome ao template
		
	}
}
