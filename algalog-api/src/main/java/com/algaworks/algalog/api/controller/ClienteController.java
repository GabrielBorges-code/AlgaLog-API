package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var  cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Gabriel Borges Lindo");
		cliente1.setTelefone("61 98583-0508");
		cliente1.setEmail("gabriel@gmail.com");
		
		var  cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Camila Felix");
		cliente2.setTelefone("61 99999-8888");
		cliente2.setEmail("camila@gmail.com");
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
