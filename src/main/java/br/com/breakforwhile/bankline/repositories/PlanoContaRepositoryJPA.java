package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.PlanoConta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoContaRepositoryJPA extends JpaRepository<PlanoConta, Long> {

}
