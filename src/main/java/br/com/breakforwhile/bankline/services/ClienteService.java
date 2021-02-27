package br.com.breakforwhile.bankline.services;

import java.net.URI;
import java.util.List;
import br.com.breakforwhile.bankline.models.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	public Cliente saveAndFlush(Cliente cliente);
}
