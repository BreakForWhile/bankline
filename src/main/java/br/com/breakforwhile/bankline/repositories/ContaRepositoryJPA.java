package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepositoryJPA extends JpaRepository<Conta, Long>,  ContaCustomRepositoryJPA{

}

