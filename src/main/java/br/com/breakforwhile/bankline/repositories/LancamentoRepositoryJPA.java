package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LancamentoRepositoryJPA extends JpaRepository<Lancamento, Long>, LancamentoCustomRepositoryJPA {

}
