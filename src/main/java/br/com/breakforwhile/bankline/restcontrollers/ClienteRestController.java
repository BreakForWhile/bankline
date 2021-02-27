package br.com.breakforwhile.bankline.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.breakforwhile.bankline.models.Cliente;
import br.com.breakforwhile.bankline.services.ClienteService;

@RestController
@RequestMapping ("/clientes")
public class ClienteRestController {
	
	private ClienteService clienteService;
	
	@Autowired
	public ClienteRestController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping
	public ResponseEntity<?> listAll() {
		return ResponseEntity.ok(clienteService.findAll());
	}
	
	@PostMapping
	@ResponseStatus (HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.saveAndFlush(cliente);
	}
	
//	@GetMapping ("/{id}")
//	public ResponseEntity<?> findById(@RequestParam Long id) {
//		return ResponseEntity.ok(clienteService.findById(id));
//	}
}
