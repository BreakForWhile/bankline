package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.Lancamento;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface LancamentoCustomRepositoryJPA {

    List<Lancamento> findAllByContaAndDataBetween(Conta conta, LocalDate inicio, LocalDate fim);

    @Query("SELECT l from Lancamento l where l.conta.id = ?1")
    List<Lancamento> findAllByIdConta(Long idConta);



}
