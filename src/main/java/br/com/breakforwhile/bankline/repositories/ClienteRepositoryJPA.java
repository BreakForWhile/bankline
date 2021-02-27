package br.com.breakforwhile.bankline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.breakforwhile.bankline.models.Cliente;

@Repository
public interface ClienteRepositoryJPA extends JpaRepository<Cliente, Long> {
	
}
