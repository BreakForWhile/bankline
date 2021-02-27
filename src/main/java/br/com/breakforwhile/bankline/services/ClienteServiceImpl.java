package br.com.breakforwhile.bankline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.breakforwhile.bankline.models.Cliente;
import br.com.breakforwhile.bankline.repositories.ClienteRepositoryJPA;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepositoryJPA clienteRepository;
	
	@Autowired
	public ClienteServiceImpl(ClienteRepositoryJPA clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente saveAndFlush(Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}
	
}
